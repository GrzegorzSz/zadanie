package zadanie;

import java.util.ArrayList;

public class TaskList {
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
}

