// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: com/ppdai/framework/raptor/proto/helloworld.proto
package com.ppdai.framework.raptor.proto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ppdai.framework.raptor.annotation.RaptorField;
import com.ppdai.framework.raptor.annotation.RaptorMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RaptorMessage(
    version = "version.0.1",
    protoFile = "helloworld"
)
public final class HelloRequest {
  private static final long serialVersionUID = 0L;

  @RaptorField(
      fieldType = "string",
      order = 1,
      name = "name"
  )
  @JsonProperty("name")
  private String name;

  @RaptorField(
      fieldType = "enum",
      order = 2,
      name = "corpus"
  )
  @JsonProperty("corpus")
  private Corpus corpus;

  @RaptorField(
      fieldType = "string",
      order = 3,
      name = "snippets",
      repeated = true
  )
  @JsonProperty("snippets")
  private List<String> snippets;

  @RaptorField(
      fieldType = "message",
      order = 4,
      name = "cats",
      repeated = true
  )
  @JsonProperty("cats")
  private List<Cat> cats;

  @RaptorField(
      fieldType = "message",
      order = 5,
      name = "result"
  )
  @JsonProperty("result")
  private Result result;

  @RaptorField(
      fieldType = "double",
      order = 6,
      name = "tDouble"
  )
  @JsonProperty("tDouble")
  private Double tDouble;

  @RaptorField(
      fieldType = "float",
      order = 7,
      name = "tFloat"
  )
  @JsonProperty("tFloat")
  private Float tFloat;

  @RaptorField(
      fieldType = "int32",
      order = 8,
      name = "tint32"
  )
  @JsonProperty("tint32")
  private Integer tint32;

  @RaptorField(
      fieldType = "int64",
      order = 9,
      name = "tint64"
  )
  @JsonProperty("tint64")
  private Long tint64;

  @RaptorField(
      fieldType = "uint32",
      order = 10,
      name = "tunit32"
  )
  @JsonProperty("tunit32")
  private Integer tunit32;

  @RaptorField(
      fieldType = "uint64",
      order = 11,
      name = "tunit64"
  )
  @JsonProperty("tunit64")
  private Long tunit64;

  @RaptorField(
      fieldType = "sint32",
      order = 12,
      name = "tsint32"
  )
  @JsonProperty("tsint32")
  private Integer tsint32;

  @RaptorField(
      fieldType = "sint64",
      order = 13,
      name = "tsint64"
  )
  @JsonProperty("tsint64")
  private Long tsint64;

  @RaptorField(
      fieldType = "fixed32",
      order = 14,
      name = "tfixed32"
  )
  @JsonProperty("tfixed32")
  private Integer tfixed32;

  @RaptorField(
      fieldType = "fixed64",
      order = 15,
      name = "tfixed64"
  )
  @JsonProperty("tfixed64")
  private Long tfixed64;

  @RaptorField(
      fieldType = "sfixed32",
      order = 16,
      name = "tsfixed32"
  )
  @JsonProperty("tsfixed32")
  private Integer tsfixed32;

  @RaptorField(
      fieldType = "sfixed64",
      order = 17,
      name = "tsfixed64"
  )
  @JsonProperty("tsfixed64")
  private Long tsfixed64;

  @RaptorField(
      fieldType = "bytes",
      order = 18,
      name = "tbytes"
  )
  @JsonProperty("tbytes")
  private byte[] tbytes;

  @RaptorField(
      fieldType = "bool",
      order = 19,
      name = "tbool"
  )
  @JsonProperty("tbool")
  private Boolean tbool;

  @RaptorField(
      fieldType = "message",
      order = 20,
      name = "otherResult"
  )
  @JsonProperty("otherResult")
  private OtherResult otherResult;

  @RaptorField(
      fieldType = "int32",
      order = 201,
      name = "rep_int32",
      repeated = true
  )
  @JsonProperty("rep_int32")
  private List<Integer> repInt32;

  @RaptorField(
      fieldType = "uint32",
      order = 202,
      name = "rep_uint32",
      repeated = true
  )
  @JsonProperty("rep_uint32")
  private List<Integer> repUint32;

  @RaptorField(
      fieldType = "sint32",
      order = 203,
      name = "rep_sint32",
      repeated = true
  )
  @JsonProperty("rep_sint32")
  private List<Integer> repSint32;

