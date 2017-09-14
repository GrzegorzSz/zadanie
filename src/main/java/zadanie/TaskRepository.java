package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    /**
     * gets an existing task refers to given id.
     * Result of the task may be unknown
     * @param taskID must be grater than 0
     * @return requested task
     */
    //todo: consider changing a name and a return typw
    Optional getExistingTask(int taskID);
    List getAllTasks();
}
