package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class NotificationService extends com.tbuk.grpc.psd2.NotificationServiceGrpc.NotificationServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    @Override
    public void notify(com.tbuk.grpc.psd2.NotificationOuterClass.Notification request,
                       io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

        LOGGER.info("Notification received {}", request);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteNotification(com.tbuk.grpc.psd2.NotificationOuterClass.DeleteNotificationRequest request,
                                   io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        LOGGER.info("Notification received {}", request);
        responseObserver.onCompleted();
    }
}
