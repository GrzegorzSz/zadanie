package zadanie;

public class DefaultNewTaskCreator implements NewTaskCreator {
    Task newTask;


    @Override
    public int createNewTask(String description) {
        newTask = new Task(TaskList.taskList.size(), "");

        newTask.descrpition = description;
        newTask.isCalculated = false;
        TaskList.taskList.add(newTask);
        return newTask.id;
    }
}
