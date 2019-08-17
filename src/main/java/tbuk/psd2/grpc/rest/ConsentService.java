package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;


@GRpcService
public class ConsentService extends com.tbuk.grpc.psd2.ConsentServiceGrpc.ConsentServiceImplBase {

    @Override
    public void created(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
                        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

        responseObserver.onCompleted();

    }

    @Override
    public void revoked(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
                        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

        responseObserver.onCompleted();
    }
}
