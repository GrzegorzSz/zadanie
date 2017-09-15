package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TaskCalculationDataSetterTest {
    Operator operator;
    ArrayList<Double> numbers;
    int taskID;
    TaskCalculationDataSetter taskCalculationDataSetter;

    NewTaskCreator newTaskCreator;

    @Before
    public void setup(){

        operator = Operator.ADD;
        numbers = new ArrayList();
        numbers.add(1d);
        numbers.add(1d);
        newTaskCreator = new DefaultNewTaskCreator();
        taskCalculationDataSetter = new DefaultTaskCalculationDataSetter();
        taskID = newTaskCreator.createNewTask("Zadanie testowe");
        System.out.println(taskID);
    }
    
    @Test
    public void setCalculationDataTest(){
        taskCalculationDataSetter.setNumbers(numbers, taskID);
        taskCalculationDataSetter.setOperator(operator, taskID);
        Assert.assertTrue(numbers.size() > 1);
        Assert.assertEquals(DefaultTaskRepository.taskList.get(0).numbers.get(0), numbers.get(0));
        Assert.assertEquals(DefaultTaskRepository.taskList.get(0).numbers.get(1), numbers.get(1));
    }
}
