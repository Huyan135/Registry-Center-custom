package com.ppdai.framework.raptor.codegen.maven;

import com.google.common.collect.Lists;
import com.ppdai.raptor.codegen.java.filter.CodegenFilter;
import com.ppdai.raptor.codegen.java.JavaGenerator;
import com.ppdai.raptor.codegen.java.filter.CodegenFilterFactory;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import com.squareup.wire.schema.*;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author zhangchengxi
 * Date 2018/5/3
 */

@Mojo(name = "proto2java", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class Proto2Java extends AbstractMojo {
    @Parameter(
            property = "protoSourceDirectory",
            defaultValue = "${project.basedir}/src/main/proto")
    private String protoSourceDirectory;

    @Parameter(property = "protoPaths")
    private String[] protoPaths;

    /**
     * List of proto files to compile relative to ${protoPaths}.
     */
    @Parameter(property = "protoFiles", required = true)
    private String[] protoFiles;

    @Parameter(
            property = "generatedSourceDirectory",
            defaultValue = "${project.build.directory}/generated-sources/")
    private String generatedSourceDirectory;

    @Parameter(
            defaultValue = "${project}",
            required = true,
            readonly = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            // TODO: 2018/5/3 检查是否有非空的时候
            if (Objects.nonNull(project)) {
                project.addCompileSourceRoot(generatedSourceDirectory);
            }
            String raptorLocation = JavaGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();

            List<String> directories = protoPaths != null && protoPaths.length > 0
                    ? Arrays.asList(protoPaths)
                    : Lists.newArrayList(protoSourceDirectory, raptorLocation);

            //load schema
            SchemaLoader schemaLoader = new SchemaLoader();
            for (String directory : directories) {
                schemaLoader.addSource(new File(directory));
            }
            if (Objects.nonNull(protoFiles)) {
                for (String proto : protoFiles) {
                    schemaLoader.addProto(proto);
                }
            }

            Schema schema = schemaLoader.load();

            JavaGenerator javaGenerator = JavaGenerator.get(schema);


            CodegenFilter codegenFilter = CodegenFilterFactory.create();
            for (ProtoFile protoFile : schema.protoFiles()) {
                if(codegenFilter.filterByProtoFile(protoFile)){
                    for (Type type : protoFile.types()) {
                        ClassName javaTypeName = javaGenerator.generatedTypeName(type);
                        TypeSpec typeSpec = javaGenerator.generateType(protoFile, type);
                        writeJavaFile(javaTypeName, typeSpec, type.location().withPathOnly());
                    }

                    for (Service service : protoFile.services()) {
                        TypeSpec typeSpec = javaGenerator.generateService(protoFile, service);
                        ClassName typeName = (ClassName) javaGenerator.typeName(service.type());
                        writeJavaFile(typeName, typeSpec, service.location().withPathOnly());
                    }
                }
            }
        } catch (Exception e) {
            throw new MojoExecutionException("Wire Plugin: Failure compiling proto sources.", e);
        }


    }

    private void writeJavaFile(ClassName javaTypeName, TypeSpec typeSpec, Location location)
            throws IOException {
        JavaFile.Builder builder = JavaFile.builder(javaTypeName.packageName(), typeSpec)
                .addFileComment("$L", "Code generated by Wire protocol buffer compiler, do not edit.");
        if (location != null) {
            builder.addFileComment("\nSource file: $L", location);
        }
        JavaFile javaFile = builder.build();
        try {
            javaFile.writeTo(new File(generatedSourceDirectory));
        } catch (IOException e) {
            throw new IOException("Failed to write " + javaFile.packageName + "."
                    + javaFile.typeSpec.name + " to " + generatedSourceDirectory, e);
        }
    }


}