  @RaptorField(
      fieldType = "fixed32",
      order = 204,
      name = "rep_fixed32",
      repeated = true
  )
  @JsonProperty("rep_fixed32")
  private List<Integer> repFixed32;

  @RaptorField(
      fieldType = "sfixed32",
      order = 205,
      name = "rep_sfixed32",
      repeated = true
  )
  @JsonProperty("rep_sfixed32")
  private List<Integer> repSfixed32;

  @RaptorField(
      fieldType = "int64",
      order = 206,
      name = "rep_int64",
      repeated = true
  )
  @JsonProperty("rep_int64")
  private List<Long> repInt64;

  @RaptorField(
      fieldType = "uint64",
      order = 207,
      name = "rep_uint64",
      repeated = true
  )
  @JsonProperty("rep_uint64")
  private List<Long> repUint64;

  @RaptorField(
      fieldType = "sint64",
      order = 208,
      name = "rep_sint64",
      repeated = true
  )
  @JsonProperty("rep_sint64")
  private List<Long> repSint64;

  @RaptorField(
      fieldType = "fixed64",
      order = 209,
      name = "rep_fixed64",
      repeated = true
  )
  @JsonProperty("rep_fixed64")
  private List<Long> repFixed64;

  @RaptorField(
      fieldType = "sfixed64",
      order = 210,
      name = "rep_sfixed64",
      repeated = true
  )
  @JsonProperty("rep_sfixed64")
  private List<Long> repSfixed64;

  @RaptorField(
      fieldType = "bool",
      order = 211,
      name = "rep_bool",
      repeated = true
  )
  @JsonProperty("rep_bool")
  private List<Boolean> repBool;

  @RaptorField(
      fieldType = "float",
      order = 212,
      name = "rep_float",
      repeated = true
  )
  @JsonProperty("rep_float")
  private List<Float> repFloat;

  @RaptorField(
      fieldType = "double",
      order = 213,
      name = "rep_double",
      repeated = true
  )
  @JsonProperty("rep_double")
  private List<Double> repDouble;

  @RaptorField(
      fieldType = "string",
      order = 214,
      name = "rep_string",
      repeated = true
  )
  @JsonProperty("rep_string")
  private List<String> repString;

  @RaptorField(
      fieldType = "bytes",
      order = 215,
      name = "rep_bytes",
      repeated = true
  )
  @JsonProperty("rep_bytes")
  private List<byte[]> repBytes;

  @RaptorField(
      fieldType = "message",
      order = 216,
      name = "rep_Result",
      repeated = true
  )
  @JsonProperty("rep_Result")
  private List<Result> repResult;

  @RaptorField(
      fieldType = "int32",
      keyType = "int32",
      order = 501,
      name = "map_int32_int32",
      isMap = true
  )
  @JsonProperty("map_int32_int32")
  private Map<Integer, Integer> mapInt32Int32;

  @RaptorField(
      fieldType = "string",
      keyType = "string",
      order = 502,
      name = "map_string_string",
      isMap = true
  )
  @JsonProperty("map_string_string")
  private Map<String, String> mapStringString;

  @RaptorField(
      fieldType = "com.ppdai.framework.raptor.proto.HelloRequest.Result",
      keyType = "string",
      order = 503,
      name = "map_string_message",
      isMap = true
  )
  @JsonProperty("map_string_message")
  private Map<String, Result> mapStringMessage;

  @RaptorField(
      fieldType = "com.ppdai.framework.raptor.proto.HelloRequest.Corpus",
      keyType = "string",
      order = 504,
      name = "map_string_enum",
      isMap = true
  )
  @JsonProperty("map_string_enum")
  private Map<String, Corpus> mapStringEnum;

  @RaptorField(
      fieldType = "com.ppdai.framework.raptor.proto.Dog",
      keyType = "string",
      order = 505,
      name = "dogMap",
      isMap = true
  )
  @JsonProperty("dogMap")
  private Map<String, Dog> dogMap;

  public HelloRequest() {
  }

