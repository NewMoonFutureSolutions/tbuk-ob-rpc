package tbuk.psd2.grpc.app;

import tbuk.psd2.grpc.client.HelloWorldClient;

public class TestApp {
    public static void main(String[] args) {

        HelloWorldClient client=new HelloWorldClient();
        System.out.println(client.sayHello("Bora","Uzun"));
    }
}
