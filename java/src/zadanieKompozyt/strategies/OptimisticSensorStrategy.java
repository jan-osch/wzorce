package zadanieKompozyt.strategies;

import zadanieKompozyt.Sensor;
import zadanieKompozyt.SensorStatus;
import zadanieKompozyt.SensorStrategy;

import java.util.List;

public class OptimisticSensorStrategy extends SensorStrategy {

    @Override
    public SensorStatus compute(List<Sensor> sensors) {
        SensorStatus best = null;

        for (Sensor s : sensors) {
            SensorStatus status = s.getStatus();

            if (best == null) {
                best = status;
            } else if (status.compareTo(best) > 0) {
                best = status;
            }
        }

        return best;
    }
}
