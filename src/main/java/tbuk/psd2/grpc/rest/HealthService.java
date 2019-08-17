package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;


@GRpcService
public class HealthService extends com.tbuk.grpc.psd2.HealthServiceGrpc.HealthServiceImplBase {

    @Override
    public void getHealth(com.google.protobuf.Empty request,
                          io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        responseObserver.onCompleted();
    }

}
