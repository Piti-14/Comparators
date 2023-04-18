import java.util.List;

public class TaskList {

    private List<Task> list;
    private int numberOfTasks;

    public TaskList(int numberOfTasks, List<Task> list) {
        this.numberOfTasks = numberOfTasks;
        this.list = list;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public List<Task> getList() {
        return list;
    }
}
