// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/agent/core/agent.proto

package org.vdaas.vald.api.v1.agent.core;

public final class ValdAgent {
  private ValdAgent() {}
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
      "\n)vald/apis/proto/v1/agent/core/agent.pr" +
      "oto\022\007core.v1\032#apis/proto/v1/payload/payl" +
      "oad.proto\032=github.com/googleapis/googlea" +
      "pis/google/api/annotations.proto2\362\002\n\005Age" +
      "nt\022_\n\013CreateIndex\022&.payload.v1.Control.C" +
      "reateIndexRequest\032\021.payload.v1.Empty\"\025\202\323" +
      "\344\223\002\017\022\r/index/create\022F\n\tSaveIndex\022\021.paylo" +
      "ad.v1.Empty\032\021.payload.v1.Empty\"\023\202\323\344\223\002\r\022\013" +
      "/index/save\022m\n\022CreateAndSaveIndex\022&.payl" +
      "oad.v1.Control.CreateIndexRequest\032\021.payl" +
      "oad.v1.Empty\"\034\202\323\344\223\002\026\022\024/index/createandsa" +
      "ve\022Q\n\tIndexInfo\022\021.payload.v1.Empty\032\034.pay" +
      "load.v1.Info.Index.Count\"\023\202\323\344\223\002\r\022\013/index" +
      "/infoB^\n org.vdaas.vald.api.v1.agent.cor" +
      "eB\tValdAgentP\001Z-github.com/vdaas/vald/ap" +
      "is/grpc/v1/agent/coreb\006proto3"
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
