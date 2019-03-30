import io.helidon.media.jackson.server.JacksonSupport;
import io.helidon.webserver.*;

public class HelloWorld {

    public static void main(String... args) {

        var routing = Routing
                .builder()
                .register(JacksonSupport.create())
                .get("/api/hello", HelloWorld::sayHi)
                .build();

        var config = ServerConfiguration
                .builder()
                .port(8080)
                .build();

        WebServer
                .create(config, routing)
                .start();
    }

    private static void sayHi(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.send(new HelloResponse("Hello !!!"));
    }


}
