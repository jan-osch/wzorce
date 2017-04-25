package zadanieKompozyt;

import java.util.List;

public abstract class SensorStrategy {

    abstract public SensorStatus compute(List<Sensor> sensors);
}
