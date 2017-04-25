package zadanieKompozyt;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private Sensor sensor;
    private ScheduledExecutorService executor;

    public Monitor(Sensor sensor) {
        this.sensor = sensor;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public void checkEvery(long interval) {
        Sensor sensor = this.sensor;
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println();
                System.out.println(sensor.getStatus());
                System.out.println();
            }
        }, 0, interval, TimeUnit.MILLISECONDS);
    }

    public void stop() {
        this.executor.shutdown();
    }
}
