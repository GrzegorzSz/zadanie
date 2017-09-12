package zadanie;

public class DefaultNewTaskCreator implements NewTaskCreator {
    Task newTask;
    DefaultNewTaskCreator(){
        newTask = null;
    }
    @Override
    public int createNewTask(String description) {
        newTask = new Task(0, "");
        newTask.id = newTask.hashCode();
        newTask.isCalculated = false;
        TaskList.TaskList.add(newTask);
        return newTask.id;
    }
}
