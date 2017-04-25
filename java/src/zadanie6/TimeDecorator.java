package zadanie6;

public class TimeDecorator extends Decorator {
    public TimeDecorator(Task subject) {
        super(subject);
    }

    @Override
    void run() {
        System.out.println();
        System.out.println("TimeDecorator:");

        long start = System.currentTimeMillis();

        this.subject.run();

        long duration = System.currentTimeMillis() - start;
        System.out.println("TimeDecorator: duration: " + duration + " ms");

    }
}
