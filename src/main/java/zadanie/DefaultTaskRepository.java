package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultTaskRepository implements TaskRepository {
//    Task task;

//    public DefaultTaskRepository(){
//        task = null;
//    }

    // todo:
    // 1. Optional?
    // 2. throw exception?

    @Override
    public Optional<Task> getExistingTask(int taskID) {
        /*try {
          return TaskList.findTaskById(taskID);
        } catch (IllegalArgumentException e) {

//            e.printStackTrace();
            System.out.println(e.getMessage());
            return new Task(1, "error");
        }*/
        return Optional.ofNullable(TaskList.findTaskById(taskID));
    }

    @Override
    public List getAllTasks() {
        //todo: move this list here?
        return TaskList.taskList;
    }
}
