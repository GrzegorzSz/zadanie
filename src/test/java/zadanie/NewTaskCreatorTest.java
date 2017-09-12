package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewTaskCreatorTest {

    //todo:
    // 1. junit
    // 2. Adnotacje Java

    private NewTaskCreator createNewTask;
    @Before
    public void setup(){
        createNewTask = new DefaultNewTaskCreator();
        TaskList tl = new TaskList();
    }
    @Test
    public void TaskListExsist(){
        Assert.assertNotNull(TaskList.taskList);
    }
    @Test
    public void newTaskTest(){
        int id = createNewTask.createNewTask("foo");
        System.out.println(TaskList.taskList.get(0).id);
        Assert.assertTrue(id > 0);
    }

    @Test
    public void newTaskTest_manyTasks(){
        int id1 = createNewTask.createNewTask("foo");
        int id2 = createNewTask.createNewTask("foo");
        Assert.assertNotEquals(id1,id2);
    }
}
