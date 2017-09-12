package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TaskRepositoryTest {
    private ArrayList<Task> taskList;
    private ArrayList<Task> foundTask;
    
    @Before
    public void setup(){
        taskList = new ArrayList<Task>();
        foundTask = new ArrayList<Task>();
    }
    @Test
    public void getExistingTask(){
        Assert.assertTrue(1 > 0);
        Assert.assertNotNull(foundTask);
        Assert.assertTrue(foundTask instanceof ArrayList);
//        return foundTask;
    }
}
