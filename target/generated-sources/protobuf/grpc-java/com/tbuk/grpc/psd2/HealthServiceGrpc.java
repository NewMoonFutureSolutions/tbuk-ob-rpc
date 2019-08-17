package com.tbuk.grpc.psd2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: health.proto")
public final class HealthServiceGrpc {

  private HealthServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2.HealthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getGetHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHealth",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getGetHealthMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getGetHealthMethod;
    if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
      synchronized (HealthServiceGrpc.class) {
        if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
          HealthServiceGrpc.getGetHealthMethod = getGetHealthMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.HealthService", "getHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new HealthServiceMethodDescriptorSupplier("getHealth"))
                  .build();
          }
        }
     }
     return getGetHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthServiceStub newStub(io.grpc.Channel channel) {
    return new HealthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HealthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHealth(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHealthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHealthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_GET_HEALTH)))
          .build();
    }
  }

  /**
   */
  public static final class HealthServiceStub extends io.grpc.stub.AbstractStub<HealthServiceStub> {
    private HealthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHealth(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthServiceBlockingStub extends io.grpc.stub.AbstractStub<HealthServiceBlockingStub> {
    private HealthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty getHealth(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthServiceFutureStub extends io.grpc.stub.AbstractStub<HealthServiceFutureStub> {
    private HealthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> getHealth(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEALTH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEALTH:
          serviceImpl.getHealth((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class HealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2.Health.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthService");
    }
  }

  private static final class HealthServiceFileDescriptorSupplier
      extends HealthServiceBaseDescriptorSupplier {
    HealthServiceFileDescriptorSupplier() {}
  }

  private static final class HealthServiceMethodDescriptorSupplier
      extends HealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthServiceFileDescriptorSupplier())
              .addMethod(getGetHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
