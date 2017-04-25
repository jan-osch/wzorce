package zadanieKompozyt.sensors;

import zadanieKompozyt.Sensor;
import zadanieKompozyt.SensorStatus;

public class TemperatureSensor extends Sensor {
    private int warningTemperatureLimit;
    private int criticalTemperatureLimit;
    private String path;

    public TemperatureSensor(int warningLimit, int criticalLimit, String path) {
        this.warningTemperatureLimit = warningLimit;
        this.criticalTemperatureLimit = criticalLimit;
        this.path = path;
    }

    @Override
    public SensorStatus getStatus() {
        int temperature = super.getValueFromPath(this.path);

        if (temperature > this.criticalTemperatureLimit) {
            System.out.println("Temp: " + this.path + " " + temperature + " Critical");
            return SensorStatus.CRITICAL;
        }
        if (temperature > this.warningTemperatureLimit) {
            System.out.println("Temp: " + this.path + " " + temperature + " Warning");
            return SensorStatus.WARNING;
        }

        System.out.println("Temp: " + this.path + " " + temperature + " Fine");
        return SensorStatus.FINE;
    }
}