  public HelloRequest(String name, Corpus corpus, List<String> snippets, List<Cat> cats,
      Result result, Double tDouble, Float tFloat, Integer tint32, Long tint64, Integer tunit32,
      Long tunit64, Integer tsint32, Long tsint64, Integer tfixed32, Long tfixed64,
      Integer tsfixed32, Long tsfixed64, byte[] tbytes, Boolean tbool, OtherResult otherResult,
      List<Integer> repInt32, List<Integer> repUint32, List<Integer> repSint32,
      List<Integer> repFixed32, List<Integer> repSfixed32, List<Long> repInt64,
      List<Long> repUint64, List<Long> repSint64, List<Long> repFixed64, List<Long> repSfixed64,
      List<Boolean> repBool, List<Float> repFloat, List<Double> repDouble, List<String> repString,
      List<byte[]> repBytes, List<Result> repResult, Map<Integer, Integer> mapInt32Int32,
      Map<String, String> mapStringString, Map<String, Result> mapStringMessage,
      Map<String, Corpus> mapStringEnum, Map<String, Dog> dogMap) {
    this.name = name;
    this.corpus = corpus;
    this.snippets = snippets;
    this.cats = cats;
    this.result = result;
    this.tDouble = tDouble;
    this.tFloat = tFloat;
    this.tint32 = tint32;
    this.tint64 = tint64;
    this.tunit32 = tunit32;
    this.tunit64 = tunit64;
    this.tsint32 = tsint32;
    this.tsint64 = tsint64;
    this.tfixed32 = tfixed32;
    this.tfixed64 = tfixed64;
    this.tsfixed32 = tsfixed32;
    this.tsfixed64 = tsfixed64;
    this.tbytes = tbytes;
    this.tbool = tbool;
    this.otherResult = otherResult;
    this.repInt32 = repInt32;
    this.repUint32 = repUint32;
    this.repSint32 = repSint32;
    this.repFixed32 = repFixed32;
    this.repSfixed32 = repSfixed32;
    this.repInt64 = repInt64;
    this.repUint64 = repUint64;
    this.repSint64 = repSint64;
    this.repFixed64 = repFixed64;
    this.repSfixed64 = repSfixed64;
    this.repBool = repBool;
    this.repFloat = repFloat;
    this.repDouble = repDouble;
    this.repString = repString;
    this.repBytes = repBytes;
    this.repResult = repResult;
    this.mapInt32Int32 = mapInt32Int32;
    this.mapStringString = mapStringString;
    this.mapStringMessage = mapStringMessage;
    this.mapStringEnum = mapStringEnum;
    this.dogMap = dogMap;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name=name;
  }

  public Corpus getCorpus() {
    return this.corpus;
  }

  public void setCorpus(Corpus corpus) {
    this.corpus=corpus;
  }

  public List<String> getSnippets() {
    return this.snippets;
  }

  public void setSnippets(List<String> snippets) {
    this.snippets=snippets;
  }

  public List<Cat> getCats() {
    return this.cats;
  }

  public void setCats(List<Cat> cats) {
    this.cats=cats;
  }

  public Result getResult() {
    return this.result;
  }

  public void setResult(Result result) {
    this.result=result;
  }

  public Double getTDouble() {
    return this.tDouble;
  }

  public void setTDouble(Double tDouble) {
    this.tDouble=tDouble;
  }

  public Float getTFloat() {
    return this.tFloat;
  }

  public void setTFloat(Float tFloat) {
    this.tFloat=tFloat;
  }

  public Integer getTint32() {
    return this.tint32;
  }

  public void setTint32(Integer tint32) {
    this.tint32=tint32;
  }

  public Long getTint64() {
    return this.tint64;
  }

  public void setTint64(Long tint64) {
    this.tint64=tint64;
  }

  public Integer getTunit32() {
    return this.tunit32;
  }

  public void setTunit32(Integer tunit32) {
    this.tunit32=tunit32;
  }

  public Long getTunit64() {
    return this.tunit64;
  }

  public void setTunit64(Long tunit64) {
    this.tunit64=tunit64;
  }

  public Integer getTsint32() {
    return this.tsint32;
  }

  public void setTsint32(Integer tsint32) {
    this.tsint32=tsint32;
  }

  public Long getTsint64() {
    return this.tsint64;
  }

  public void setTsint64(Long tsint64) {
    this.tsint64=tsint64;
  }

  public Integer getTfixed32() {
    return this.tfixed32;
  }

  public void setTfixed32(Integer tfixed32) {
    this.tfixed32=tfixed32;
  }

  public Long getTfixed64() {
    return this.tfixed64;
  }

  public void setTfixed64(Long tfixed64) {
    this.tfixed64=tfixed64;
  }

  public Integer getTsfixed32() {
    return this.tsfixed32;
  }

  public void setTsfixed32(Integer tsfixed32) {
    this.tsfixed32=tsfixed32;
  }

