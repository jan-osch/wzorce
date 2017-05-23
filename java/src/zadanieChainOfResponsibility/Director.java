package zadanieChainOfResponsibility;

public class Director extends RequestHandler {
    @Override
    public void handle(Request request) {
        System.out.println("I am very busy, but I will solve this request");
        request.solve();
    }
}
