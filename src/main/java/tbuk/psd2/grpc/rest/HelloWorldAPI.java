package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GRpcService
public class HelloWorldAPI extends tbuk.psd2.grpc.rest.HelloWorldServiceGrpc.HelloWorldServiceImplBase {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloWorldAPI.class);
    @Override
    public void sayHello(tbuk.psd2.grpc.rest.HelloWorld.Person request,
                         io.grpc.stub.StreamObserver<tbuk.psd2.grpc.rest.HelloWorld.Greeting> responseObserver) {

        LOGGER.info("server received {}", request);

        tbuk.psd2.grpc.rest.HelloWorld.Greeting greeting=tbuk.psd2.grpc.rest.HelloWorld.Greeting.newBuilder().setMessage("Hi "+request.getFirstName()).build();
        LOGGER.info("server responded {}", greeting);

        responseObserver.onNext(greeting);
        responseObserver.onCompleted();
    }
}
