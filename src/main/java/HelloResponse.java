import io.helidon.common.reactive.Flow;

public class HelloResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloResponse() {
    }

    public HelloResponse(String message) {
        this.message = message;
    }
}
