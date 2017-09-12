package zadanie;

import java.util.ArrayList;
import java.util.List;

public class DefaultTaskCalculationDataSetter implements TaskCalculationDataSetter {
    Task task = null;
    @Override
    public void setOperator(Operator operator, int taskId) {
        task = TaskList.taskList.get(TaskList.findTaskById(taskId));
        task.operator = operator;
    }

    @Override
    public void setNumbers(List<Double> numbers, int taskId) {
        task = TaskList.taskList.get(TaskList.findTaskById(taskId));
        task.numbers = (ArrayList<Double>)numbers;
    }
}
