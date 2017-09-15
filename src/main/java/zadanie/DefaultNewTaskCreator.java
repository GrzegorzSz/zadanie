package zadanie;

public class DefaultNewTaskCreator implements NewTaskCreator {
    Task newTask;


    @Override
    public int createNewTask(String description) {
        newTask = new Task(DefaultTaskRepository.taskList.size(), "");

        newTask.descrpition = description;
        newTask.isCalculated = false;
        DefaultTaskRepository.taskList.add(newTask);
        return newTask.id;
    }
}
