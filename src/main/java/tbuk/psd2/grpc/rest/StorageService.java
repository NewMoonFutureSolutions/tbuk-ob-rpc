package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class StorageService extends com.tbuk.grpc.psd2.StorageServiceGrpc.StorageServiceImplBase {

    @Override
    public void putEntry(com.tbuk.grpc.psd2.Storage.Entry request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryUpdated> responseObserver) {

        com.tbuk.grpc.psd2.Storage.EntryUpdated entryUpdated=com.tbuk.grpc.psd2.Storage.EntryUpdated.newBuilder().setPrevious("").build();
        responseObserver.onNext(entryUpdated);
        responseObserver.onCompleted();

    }

    @Override
    public void getEntry(com.tbuk.grpc.psd2.Storage.GetEntryRequest request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryResponse> responseObserver) {

        com.tbuk.grpc.psd2.Storage.EntryResponse resp=com.tbuk.grpc.psd2.Storage.EntryResponse.newBuilder().setKey("").setValue("").build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteEntry(com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request,
                            io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

        responseObserver.onCompleted();
    }
}
