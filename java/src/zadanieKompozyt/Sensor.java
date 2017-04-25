package zadanieKompozyt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Sensor {
    public abstract SensorStatus getStatus();

    protected int getValueFromPath(String path) {
        try {
            List<String> strings = Files.lines(Paths.get("data/" + path + ".txt"))
                    .collect(Collectors.toList());

            return Integer.parseInt(strings.get(0));

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
