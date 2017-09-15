package zadanie;

public class DefaultTaskResultCollector implements TaskResultCollector {
    @Override
    public double getResult(int taskID) {
        Task task = DefaultTaskRepository.findTaskById(taskID);
        if (!task.isCalculated) {
            throw new IllegalArgumentException("This task was not calculated");
        }
        return task.result;
//        else {
//            return task.result;
//        }
    }
}
