package org.vdaas.vald.api.v1.discoverer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Represent the discoverer service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: vald/apis/proto/v1/discoverer/discoverer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiscovererGrpc {

  private DiscovererGrpc() {}

  public static final String SERVICE_NAME = "discoverer.v1.Discoverer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request,
      org.vdaas.vald.api.v1.payload.Info.Pods> getPodsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pods",
      requestType = org.vdaas.vald.api.v1.payload.Discoverer.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Pods.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request,
      org.vdaas.vald.api.v1.payload.Info.Pods> getPodsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request, org.vdaas.vald.api.v1.payload.Info.Pods> getPodsMethod;
    if ((getPodsMethod = DiscovererGrpc.getPodsMethod) == null) {
      synchronized (DiscovererGrpc.class) {
        if ((getPodsMethod = DiscovererGrpc.getPodsMethod) == null) {
          DiscovererGrpc.getPodsMethod = getPodsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Discoverer.Request, org.vdaas.vald.api.v1.payload.Info.Pods>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pods"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Discoverer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Pods.getDefaultInstance()))
              .setSchemaDescriptor(new DiscovererMethodDescriptorSupplier("Pods"))
              .build();
        }
      }
    }
    return getPodsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request,
      org.vdaas.vald.api.v1.payload.Info.Nodes> getNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Nodes",
      requestType = org.vdaas.vald.api.v1.payload.Discoverer.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Nodes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request,
      org.vdaas.vald.api.v1.payload.Info.Nodes> getNodesMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Discoverer.Request, org.vdaas.vald.api.v1.payload.Info.Nodes> getNodesMethod;
    if ((getNodesMethod = DiscovererGrpc.getNodesMethod) == null) {
      synchronized (DiscovererGrpc.class) {
        if ((getNodesMethod = DiscovererGrpc.getNodesMethod) == null) {
          DiscovererGrpc.getNodesMethod = getNodesMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Discoverer.Request, org.vdaas.vald.api.v1.payload.Info.Nodes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Nodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Discoverer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Nodes.getDefaultInstance()))
              .setSchemaDescriptor(new DiscovererMethodDescriptorSupplier("Nodes"))
              .build();
        }
      }
    }
    return getNodesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscovererStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscovererStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscovererStub>() {
        @java.lang.Override
        public DiscovererStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscovererStub(channel, callOptions);
        }
      };
    return DiscovererStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscovererBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscovererBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscovererBlockingStub>() {
        @java.lang.Override
        public DiscovererBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscovererBlockingStub(channel, callOptions);
        }
      };
    return DiscovererBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscovererFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscovererFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscovererFutureStub>() {
        @java.lang.Override
        public DiscovererFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscovererFutureStub(channel, callOptions);
        }
      };
    return DiscovererFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Represent the discoverer service.
   * </pre>
   */
  public static abstract class DiscovererImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Represent the RPC to get the agent pods information.
     * </pre>
     */
    public void pods(org.vdaas.vald.api.v1.payload.Discoverer.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Pods> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPodsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Represent the RPC to get the node information.
     * </pre>
     */
    public void nodes(org.vdaas.vald.api.v1.payload.Discoverer.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Nodes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNodesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPodsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Discoverer.Request,
                org.vdaas.vald.api.v1.payload.Info.Pods>(
                  this, METHODID_PODS)))
          .addMethod(
            getNodesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Discoverer.Request,
                org.vdaas.vald.api.v1.payload.Info.Nodes>(
                  this, METHODID_NODES)))
          .build();
    }
  }

  /**
   * <pre>
   * Represent the discoverer service.
   * </pre>
   */
  public static final class DiscovererStub extends io.grpc.stub.AbstractAsyncStub<DiscovererStub> {
    private DiscovererStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscovererStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscovererStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the agent pods information.
     * </pre>
     */
    public void pods(org.vdaas.vald.api.v1.payload.Discoverer.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Pods> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPodsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Represent the RPC to get the node information.
     * </pre>
     */
    public void nodes(org.vdaas.vald.api.v1.payload.Discoverer.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Nodes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNodesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Represent the discoverer service.
   * </pre>
   */
  public static final class DiscovererBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiscovererBlockingStub> {
    private DiscovererBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscovererBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscovererBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the agent pods information.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Pods pods(org.vdaas.vald.api.v1.payload.Discoverer.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPodsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the RPC to get the node information.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Nodes nodes(org.vdaas.vald.api.v1.payload.Discoverer.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNodesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Represent the discoverer service.
   * </pre>
   */
  public static final class DiscovererFutureStub extends io.grpc.stub.AbstractFutureStub<DiscovererFutureStub> {
    private DiscovererFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscovererFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscovererFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the agent pods information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Pods> pods(
        org.vdaas.vald.api.v1.payload.Discoverer.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPodsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Represent the RPC to get the node information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Nodes> nodes(
        org.vdaas.vald.api.v1.payload.Discoverer.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PODS = 0;
  private static final int METHODID_NODES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiscovererImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiscovererImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PODS:
          serviceImpl.pods((org.vdaas.vald.api.v1.payload.Discoverer.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Pods>) responseObserver);
          break;
        case METHODID_NODES:
          serviceImpl.nodes((org.vdaas.vald.api.v1.payload.Discoverer.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Nodes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DiscovererBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscovererBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.discoverer.ValdDiscoverer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Discoverer");
    }
  }

  private static final class DiscovererFileDescriptorSupplier
      extends DiscovererBaseDescriptorSupplier {
    DiscovererFileDescriptorSupplier() {}
  }

  private static final class DiscovererMethodDescriptorSupplier
      extends DiscovererBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscovererMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DiscovererGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscovererFileDescriptorSupplier())
              .addMethod(getPodsMethod())
              .addMethod(getNodesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
