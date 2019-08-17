package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class NotificationService extends com.tbuk.grpc.psd2.NotificationServiceGrpc.NotificationServiceImplBase {

    @Override
    public void notify(com.tbuk.grpc.psd2.NotificationOuterClass.Notification request,
                       io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        responseObserver.onCompleted();

    }

    @Override
    public void deleteNotification(com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request,
                                   io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        responseObserver.onCompleted();
    }
}
