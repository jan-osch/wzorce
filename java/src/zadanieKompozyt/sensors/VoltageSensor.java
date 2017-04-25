package zadanieKompozyt.sensors;

import zadanieKompozyt.Sensor;
import zadanieKompozyt.SensorStatus;

public class VoltageSensor extends Sensor {
    private int lowerVoltageLimit;
    private int upperVoltageLimit;
    private String path;

    public VoltageSensor(int lowerVoltageLimit, int upperVoltageLimit, String path) {
        this.lowerVoltageLimit = lowerVoltageLimit;
        this.upperVoltageLimit = upperVoltageLimit;
        this.path = path;
    }

    @Override
    public SensorStatus getStatus() {
        int voltage = super.getValueFromPath(this.path);

        if (voltage > this.upperVoltageLimit) {
            System.out.println("Voltage: " + this.path + " " + voltage + " Critical");
            return SensorStatus.CRITICAL;
        }
        if (voltage < this.lowerVoltageLimit) {
            System.out.println("Voltage: " + this.path + " " + voltage + " Error");
            return SensorStatus.ERROR;
        }

        System.out.println("Voltage: " + this.path + " " + voltage + " Fine");
        return SensorStatus.FINE;
    }
}
