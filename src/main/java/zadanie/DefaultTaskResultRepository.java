package zadanie;

public class DefaultTaskResultRepository implements TaskCalculateVerifier {
    Task task;
    @Override
    public boolean getCalculatedTask(int taskID) {
        task = TaskList.findTaskById(taskID);
        if(task.isCalculated)
            return true;
        return false;
    }
}
