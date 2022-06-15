package org.vdaas.vald.api.v1.manager.index;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Represent the index manager service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: vald/apis/proto/v1/manager/index/index_manager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IndexGrpc {

  private IndexGrpc() {}

  public static final String SERVICE_NAME = "manager.index.v1.Index";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexInfo",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod;
    if ((getIndexInfoMethod = IndexGrpc.getIndexInfoMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexInfoMethod = IndexGrpc.getIndexInfoMethod) == null) {
          IndexGrpc.getIndexInfoMethod = getIndexInfoMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Count.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexInfo"))
              .build();
        }
      }
    }
    return getIndexInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexStub>() {
        @java.lang.Override
        public IndexStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexStub(channel, callOptions);
        }
      };
    return IndexStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexBlockingStub>() {
        @java.lang.Override
        public IndexBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexBlockingStub(channel, callOptions);
        }
      };
    return IndexBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexFutureStub>() {
        @java.lang.Override
        public IndexFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexFutureStub(channel, callOptions);
        }
      };
    return IndexFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Represent the index manager service.
   * </pre>
   */
  public static abstract class IndexImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Represent the RPC to get the index information.
     * </pre>
     */
    public void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIndexInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Empty,
                org.vdaas.vald.api.v1.payload.Info.Index.Count>(
                  this, METHODID_INDEX_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexStub extends io.grpc.stub.AbstractAsyncStub<IndexStub> {
    private IndexStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the index information.
     * </pre>
     */
    public void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexBlockingStub> {
    private IndexBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the index information.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Count indexInfo(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexFutureStub extends io.grpc.stub.AbstractFutureStub<IndexFutureStub> {
    private IndexFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the RPC to get the index information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Count> indexInfo(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IndexImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INDEX_INFO:
          serviceImpl.indexInfo((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count>) responseObserver);
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

  private static abstract class IndexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.manager.index.ValdIndexManager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Index");
    }
  }

  private static final class IndexFileDescriptorSupplier
      extends IndexBaseDescriptorSupplier {
    IndexFileDescriptorSupplier() {}
  }

  private static final class IndexMethodDescriptorSupplier
      extends IndexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexFileDescriptorSupplier())
              .addMethod(getIndexInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
