// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/vald/remove.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdRemove {
  private ValdRemove() {}
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
      "\n$vald/apis/proto/v1/vald/remove.proto\022\007" +
      "vald.v1\032#apis/proto/v1/payload/payload.p" +
      "roto\032-github.com/gogo/protobuf/gogoproto" +
      "/gogo.proto\0327github.com/gogo/googleapis/" +
      "google/api/annotations.proto2\237\002\n\006Remove\022" +
      "U\n\006Remove\022\032.payload.v1.Remove.Request\032\033." +
      "payload.v1.Object.Location\"\022\202\323\344\223\002\014\"\007/rem" +
      "ove:\001*\022S\n\014StreamRemove\022\032.payload.v1.Remo" +
      "ve.Request\032!.payload.v1.Object.StreamLoc" +
      "ation\"\000(\0010\001\022i\n\013MultiRemove\022\037.payload.v1." +
      "Remove.MultiRequest\032\034.payload.v1.Object." +
      "Locations\"\033\202\323\344\223\002\025\"\020/remove/multiple:\001*Bg" +
      "\n\032org.vdaas.vald.api.v1.valdB\nValdRemove" +
      "P\001Z\'github.com/vdaas/vald/apis/grpc/v1/v" +
      "ald\310\342\036\001\320\342\036\001\340\342\036\001\300\343\036\001\310\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoRegistration);
    registry.add(com.google.protobuf.GoGoProtos.marshalerAll);
    registry.add(com.google.protobuf.GoGoProtos.messagenameAll);
    registry.add(com.google.protobuf.GoGoProtos.sizerAll);
    registry.add(com.google.protobuf.GoGoProtos.unmarshalerAll);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}