package tbuk.psd2.grpc.app;

import io.grpc.Server;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyServerBuilder;
import io.netty.handler.ssl.ClientAuth;
import io.netty.handler.ssl.SslContextBuilder;
import tbuk.psd2.grpc.rest.*;
import tbuk.psd2.grpc.util.CONSTANTS;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;


public class GrpcServer {
    private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    private Server server;
    private final int port;
    private final String certChainFilePath;
    private final String privateKeyFilePath;
    private final String trustCertCollectionFilePath;

    public GrpcServer(int port,
                      String certChainFilePath,
                      String privateKeyFilePath,
                      String trustCertCollectionFilePath) {
        this.port = port;
        this.certChainFilePath = certChainFilePath;
        this.privateKeyFilePath = privateKeyFilePath;
        this.trustCertCollectionFilePath = trustCertCollectionFilePath;
    }

    private SslContextBuilder getSslContextBuilder() {
        SslContextBuilder sslClientContextBuilder = SslContextBuilder.forServer(new File(certChainFilePath),
                new File(privateKeyFilePath));
        sslClientContextBuilder.trustManager(new File(trustCertCollectionFilePath));
        sslClientContextBuilder.clientAuth(ClientAuth.REQUIRE);
        return GrpcSslContexts.configure(sslClientContextBuilder);
    }

    private void start() throws IOException {
        server = NettyServerBuilder.forPort(port)
                .addService(new HelloWorldAPI())
                .addService(new HealthService())
                .addService(new ConsentService())
                .addService(new LinkingService())
                .addService(new NotificationService())
                .addService(new StorageService())
                .addService(new TransferService())
                .addService(new AccountService())
                .sslContext(getSslContextBuilder().build())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                GrpcServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main Application
     */
    public static void main(String[] args) throws IOException, InterruptedException {
            LoadData();
            final GrpcServer server = new GrpcServer(6135,
                    CONSTANTS.certChainFilePath,
                    CONSTANTS.privateKeyFilePath,
                    CONSTANTS.trustCertCollectionFilePath);
        server.start();
        server.blockUntilShutdown();
    }

    private static void LoadData(){
        // Customer 1
        CONSTANTS.INFOMAP.put("customer1.name","Test");
        CONSTANTS.INFOMAP.put("customer1.lastname","User");
        CONSTANTS.INFOMAP.put("customer1.address","");
        // Account 1
        CONSTANTS.INFOMAP.put("customer1.account1.tbukID","08347883");
        CONSTANTS.INFOMAP.put("customer1.account1.sortcode","405198");
        CONSTANTS.INFOMAP.put("customer1.account1.accountNumber","08347883");
        CONSTANTS.INFOMAP.put("customer1.account1.bic","TUBAGB2L");
        CONSTANTS.INFOMAP.put("customer1.account1.iban","GB95TUBA40519808347883");

        //LoadTransactions();
    }


}
