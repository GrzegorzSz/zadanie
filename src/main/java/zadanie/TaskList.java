package zadanie;

import java.util.ArrayList;

public class TaskList {
    public static ArrayList<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<Task>();
    }

    public static Task findTaskById(int taskId){
        for (int index = 0; index < taskList.size(); index++) {
            if(taskList.get(index).id == taskId){
                return taskList.get(index);
            }
        }
        throw new IllegalArgumentException("no object with that id.");
    }
}

