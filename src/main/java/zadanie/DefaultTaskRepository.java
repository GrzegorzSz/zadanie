package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultTaskRepository implements TaskRepository {
    private ArrayList<Task> TaskList;
    public DefaultTaskRepository(ArrayList<Task> TaskList){
        this.TaskList = TaskList;
    }

    @Override
    public Task getExistingTask(int taskID) {
        return null;
    }

    @Override
    public List getAllTasks() {
        return TaskList;
    }
}
