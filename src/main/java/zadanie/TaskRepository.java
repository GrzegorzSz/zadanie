package zadanie;

import java.util.ArrayList;
import java.util.List;

public interface TaskRepository {
    /**
     * gets an existing task refers to given id.
     * Result of the task may be unknown
     * @param taskID must be grater than 0
     * @return requested task
     */
    Task getExistingTask(int taskID);
    List getAllTasks();
}
