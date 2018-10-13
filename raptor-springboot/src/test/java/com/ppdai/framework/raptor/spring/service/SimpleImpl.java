package com.ppdai.framework.raptor.spring.service;

import com.ppdai.framework.raptor.proto.HelloReply;
import com.ppdai.framework.raptor.proto.HelloRequest;
import com.ppdai.framework.raptor.proto.Simple;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author yinzuolong
 */
@RestController
public class SimpleImpl implements Simple {

    @Override
    public HelloReply sayHello(HelloRequest request) {
        String hello = "Hello " + request.getName();
        return new HelloReply(hello, 123, request, new HashMap<>());
    }

}
