package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

public class TaskCalculationDataSetterTest {
    String operator;
    ArrayList<Double> numbers;
    Set<String> availibleOperators;
    
    @Before
    public void setup(){
        operator = null;
        numbers = null;
        availibleOperators.add("+");
        availibleOperators.add("-");
        availibleOperators.add("/");
        availibleOperators.add("*");
    }
    
    @Test
    public void getCalculationDataTest(){
        operator = "+";
        Assert.assertNotNull(operator);
        Assert.assertTrue(availibleOperators.contains(operator));

        numbers.add(1.0);
        numbers.add(1.0);
        Assert.assertTrue(numbers.size() > 1);
    }
}
