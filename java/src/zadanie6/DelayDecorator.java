package zadanie6;

public class DelayDecorator extends Decorator {
    private long delay;

    public DelayDecorator(Task subject, long delay) {
        super(subject);
        this.delay = delay;
    }

    @Override
    void run() {
        System.out.println();
        System.out.println("DelayDecorator:");
        System.out.println("DelayDecorator: will wait " + this.delay + " ms");

        try {
            Thread.sleep(this.delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.subject.run();
    }
}
