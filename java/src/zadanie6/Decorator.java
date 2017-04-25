package zadanie6;

public abstract class Decorator extends Task {
    protected Task subject;

    public Decorator(Task subject) {
        this.subject = subject;
    }
}
