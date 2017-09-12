package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GetCalculatedTest {

    NewTaskCreator createNewTask;
    TaskResultCollector getCalculated;
    TaskCalculationDataSetter getCalculationData;
    TaskCalculator calculateTask;
    ArrayList<Double> numbers = null;
    @Before
    public void setup(){
        createNewTask = null;
        getCalculated = null;
        getCalculationData = null;
        calculateTask = null;
        numbers.add(1.0);
        numbers.add(1.0);
    }

    @Test
    public void getResult(){
        int id = createNewTask.createNewTask("Task1");
        getCalculationData.setOperator(Operator.ADD,1);
        getCalculationData.setNumbers(numbers,1);
        calculateTask.calculate(id);
        //1. create new task
        // 2. add dATA 1 + 1
        // 3. execute

        double result = getCalculated.getResult(id);
        Assert.assertEquals(2,result,0);
    }
}
