package zadanie;

public class DefaultTaskCalculateVerifier implements TaskCalculateVerifier {
    Task task;
    @Override
    public boolean getCalculatedTask(int taskID) {
        task = DefaultTaskRepository.findTaskById(taskID);
//        if(task.isCalculated)
//            return true;
//        return false;

        return task.isCalculated;
    }
}
