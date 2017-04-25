package zadanieKompozyt;

import java.util.ArrayList;
import java.util.List;


public class CompositeSensor extends Sensor {
    private List<Sensor> sensors;
    private SensorStrategy strategy;

    public CompositeSensor(SensorStrategy strategy) {
        this.strategy = strategy;
        this.sensors = new ArrayList<>();
    }

    @Override
    public SensorStatus getStatus() {
        return this.strategy.compute(this.sensors);
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void removeSensor(Sensor sensor) {
        this.sensors.remove(sensor);
    }
}
