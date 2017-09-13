package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultTaskRepository implements TaskRepository {
    Task task;
    public DefaultTaskRepository(){
        task = null;
    }

    @Override
    public Task getExistingTask(int taskID) {
        try {
            task = TaskList.findTaskById(taskID);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e);
            task = new Task(1, "error");
        }
        return task;
    }

    @Override
    public List getAllTasks() {
        return TaskList.taskList;
    }
}
