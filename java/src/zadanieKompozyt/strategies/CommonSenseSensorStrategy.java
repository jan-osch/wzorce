package zadanieKompozyt.strategies;

import zadanieKompozyt.Sensor;
import zadanieKompozyt.SensorStatus;
import zadanieKompozyt.SensorStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class CommonSenseSensorStrategy extends SensorStrategy {

    @Override
    public SensorStatus compute(List<Sensor> sensors) {
        List<SensorStatus> statuses = sensors.stream().map(e -> e.getStatus()).collect(Collectors.toList());

        if (this.checkAllAreEqual(statuses)) {
            return statuses.get(0);
        }

        SensorStatus worst = statuses.get(0);

        for (Sensor s : sensors) {
            SensorStatus status = s.getStatus();

            if (status.compareTo(worst) < 0) {
                worst = status;
            }
        }

        return getStatusOneBetter(worst);
    }

    private boolean checkAllAreEqual(List<SensorStatus> statuses) {
        SensorStatus previous = statuses.get(0);

        for (SensorStatus s : statuses) {
            if (s.compareTo(previous) != 0) {
                return false;
            }
        }

        return true;
    }

    private SensorStatus getStatusOneBetter(SensorStatus worst) {
        switch (worst) {
            case DEAD:
                return SensorStatus.CRITICAL;
            case CRITICAL:
                return SensorStatus.ERROR;
            case ERROR:
                return SensorStatus.WARNING;
            case WARNING:
                return SensorStatus.FINE;
            default:
                return SensorStatus.FINE;
        }
    }
}
