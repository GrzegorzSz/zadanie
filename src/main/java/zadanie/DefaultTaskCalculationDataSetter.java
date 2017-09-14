package zadanie;

import java.util.ArrayList;
import java.util.List;

public class DefaultTaskCalculationDataSetter implements TaskCalculationDataSetter {
    Task task = null;
    @Override
    public void setOperator(Operator operator, int taskId) {

        try {
            task = TaskList.findTaskById(taskId);
            task.operator = operator;
        } catch (IllegalArgumentException e) {
//            System.out.println(e);
          e.printStackTrace();
        }

    }

    @Override
    public void setNumbers(List<Double> numbers, int taskId) {
        try {
            task = TaskList.findTaskById(taskId);
            task.numbers = (ArrayList<Double>)numbers;
        } catch (IllegalArgumentException e) {
//            System.out.println(e);
//            return;
            e.printStackTrace();
        }

    }
}
