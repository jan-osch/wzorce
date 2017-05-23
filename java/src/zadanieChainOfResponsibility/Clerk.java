package zadanieChainOfResponsibility;

public class Clerk extends RequestHandler {

    private int competenceLevel;

    public Clerk(int competenceLevel) {
        this.competenceLevel = competenceLevel;
    }

    @Override
    public void handle(Request request) {
        if (request.getSeverity() <= this.competenceLevel) {
            System.out.println("Clerk: I can solve this request");
            request.solve();
        } else if (this.supervisor != null) {
            System.out.println("Clerk: this request is to severe, please go to my supervisor");
            this.supervisor.handle(request);
        } else {
            System.out.println("Clerk: I am sorry but the system does not allow such request, we cannot help you");
            request.drop();
        }
    }
}
