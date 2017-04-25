package zadanieKompozyt.strategies;

import zadanieKompozyt.Sensor;
import zadanieKompozyt.SensorStatus;
import zadanieKompozyt.SensorStrategy;

import java.util.List;

public class StrictSensorStrategy extends SensorStrategy {

    @Override
    public SensorStatus compute(List<Sensor> sensors) {
        SensorStatus worst = sensors.get(0).getStatus();

        for (Sensor s : sensors) {
            SensorStatus status = s.getStatus();
            if (status.compareTo(worst) < 0) {
                worst = status;
            }
        }

        return worst;
    }
}
