package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TaskResultCollectorTest {

    TaskList tl;
    NewTaskCreator newTaskCreator;
    TaskResultCollector taskResultCollector;
    TaskCalculationDataSetter taskCalculationDataSetter;
    TaskCalculator taskCalculator;
    ArrayList<Double> numbers = null;
    @Before
    public void setup(){
        tl = new TaskList();
        newTaskCreator = new DefaultNewTaskCreator();
        taskResultCollector = new DefaultTaskResultCollector();
        taskCalculationDataSetter = new DefaultTaskCalculationDataSetter();
        taskCalculator = new DefaultTaskCalculator();
        numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(1.0);
    }

    @Test
    public void getResult(){
        int id = newTaskCreator.createNewTask("Task1");
        taskCalculationDataSetter.setOperator(Operator.ADD, id);
        taskCalculationDataSetter.setNumbers(numbers,id);
        taskCalculator.calculate(id);
        //1. create new task
        // 2. add dATA 1 + 1
        // 3. execute

        double result = taskResultCollector.getResult(id);
        Assert.assertEquals(2,result,0);
    }
}
