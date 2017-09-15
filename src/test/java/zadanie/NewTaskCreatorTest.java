package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class NewTaskCreatorTest {

    //todo:
    // 1. junit
    // 2. Adnotacje Java

    private NewTaskCreator createNewTask;
    @Before
    public void setup(){
        createNewTask = new DefaultNewTaskCreator();

    }
    @Test
    public void TaskListExsist(){
        Assert.assertNotNull(DefaultTaskRepository.taskList);
    }
    @Test
    public void newTaskTest(){
        int id = createNewTask.createNewTask("foo");
        System.out.println(DefaultTaskRepository.taskList.get(0).id);
        Assert.assertTrue(id > 0);
    }

    @Test
    public void newTaskTest_manyTasks(){
        int count = 10_000;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<count;i++){
            set.add(createNewTask.createNewTask(UUID.randomUUID().toString()));
        }
//        int id1 = createNewTask.createNewTask("foo");
//        int id2 = createNewTask.createNewTask("foo");
        Assert.assertEquals(count,set.size());


    }
}
