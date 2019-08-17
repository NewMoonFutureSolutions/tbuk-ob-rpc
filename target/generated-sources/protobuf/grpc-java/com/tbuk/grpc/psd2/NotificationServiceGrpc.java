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
    comments = "Source: notification.proto")
public final class NotificationServiceGrpc {

  private NotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2.NotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.Notification,
      com.google.protobuf.Empty> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notify",
      requestType = com.tbuk.grpc.psd2.NotificationOuterClass.Notification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.Notification,
      com.google.protobuf.Empty> getNotifyMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.Notification, com.google.protobuf.Empty> getNotifyMethod;
    if ((getNotifyMethod = NotificationServiceGrpc.getNotifyMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getNotifyMethod = NotificationServiceGrpc.getNotifyMethod) == null) {
          NotificationServiceGrpc.getNotifyMethod = getNotifyMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.NotificationOuterClass.Notification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.NotificationService", "notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.NotificationOuterClass.Notification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("notify"))
                  .build();
          }
        }
     }
     return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest,
      com.google.protobuf.Empty> getDeleteNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteNotification",
      requestType = com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest,
      com.google.protobuf.Empty> getDeleteNotificationMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest, com.google.protobuf.Empty> getDeleteNotificationMethod;
    if ((getDeleteNotificationMethod = NotificationServiceGrpc.getDeleteNotificationMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteNotificationMethod = NotificationServiceGrpc.getDeleteNotificationMethod) == null) {
          NotificationServiceGrpc.getDeleteNotificationMethod = getDeleteNotificationMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.NotificationService", "deleteNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("deleteNotification"))
                  .build();
          }
        }
     }
     return getDeleteNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServiceStub newStub(io.grpc.Channel channel) {
    return new NotificationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notify(com.tbuk.grpc.psd2.NotificationOuterClass.Notification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotification(com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.NotificationOuterClass.Notification,
                com.google.protobuf.Empty>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            getDeleteNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationServiceStub extends io.grpc.stub.AbstractStub<NotificationServiceStub> {
    private NotificationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void notify(com.tbuk.grpc.psd2.NotificationOuterClass.Notification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotification(com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationServiceBlockingStub extends io.grpc.stub.AbstractStub<NotificationServiceBlockingStub> {
    private NotificationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty notify(com.tbuk.grpc.psd2.NotificationOuterClass.Notification request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNotification(com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationServiceFutureStub extends io.grpc.stub.AbstractStub<NotificationServiceFutureStub> {
    private NotificationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> notify(
        com.tbuk.grpc.psd2.NotificationOuterClass.Notification request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNotification(
        com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY = 0;
  private static final int METHODID_DELETE_NOTIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY:
          serviceImpl.notify((com.tbuk.grpc.psd2.NotificationOuterClass.Notification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION:
          serviceImpl.deleteNotification((com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest) request,
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

  private static abstract class NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2.NotificationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationService");
    }
  }

  private static final class NotificationServiceFileDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier {
    NotificationServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationServiceMethodDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServiceFileDescriptorSupplier())
              .addMethod(getNotifyMethod())
              .addMethod(getDeleteNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
