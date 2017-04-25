package zadanie6;

import java.util.ArrayList;
import java.util.List;

public class JobManager {
    private List<Task> tasks;

    public JobManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void startAll() {
        this.tasks.forEach(e -> e.run());
    }
}
