package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

public class TaskCalculatorTest {

    private NewTaskCreator newTaskCreator;
    private TaskCalculator taskCalculator;
    private TaskResultRepository taskResultRepository;
    private TaskCalculationDataSetter taskCalculationDataSetter;
    private int id;

    @Before
    public void setup() {
        newTaskCreator = null;
        taskCalculator = null;
        id = newTaskCreator.createNewTask("some task");
        Assert.assertTrue(id > 0);

        taskCalculationDataSetter.setNumbers(Arrays.asList(2d, 2d), id);
        taskCalculationDataSetter.setOperator(Operator.ADD, id);
    }

    @Test
    public void CalculateTest() {
        Optional<Double> result = taskResultRepository.getCalculatedTask(id);
        Assert.assertFalse(result.isPresent());

        taskCalculator.calculate(id);
        result = taskResultRepository.getCalculatedTask(id);
        Assert.assertTrue(result.isPresent());
        Assert.assertEquals(4, result.get(), 0);
    }
}
