package zadanie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class TaskRepositoryTest {
    private NewTaskCreator taskCreator;
    private ArrayList<Task> foundTask;
    TaskRepository taskRepository;
    int zadanie1;
    int zadanie2;
    TaskList tl;
    
    @Before
    public void setup(){
        tl = new TaskList();
        taskCreator = new DefaultNewTaskCreator();
        taskRepository = new DefaultTaskRepository();
        zadanie1 = taskCreator.createNewTask("zadanie1");
        zadanie2 = taskCreator.createNewTask("zadanie2");
        System.out.println("zad1 id: " + zadanie1);
        System.out.println("zad2 id: " + zadanie2);
    }
    @Test
    public void getExistingTask(){
//        Task sometask = (taskRepository.getExistingTask(zadanie1).get()).orElse(null);    ????
        Optional<Task> task = taskRepository.getExistingTask(zadanie1);
        Assert.assertTrue(task.isPresent());
        Optional<Task> task1 = taskRepository.getExistingTask(zadanie2);
        Assert.assertTrue(task1.isPresent());
        Assert.assertTrue(task.get().id > 0);
        Assert.assertTrue(task1.get().id >0);
        Assert.assertTrue("tasks are not the same obj", task.get().id != task1.get().id);
    }

    @Test
    public void testTaskNotFound(){
        Optional task  = taskRepository.getExistingTask(1);
        Assert.assertFalse(task.isPresent());
    }
    @Test
    public void getAllTasks(){
        ArrayList<Task> allTasks = (ArrayList<Task>) taskRepository.getAllTasks();
        for (Task task : allTasks
             ) {
            System.out.println("get all "+task.id);
        }
    }
}
