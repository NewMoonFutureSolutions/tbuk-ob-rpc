package tbuk.psd2.grpc.client;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import tbuk.psd2.grpc.rest.HelloWorld;
import tbuk.psd2.grpc.rest.HelloWorldServiceGrpc;

@Component
public class HelloWorldClient {

  private static final Logger LOGGER =
          LoggerFactory.getLogger(HelloWorldClient.class);

  private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

  @PostConstruct
  private void init() {
    ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 6135).usePlaintext().build();

    helloWorldServiceBlockingStub =
            HelloWorldServiceGrpc.newBlockingStub(managedChannel);
  }

  public String sayHello(String firstName, String lastName) {
    HelloWorld.Person person = HelloWorld.Person.newBuilder().setFirstName(firstName)
            .setLastName(lastName).build();
    LOGGER.info("client sending {}", person);

    HelloWorld.Greeting greeting =
            helloWorldServiceBlockingStub.sayHello(person);
    LOGGER.info("client received {}", greeting);

    return greeting.getMessage();
  }
}