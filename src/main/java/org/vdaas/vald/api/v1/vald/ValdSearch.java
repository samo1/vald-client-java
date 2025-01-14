// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/vald/search.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdSearch {
  private ValdSearch() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$vald/apis/proto/v1/vald/search.proto\022\007" +
      "vald.v1\032#apis/proto/v1/payload/payload.p" +
      "roto\032=github.com/googleapis/googleapis/g" +
      "oogle/api/annotations.proto2\320\t\n\006Search\022U" +
      "\n\006Search\022\032.payload.v1.Search.Request\032\033.p" +
      "ayload.v1.Search.Response\"\022\202\323\344\223\002\014\"\007/sear" +
      "ch:\001*\022^\n\nSearchByID\022\034.payload.v1.Search." +
      "IDRequest\032\033.payload.v1.Search.Response\"\025" +
      "\202\323\344\223\002\017\"\n/search/id:\001*\022S\n\014StreamSearch\022\032." +
      "payload.v1.Search.Request\032!.payload.v1.S" +
      "earch.StreamResponse\"\000(\0010\001\022Y\n\020StreamSear" +
      "chByID\022\034.payload.v1.Search.IDRequest\032!.p" +
      "ayload.v1.Search.StreamResponse\"\000(\0010\001\022i\n" +
      "\013MultiSearch\022\037.payload.v1.Search.MultiRe" +
      "quest\032\034.payload.v1.Search.Responses\"\033\202\323\344" +
      "\223\002\025\"\020/search/multiple:\001*\022r\n\017MultiSearchB" +
      "yID\022!.payload.v1.Search.MultiIDRequest\032\034" +
      ".payload.v1.Search.Responses\"\036\202\323\344\223\002\030\"\023/s" +
      "earch/id/multiple:\001*\022a\n\014LinearSearch\022\032.p" +
      "ayload.v1.Search.Request\032\033.payload.v1.Se" +
      "arch.Response\"\030\202\323\344\223\002\022\"\r/linearsearch:\001*\022" +
      "j\n\020LinearSearchByID\022\034.payload.v1.Search." +
      "IDRequest\032\033.payload.v1.Search.Response\"\033" +
      "\202\323\344\223\002\025\"\020/linearsearch/id:\001*\022Y\n\022StreamLin" +
      "earSearch\022\032.payload.v1.Search.Request\032!." +
      "payload.v1.Search.StreamResponse\"\000(\0010\001\022_" +
      "\n\026StreamLinearSearchByID\022\034.payload.v1.Se" +
      "arch.IDRequest\032!.payload.v1.Search.Strea" +
      "mResponse\"\000(\0010\001\022u\n\021MultiLinearSearch\022\037.p" +
      "ayload.v1.Search.MultiRequest\032\034.payload." +
      "v1.Search.Responses\"!\202\323\344\223\002\033\"\026/linearsear" +
      "ch/multiple:\001*\022~\n\025MultiLinearSearchByID\022" +
      "!.payload.v1.Search.MultiIDRequest\032\034.pay" +
      "load.v1.Search.Responses\"$\202\323\344\223\002\036\"\031/linea" +
      "rsearch/id/multiple:\001*BS\n\032org.vdaas.vald" +
      ".api.v1.valdB\nValdSearchP\001Z\'github.com/v" +
      "daas/vald/apis/grpc/v1/valdb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
