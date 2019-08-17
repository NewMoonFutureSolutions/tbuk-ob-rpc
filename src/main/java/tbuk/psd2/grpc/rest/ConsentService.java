package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GRpcService
public class ConsentService extends com.tbuk.grpc.psd2.ConsentServiceGrpc.ConsentServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsentService.class);
    @Override
    public void created(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
                        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        LOGGER.info("Consent received {}", request);
        responseObserver.onCompleted();

    }

    @Override
    public void revoked(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
                        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        LOGGER.info("Consent revoked {}", request);
        responseObserver.onCompleted();
    }
}
