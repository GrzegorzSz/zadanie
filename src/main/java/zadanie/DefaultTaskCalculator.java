package zadanie;

public class DefaultTaskCalculator implements TaskCalculator {
    Task currentTask;

//    DefaultTaskCalculator(){
//        currentTask = null;
//    }
    @Override
    public void calculate(int id) {

        try {
            currentTask = TaskList.findTaskById(id);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        currentTask.calculate();
    }
}
