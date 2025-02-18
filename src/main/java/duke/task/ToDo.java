package duke.task;

/**
 * Represents an item that the user has to do at a later point in time. Inherits Task class.
 */
public class ToDo extends Task {

    /**
     * Creates a ToDo ond assigns the user input to description.
     *
     * @param description A String that the user input. Represents the task that user needs to do.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * Displays the current ToDo item as well as completion status.
     *
     * @return A string in the format "[T][ ] (taskDescription)" The box will be [X] if the task is completed.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Formats the data of ToDo into the format supported for file operations
     *
     * @return String in the format "T,{X, },description"
     */
    @Override
    public String toFile() {
        return "T," + super.toFile() + "\n";
    }

}
