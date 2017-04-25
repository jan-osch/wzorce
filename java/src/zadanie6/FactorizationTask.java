package zadanie6;

public class FactorizationTask extends Task {
    private long subject;

    public FactorizationTask(long subject) {
        this.subject = subject;
    }

    @Override
    void run() {
        System.out.println("Factorization of : " + this.subject);

        if (this.subject < 0) {
            System.out.println("-1");
        } else if (this.subject <= 1) {
            System.out.println(this.subject);
        } else {
            long reference = 2;

            while (reference <= this.subject) {
                while (this.subject % reference == 0) {
                    System.out.println(reference);
                    this.subject = this.subject / reference;
                }

                reference++;
            }
        }
    }
}
