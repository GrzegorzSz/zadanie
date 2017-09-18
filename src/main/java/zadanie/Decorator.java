package zadanie;

import java.util.List;

public class Decorator implements TaskResultCollector {
    TaskResultCollector taskResultCollector = new DefaultTaskResultCollector();

    @Override
    public double getResult(int taskID) {
        return taskResultCollector.getResult(taskID);
    }
}
