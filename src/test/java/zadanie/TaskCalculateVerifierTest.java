package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TaskCalculateVerifierTest {

    private NewTaskCreator newTaskCreator;
    private TaskCalculator taskCalculator;
    private TaskCalculationDataSetter dataSetter;
    private TaskCalculateVerifier taskCalculateVerifier;
    int request1, request2, request3, request4;
    ArrayList<Double> numbersForRequests;

    @Before
    public void setup(){

        newTaskCreator = new DefaultNewTaskCreator();
        taskCalculator = new DefaultTaskCalculator();
        taskCalculateVerifier = new DefaultTaskCalculateVerifier();
        dataSetter = new DefaultTaskCalculationDataSetter();
        numbersForRequests = new ArrayList<>();
        numbersForRequests.add(4d);
        numbersForRequests.add(6d);
        numbersForRequests.add(2d);

        request1 = newTaskCreator.createNewTask("req1");
        dataSetter.setNumbers(numbersForRequests, request1);
        dataSetter.setOperator(Operator.ADD, request1);

        request2 = newTaskCreator.createNewTask("req2");
        dataSetter.setNumbers(numbersForRequests, request2);
        dataSetter.setOperator(Operator.SUBTRACT, request2);

        request3 = newTaskCreator.createNewTask("req3");
        dataSetter.setNumbers(numbersForRequests, request3);
        dataSetter.setOperator(Operator.DIVIDE, request3);

        request4 = newTaskCreator.createNewTask("req4");
        dataSetter.setOperator(Operator.MULTIPLY, request4);
        dataSetter.setNumbers(numbersForRequests, request4);
    }


    @Test
    public void getCalculatedTaskTest(){
//        Assert.assertTrue(taskId > 0);
//        return calcTasksList;
        taskCalculator.calculate(request1);
        taskCalculator.calculate(request3);
        taskCalculator.calculate(request4);

        //taskCalculator.calculate(request2);

        Assert.assertTrue(taskCalculateVerifier.getCalculatedTask(request1));
        Assert.assertFalse(taskCalculateVerifier.getCalculatedTask(request2));
        Assert.assertTrue(taskCalculateVerifier.getCalculatedTask(request3));
        Assert.assertTrue(taskCalculateVerifier.getCalculatedTask(request4));
    }
}
