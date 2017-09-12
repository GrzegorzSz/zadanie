package zadanie;

public interface TaskResultCollector {

    /**
     * gets a calculation result
     * @param taskID must be grater than 0
     * @return result
     */
    double getResult(int taskID);
}