  public Long getTsfixed64() {
    return this.tsfixed64;
  }

  public void setTsfixed64(Long tsfixed64) {
    this.tsfixed64=tsfixed64;
  }

  public byte[] getTbytes() {
    return this.tbytes;
  }

  public void setTbytes(byte[] tbytes) {
    this.tbytes=tbytes;
  }

  public Boolean getTbool() {
    return this.tbool;
  }

  public void setTbool(Boolean tbool) {
    this.tbool=tbool;
  }

  public OtherResult getOtherResult() {
    return this.otherResult;
  }

  public void setOtherResult(OtherResult otherResult) {
    this.otherResult=otherResult;
  }

  public List<Integer> getRepInt32() {
    return this.repInt32;
  }

  public void setRepInt32(List<Integer> repInt32) {
    this.repInt32=repInt32;
  }

  public List<Integer> getRepUint32() {
    return this.repUint32;
  }

  public void setRepUint32(List<Integer> repUint32) {
    this.repUint32=repUint32;
  }

  public List<Integer> getRepSint32() {
    return this.repSint32;
  }

  public void setRepSint32(List<Integer> repSint32) {
    this.repSint32=repSint32;
  }

  public List<Integer> getRepFixed32() {
    return this.repFixed32;
  }

  public void setRepFixed32(List<Integer> repFixed32) {
    this.repFixed32=repFixed32;
  }

  public List<Integer> getRepSfixed32() {
    return this.repSfixed32;
  }

  public void setRepSfixed32(List<Integer> repSfixed32) {
    this.repSfixed32=repSfixed32;
  }

  public List<Long> getRepInt64() {
    return this.repInt64;
  }

  public void setRepInt64(List<Long> repInt64) {
    this.repInt64=repInt64;
  }

  public List<Long> getRepUint64() {
    return this.repUint64;
  }

  public void setRepUint64(List<Long> repUint64) {
    this.repUint64=repUint64;
  }

  public List<Long> getRepSint64() {
    return this.repSint64;
  }

  public void setRepSint64(List<Long> repSint64) {
    this.repSint64=repSint64;
  }

  public List<Long> getRepFixed64() {
    return this.repFixed64;
  }

  public void setRepFixed64(List<Long> repFixed64) {
    this.repFixed64=repFixed64;
  }

  public List<Long> getRepSfixed64() {
    return this.repSfixed64;
  }

  public void setRepSfixed64(List<Long> repSfixed64) {
    this.repSfixed64=repSfixed64;
  }

  public List<Boolean> getRepBool() {
    return this.repBool;
  }

  public void setRepBool(List<Boolean> repBool) {
    this.repBool=repBool;
  }

  public List<Float> getRepFloat() {
    return this.repFloat;
  }

  public void setRepFloat(List<Float> repFloat) {
    this.repFloat=repFloat;
  }

  public List<Double> getRepDouble() {
    return this.repDouble;
  }

  public void setRepDouble(List<Double> repDouble) {
    this.repDouble=repDouble;
  }

  public List<String> getRepString() {
    return this.repString;
  }

  public void setRepString(List<String> repString) {
    this.repString=repString;
  }

  public List<byte[]> getRepBytes() {
    return this.repBytes;
  }

  public void setRepBytes(List<byte[]> repBytes) {
    this.repBytes=repBytes;
  }

  public List<Result> getRepResult() {
    return this.repResult;
  }

  public void setRepResult(List<Result> repResult) {
    this.repResult=repResult;
  }

  public Map<Integer, Integer> getMapInt32Int32() {
    return this.mapInt32Int32;
  }

  public void setMapInt32Int32(Map<Integer, Integer> mapInt32Int32) {
    this.mapInt32Int32=mapInt32Int32;
  }

  public Map<String, String> getMapStringString() {
    return this.mapStringString;
  }

  public void setMapStringString(Map<String, String> mapStringString) {
    this.mapStringString=mapStringString;
  }

  public Map<String, Result> getMapStringMessage() {
    return this.mapStringMessage;
  }

  public void setMapStringMessage(Map<String, Result> mapStringMessage) {
    this.mapStringMessage=mapStringMessage;
  }

  public Map<String, Corpus> getMapStringEnum() {
    return this.mapStringEnum;
  }

  public void setMapStringEnum(Map<String, Corpus> mapStringEnum) {
    this.mapStringEnum=mapStringEnum;
  }

  public Map<String, Dog> getDogMap() {
    return this.dogMap;
  }

