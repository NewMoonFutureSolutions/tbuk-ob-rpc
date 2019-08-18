package tbuk.psd2.grcp;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import tbuk.psd2.grpc.client.HelloWorldClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=tbuk.psd2.grpc.app.SpringGrpcApplication.class)
@ComponentScan({"tbuk.psd2.grpc","com.tbuk.grpc"})
public class SpringGrpcApplicationTests {

  @Autowired
  private HelloWorldClient helloWorldClient;

  @Test
  public void testSayHello() {
    assertThat(helloWorldClient.sayHello("John", "Doe"))
        .isEqualTo("Hi John");
  }
}