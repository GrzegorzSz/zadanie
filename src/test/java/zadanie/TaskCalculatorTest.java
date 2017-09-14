package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class TaskCalculatorTest {

    TaskList tl;
    private NewTaskCreator newTaskCreator;
    private TaskCalculator taskCalculator;
    private TaskCalculateVerifier taskResultRepository;
    private TaskCalculationDataSetter taskCalculationDataSetter;
    private TaskRepository taskRepository;
    private int id;

    @Before
    public void setup() {
        tl = new TaskList();
        newTaskCreator = new DefaultNewTaskCreator();
        taskCalculator = new DefaultTaskCalculator();
        taskRepository = new DefaultTaskRepository();
        taskCalculationDataSetter = new DefaultTaskCalculationDataSetter();
        id = newTaskCreator.createNewTask("some task");
        Assert.assertTrue(id > 0);

        ArrayList<Double> numList = new ArrayList();
        numList.add(2d);
        numList.add(2d);
        taskCalculationDataSetter.setNumbers(numList, id);
        //taskCalculationDataSetter.setNumbers(Arrays.asList(2d, 2d), id);
        taskCalculationDataSetter.setOperator(Operator.ADD, id);
    }

    @Test
    public void CalculateTest() {
        /*Optional<Double> result = taskResultRepository.getCalculatedTask(id);
        Assert.assertFalse(result.isPresent());

        taskCalculator.calculate(id);
        result = taskResultRepository.getCalculatedTask(id);
        Assert.assertTrue(result.isPresent());
        Assert.assertEquals(4, result.get(), 0);*/

        Optional<Double> result = null;

        taskCalculator.calculate(id);
//        result = Optional.ofNullable(taskRepository.getExistingTask(id).result);
        result = taskRepository.getExistingTask(id);
        Assert.assertTrue(result.isPresent());
        Assert.assertEquals(4, result.get(), 0);
    }
}