  public void setDogMap(Map<String, Dog> dogMap) {
    this.dogMap=dogMap;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HelloRequest)) return false;
    HelloRequest o = (HelloRequest) other;
    return true
        && Objects.equals(name, o.name)
        && Objects.equals(corpus, o.corpus)
        && Objects.equals(snippets, o.snippets)
        && Objects.equals(cats, o.cats)
        && Objects.equals(result, o.result)
        && Objects.equals(tDouble, o.tDouble)
        && Objects.equals(tFloat, o.tFloat)
        && Objects.equals(tint32, o.tint32)
        && Objects.equals(tint64, o.tint64)
        && Objects.equals(tunit32, o.tunit32)
        && Objects.equals(tunit64, o.tunit64)
        && Objects.equals(tsint32, o.tsint32)
        && Objects.equals(tsint64, o.tsint64)
        && Objects.equals(tfixed32, o.tfixed32)
        && Objects.equals(tfixed64, o.tfixed64)
        && Objects.equals(tsfixed32, o.tsfixed32)
        && Objects.equals(tsfixed64, o.tsfixed64)
        && Arrays.equals(tbytes, o.tbytes)
        && Objects.equals(tbool, o.tbool)
        && Objects.equals(otherResult, o.otherResult)
        && Objects.equals(repInt32, o.repInt32)
        && Objects.equals(repUint32, o.repUint32)
        && Objects.equals(repSint32, o.repSint32)
        && Objects.equals(repFixed32, o.repFixed32)
        && Objects.equals(repSfixed32, o.repSfixed32)
        && Objects.equals(repInt64, o.repInt64)
        && Objects.equals(repUint64, o.repUint64)
        && Objects.equals(repSint64, o.repSint64)
        && Objects.equals(repFixed64, o.repFixed64)
        && Objects.equals(repSfixed64, o.repSfixed64)
        && Objects.equals(repBool, o.repBool)
        && Objects.equals(repFloat, o.repFloat)
        && Objects.equals(repDouble, o.repDouble)
        && Objects.equals(repString, o.repString)
        && Objects.equals(repBytes, o.repBytes)
        && Objects.equals(repResult, o.repResult)
        && Objects.equals(mapInt32Int32, o.mapInt32Int32)
        && Objects.equals(mapStringString, o.mapStringString)
        && Objects.equals(mapStringMessage, o.mapStringMessage)
        && Objects.equals(mapStringEnum, o.mapStringEnum)
        && Objects.equals(dogMap, o.dogMap);
  }

  @Override
  public int hashCode() {
    int result_ = 0;
    result_ = result_ * 37 + (name != null ? name.hashCode() : 0);
    result_ = result_ * 37 + (corpus != null ? corpus.hashCode() : 0);
    result_ = result_ * 37 + (snippets != null ? snippets.hashCode() : 0);
    result_ = result_ * 37 + (cats != null ? cats.hashCode() : 0);
    result_ = result_ * 37 + (result != null ? result.hashCode() : 0);
    result_ = result_ * 37 + (tDouble != null ? tDouble.hashCode() : 0);
    result_ = result_ * 37 + (tFloat != null ? tFloat.hashCode() : 0);
    result_ = result_ * 37 + (tint32 != null ? tint32.hashCode() : 0);
    result_ = result_ * 37 + (tint64 != null ? tint64.hashCode() : 0);
    result_ = result_ * 37 + (tunit32 != null ? tunit32.hashCode() : 0);
    result_ = result_ * 37 + (tunit64 != null ? tunit64.hashCode() : 0);
    result_ = result_ * 37 + (tsint32 != null ? tsint32.hashCode() : 0);
    result_ = result_ * 37 + (tsint64 != null ? tsint64.hashCode() : 0);
    result_ = result_ * 37 + (tfixed32 != null ? tfixed32.hashCode() : 0);
    result_ = result_ * 37 + (tfixed64 != null ? tfixed64.hashCode() : 0);
    result_ = result_ * 37 + (tsfixed32 != null ? tsfixed32.hashCode() : 0);
    result_ = result_ * 37 + (tsfixed64 != null ? tsfixed64.hashCode() : 0);
    result_ = result_ * 37 +  Arrays.hashCode(tbytes);;
    result_ = result_ * 37 + (tbool != null ? tbool.hashCode() : 0);
    result_ = result_ * 37 + (otherResult != null ? otherResult.hashCode() : 0);
    result_ = result_ * 37 + (repInt32 != null ? repInt32.hashCode() : 0);
    result_ = result_ * 37 + (repUint32 != null ? repUint32.hashCode() : 0);
    result_ = result_ * 37 + (repSint32 != null ? repSint32.hashCode() : 0);
    result_ = result_ * 37 + (repFixed32 != null ? repFixed32.hashCode() : 0);
    result_ = result_ * 37 + (repSfixed32 != null ? repSfixed32.hashCode() : 0);
    result_ = result_ * 37 + (repInt64 != null ? repInt64.hashCode() : 0);
    result_ = result_ * 37 + (repUint64 != null ? repUint64.hashCode() : 0);
    result_ = result_ * 37 + (repSint64 != null ? repSint64.hashCode() : 0);
    result_ = result_ * 37 + (repFixed64 != null ? repFixed64.hashCode() : 0);
    result_ = result_ * 37 + (repSfixed64 != null ? repSfixed64.hashCode() : 0);
    result_ = result_ * 37 + (repBool != null ? repBool.hashCode() : 0);
    result_ = result_ * 37 + (repFloat != null ? repFloat.hashCode() : 0);
    result_ = result_ * 37 + (repDouble != null ? repDouble.hashCode() : 0);
    result_ = result_ * 37 + (repString != null ? repString.hashCode() : 0);
    result_ = result_ * 37 + (repBytes != null ? repBytes.hashCode() : 0);
    result_ = result_ * 37 + (repResult != null ? repResult.hashCode() : 0);
    result_ = result_ * 37 + (mapInt32Int32 != null ? mapInt32Int32.hashCode() : 0);
    result_ = result_ * 37 + (mapStringString != null ? mapStringString.hashCode() : 0);
    result_ = result_ * 37 + (mapStringMessage != null ? mapStringMessage.hashCode() : 0);
    result_ = result_ * 37 + (mapStringEnum != null ? mapStringEnum.hashCode() : 0);
    result_ = result_ * 37 + (dogMap != null ? dogMap.hashCode() : 0);
    return result_;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (corpus != null) builder.append(", corpus=").append(corpus);
    if (snippets != null  && !snippets.isEmpty()) builder.append(", snippets=").append(snippets);
    if (cats != null  && !cats.isEmpty()) builder.append(", cats=").append(cats);
    if (result != null) builder.append(", result=").append(result);
    if (tDouble != null) builder.append(", tDouble=").append(tDouble);
    if (tFloat != null) builder.append(", tFloat=").append(tFloat);
    if (tint32 != null) builder.append(", tint32=").append(tint32);
    if (tint64 != null) builder.append(", tint64=").append(tint64);
    if (tunit32 != null) builder.append(", tunit32=").append(tunit32);
    if (tunit64 != null) builder.append(", tunit64=").append(tunit64);
    if (tsint32 != null) builder.append(", tsint32=").append(tsint32);
    if (tsint64 != null) builder.append(", tsint64=").append(tsint64);
    if (tfixed32 != null) builder.append(", tfixed32=").append(tfixed32);
    if (tfixed64 != null) builder.append(", tfixed64=").append(tfixed64);
    if (tsfixed32 != null) builder.append(", tsfixed32=").append(tsfixed32);
    if (tsfixed64 != null) builder.append(", tsfixed64=").append(tsfixed64);
    if (tbytes != null) builder.append(", tbytes=").append(tbytes);
    if (tbool != null) builder.append(", tbool=").append(tbool);
    if (otherResult != null) builder.append(", otherResult=").append(otherResult);
    if (repInt32 != null  && !repInt32.isEmpty()) builder.append(", rep_int32=").append(repInt32);
    if (repUint32 != null  && !repUint32.isEmpty()) builder.append(", rep_uint32=").append(repUint32);
    if (repSint32 != null  && !repSint32.isEmpty()) builder.append(", rep_sint32=").append(repSint32);
    if (repFixed32 != null  && !repFixed32.isEmpty()) builder.append(", rep_fixed32=").append(repFixed32);
    if (repSfixed32 != null  && !repSfixed32.isEmpty()) builder.append(", rep_sfixed32=").append(repSfixed32);
    if (repInt64 != null  && !repInt64.isEmpty()) builder.append(", rep_int64=").append(repInt64);
    if (repUint64 != null  && !repUint64.isEmpty()) builder.append(", rep_uint64=").append(repUint64);
    if (repSint64 != null  && !repSint64.isEmpty()) builder.append(", rep_sint64=").append(repSint64);
    if (repFixed64 != null  && !repFixed64.isEmpty()) builder.append(", rep_fixed64=").append(repFixed64);
    if (repSfixed64 != null  && !repSfixed64.isEmpty()) builder.append(", rep_sfixed64=").append(repSfixed64);
    if (repBool != null  && !repBool.isEmpty()) builder.append(", rep_bool=").append(repBool);
    if (repFloat != null  && !repFloat.isEmpty()) builder.append(", rep_float=").append(repFloat);
    if (repDouble != null  && !repDouble.isEmpty()) builder.append(", rep_double=").append(repDouble);
    if (repString != null  && !repString.isEmpty()) builder.append(", rep_string=").append(repString);
    if (repBytes != null  && !repBytes.isEmpty()) builder.append(", rep_bytes=").append(repBytes);
    if (repResult != null  && !repResult.isEmpty()) builder.append(", rep_Result=").append(repResult);
    if (mapInt32Int32 != null  && !mapInt32Int32.isEmpty()) builder.append(", map_int32_int32=").append(mapInt32Int32);
    if (mapStringString != null  && !mapStringString.isEmpty()) builder.append(", map_string_string=").append(mapStringString);
    if (mapStringMessage != null  && !mapStringMessage.isEmpty()) builder.append(", map_string_message=").append(mapStringMessage);
    if (mapStringEnum != null  && !mapStringEnum.isEmpty()) builder.append(", map_string_enum=").append(mapStringEnum);
    if (dogMap != null  && !dogMap.isEmpty()) builder.append(", dogMap=").append(dogMap);
    return builder.replace(0, 2, "HelloRequest{").append('}').toString();
  }

  public enum Corpus {
    UNIVERSAL(0),

    WEB(1),

    IMAGES(2),

    LOCAL(3),

    NEWS(4),

    PRODUCTS(5),

    VIDEO(6);

    private final int value;

    Corpus(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static Corpus fromValue(int value) {
      switch (value) {
        case 0: return UNIVERSAL;
        case 1: return WEB;
        case 2: return IMAGES;
        case 3: return LOCAL;
        case 4: return NEWS;
        case 5: return PRODUCTS;
        case 6: return VIDEO;
        default: return null;
      }
    }

    public int getValue() {
      return value;
    }
  }

  @RaptorMessage(
      version = "version.0.1",
      protoFile = "helloworld"
  )
  public static final class Result {
    private static final long serialVersionUID = 0L;

    @RaptorField(
        fieldType = "string",
        order = 1,
        name = "url"
    )
    @JsonProperty("url")
    private String url;

    @RaptorField(
        fieldType = "enum",
        order = 2,
        name = "corpus"
    )
    @JsonProperty("corpus")
    private Corpus corpus;

    public Result() {
    }

    public Result(String url, Corpus corpus) {
      this.url = url;
      this.corpus = corpus;
    }

    public String getUrl() {
      return this.url;
    }

    public void setUrl(String url) {
      this.url=url;
    }

    public Corpus getCorpus() {
      return this.corpus;
    }

    public void setCorpus(Corpus corpus) {
      this.corpus=corpus;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Result)) return false;
      Result o = (Result) other;
      return true
          && Objects.equals(url, o.url)
          && Objects.equals(corpus, o.corpus);
    }

    @Override
    public int hashCode() {
      int result = 0;
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (corpus != null ? corpus.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (url != null) builder.append(", url=").append(url);
      if (corpus != null) builder.append(", corpus=").append(corpus);
      return builder.replace(0, 2, "Result{").append('}').toString();
    }

    public enum Corpus {
      UNIVERSAL(0),

      WEB(1),

      IMAGES(2),

      LOCAL(3),

      NEWS(4),

      PRODUCTS(5),

      VIDEO(6);

      private final int value;

      Corpus(int value) {
        this.value = value;
      }

      /**
       * Return the constant for {@code value} or null.
       */
      public static Corpus fromValue(int value) {
        switch (value) {
          case 0: return UNIVERSAL;
          case 1: return WEB;
          case 2: return IMAGES;
          case 3: return LOCAL;
          case 4: return NEWS;
          case 5: return PRODUCTS;
          case 6: return VIDEO;
          default: return null;
        }
      }

      public int getValue() {
        return value;
      }
    }
  }
}
