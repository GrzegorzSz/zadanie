package zadanie;

public interface NewTaskCreator {


    /**
     * Creates a new task.
     *
     * @param description  a description of the new task, cannot be null nor empty.
     * @return a unique id greater than zero.
     * @throws IllegalArgumentException if the description is incorrect.
     */
    int createNewTask(String description);

}
