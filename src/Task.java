public class Task implements Comparable<Task>{

    private int priority;
    private int time;

    public Task(int priority, int time){
        this.priority = priority;
        this.time = time;
    }

    public int getPriority() {
        return priority;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Task task) {

        if (this.priority > task.getPriority()){
            return 1;
        } else if (this.priority < task.getPriority()){
            return -1;
        } else { //Same priority

            if (this.time <= task.getTime()){ //Less or equal time goes up
                return 1;
            } else {
                return -1;
            }
        }
    }

    public String toString() {
        return priority + " " + time;
    }
}
