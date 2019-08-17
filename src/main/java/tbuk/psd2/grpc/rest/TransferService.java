package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class TransferService extends com.tbuk.grpc.psd2Transfer.TransferServiceGrpc.TransferServiceImplBase {

    @Override
    public void transfer(com.tbuk.grpc.psd2Transfer.Transfer.TransferRequest request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Transfer.Transfer.TransferResponse> responseObserver) {

    }

    @Override
    public void transferStatus(com.tbuk.grpc.psd2Transfer.Transfer.PaymentStatusRequest request,
                               io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Transfer.Transfer.TransferResponse> responseObserver) {

    }

}
