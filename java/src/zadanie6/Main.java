package zadanie6;

public class Main {
    public static void main(String[] args) {
        JobManager manager = new JobManager();

        manager.addTask(new FactorizationTask(12));
        manager.addTask(new FactorizationTask(1));
        manager.addTask(new SysInfoDecorator(new FactorizationTask(1)));
        manager.addTask(new TimeDecorator(new FactorizationTask(15_485_867)));
        manager.addTask(new DelayDecorator(new FactorizationTask(982_451_653), 5_000)); // very large prime number
        manager.addTask(new TimeDecorator(new DelayDecorator(new FactorizationTask(982_451_653), 5_000))); // very large prime number

        manager.startAll();
    }
}
