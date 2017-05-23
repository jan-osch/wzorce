package zadanieChainOfResponsibility;

public abstract class RequestHandler {
    protected RequestHandler supervisor;

    public void handle(Request request) {
        if (this.supervisor != null) {
            this.supervisor.handle(request);
        }
    }

    public void setSupervisor(RequestHandler supervisor) {
        this.supervisor = supervisor;
    }
}
