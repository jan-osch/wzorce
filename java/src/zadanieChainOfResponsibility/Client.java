package zadanieChainOfResponsibility;

import java.util.Random;

public class Client {
    private final Random generator;
    private RequestHandler handler;

    public Client() {
        this.generator = new Random();
    }

    public void generateRandomRequest() {
        Request request = new Request(this.generator.nextInt(3) + 1, this.generator.nextInt(4) + 1);
        System.out.println("");
        System.out.println("New request created, severity: " + request.getSeverity());
        this.handler.handle(request);
    }

    public void setHandler(RequestHandler handler) {
        this.handler = handler;
    }
}
