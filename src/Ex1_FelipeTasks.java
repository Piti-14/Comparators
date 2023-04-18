import java.util.*;

public class Ex1_FelipeTasks {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Create tasks
        Task t1 = new Task(1, 6);
        Task t2 = new Task(2, 4);
        Task t3 = new Task(3, 5);
        Task t4 = new Task(30, 7);
        Task t5 = new Task(30, 2);

        //Create Lists of Tasks
        List<Task> list1 = new ArrayList<>();
        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        TaskList tasklist1 = new TaskList(3, list1);

        List<Task> list2 = new ArrayList<>();
        list2.add(t4);
        list2.add(t5);
        TaskList tasklist2 = new TaskList(2, list2);

        TaskList tasklist3 = new TaskList(0, list1);

        //Create the ArrayList of Lists of Tasks
        List<TaskList> tasks = new ArrayList<>();
        tasks.add(tasklist1);
        tasks.add(tasklist2);
        tasks.add(tasklist3);

        //Create the instance of the Comparator
        Comparator<Task> comparator = Comparator.comparing(Task::getPriority).reversed().thenComparing(Task::getTime);

        //Sort the ArrayList
        for (TaskList tl : tasks) {

            if (tl.getNumberOfTasks() != 0) {
                Collections.sort(tl.getList(), comparator);

                for (Task t : tl.getList()) {
                    System.out.println(t);
                }

                System.out.println("---");
            }
        }
    }
}
