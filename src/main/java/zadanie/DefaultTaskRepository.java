package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultTaskRepository implements TaskRepository {
    public static ArrayList<Task> taskList = new ArrayList<>();

    public static Task findTaskById(int taskId){
        for (int index = 0; index < taskList.size(); index++) {
            if(taskList.get(index).id == taskId){
                return taskList.get(index);
            }
        }
        return null;
//        brak tej lini w razie optionala w defaultTaskRepository
//        throw new IllegalArgumentException("no object with that id.");
    }
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
        return Optional.ofNullable(findTaskById(taskID));
    }

    @Override
    public List getAllTasks() {
        //todo: move this list here?
        return taskList;
    }
}
