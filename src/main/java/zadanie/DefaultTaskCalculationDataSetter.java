package zadanie;

import java.util.ArrayList;
import java.util.List;

public class DefaultTaskCalculationDataSetter implements TaskCalculationDataSetter {
    Task task = null;
    @Override
    public void setOperator(Operator operator, int taskId) {

        try {
            task = TaskList.findTaskById(taskId);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return;
        }
        task.operator = operator;
    }

    @Override
    public void setNumbers(List<Double> numbers, int taskId) {
        try {
            task = TaskList.findTaskById(taskId);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return;
        }
        task.numbers = (ArrayList<Double>)numbers;
    }
}
