package zadanie;

import java.util.ArrayList;
import java.util.Optional;

public interface TaskCalculateVerifier {
    /**
     *  gets an array of calculated task with given id. Each task have its id and description
     * @param taskID an id of existing task, cannot be empty nor, must be greater than 0
     * @return array of existing calculated tasks
     */
    boolean getCalculatedTask(int taskID);
}
