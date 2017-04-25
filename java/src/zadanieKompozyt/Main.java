package zadanieKompozyt;

import zadanieKompozyt.sensors.TemperatureSensor;
import zadanieKompozyt.sensors.VoltageSensor;
import zadanieKompozyt.strategies.CommonSenseSensorStrategy;
import zadanieKompozyt.strategies.OptimisticSensorStrategy;
import zadanieKompozyt.strategies.StrictSensorStrategy;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        CompositeSensor system = new CompositeSensor(new StrictSensorStrategy());
        CompositeSensor MBSensors = new CompositeSensor(new CommonSenseSensorStrategy());
        TemperatureSensor temp1 = new TemperatureSensor(50, 100, "temp1");
        MBSensors.addSensor(temp1);
        TemperatureSensor temp2 = new TemperatureSensor(30, 50, "temp2");
        MBSensors.addSensor(temp2);

        CompositeSensor CPUSensors = new CompositeSensor(new StrictSensorStrategy());
        TemperatureSensor cpuTemp = new TemperatureSensor(88, 100, "cpu_temp");
        CPUSensors.addSensor(cpuTemp);
        VoltageSensor cpuV = new VoltageSensor(0, 240, "cpu_v");
        CPUSensors.addSensor(cpuV);

        MBSensors.addSensor(CPUSensors);
        system.addSensor(MBSensors);

        CompositeSensor PSVs = new CompositeSensor(new OptimisticSensorStrategy());
        VoltageSensor psv1V = new VoltageSensor(180, 200, "psv1_v");
        PSVs.addSensor(psv1V);
        VoltageSensor psv2V = new VoltageSensor(100, 200, "psv2_v");
        PSVs.addSensor(psv2V);
        system.addSensor(PSVs);

        TemperatureSensor lanTemp = new TemperatureSensor(10, 221, "LAN_temp");
        system.addSensor(lanTemp);

        Monitor monitor = new Monitor(system);
        monitor.checkEvery(2000); // 2 seconds
    }
}
