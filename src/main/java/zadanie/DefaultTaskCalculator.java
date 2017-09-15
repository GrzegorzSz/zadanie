package zadanie;

public class DefaultTaskCalculator implements TaskCalculator {
    Task currentTask;

    @Override
    public void calculate(int id) {

        try {
            currentTask = DefaultTaskRepository.findTaskById(id);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        currentTask.calculate();
    }
}
