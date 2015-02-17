import java.util.LinkedList;

/**
 * Created by lorenzo on 11-2-15.
 */
public class UserStory {
    private int estimatedHours;
    private boolean done;
    private int taskAmount;
    private int amountTasksDone;
    private LinkedList tasks = new LinkedList();
    private int id;
    private int amountTasksUndone;
    private String story;
    private int hoursSpent;

    //Not known yet what goes in to the first int.
    public UserStory(int id, String storyName) {
        this.id = id;
        this.story = storyName;
    }

    public void addTask(Task task) {

    }

    public void addTasks(LinkedList tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            this.tasks.add(tasks.get(i));
        }
    }

    public String getStory() {
        return story;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public boolean isDone() {
        return done;
    }

    public int getTaskAmount() {
        return taskAmount;
    }

    public int getAmountTasksDone() {
        return amountTasksDone;
    }

    public LinkedList getTasks() {
        return tasks;
    }

    public int getId() {
        return id;
    }

    public int getAmountTasksUndone() {
        return amountTasksUndone;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "UserStory{" +
                "estimatedHours=" + estimatedHours +
                ", done=" + done +
                ", taskAmount=" + taskAmount +
                ", amountTasksDone=" + amountTasksDone +
                ", tasks=" + tasks +
                ", id=" + id +
                ", amountTasksUndone=" + amountTasksUndone +
                ", story='" + story + '\'' +
                ", hoursSpent=" + hoursSpent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserStory)) return false;

        UserStory userStory = (UserStory) o;

        if (amountTasksDone != userStory.amountTasksDone) return false;
        if (amountTasksUndone != userStory.amountTasksUndone) return false;
        if (done != userStory.done) return false;
        if (estimatedHours != userStory.estimatedHours) return false;
        if (hoursSpent != userStory.hoursSpent) return false;
        if (id != userStory.id) return false;
        if (taskAmount != userStory.taskAmount) return false;
        if (!story.equals(userStory.story)) return false;
        if (!tasks.equals(userStory.tasks)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = estimatedHours;
        result = 31 * result + (done ? 1 : 0);
        result = 31 * result + taskAmount;
        result = 31 * result + amountTasksDone;
        result = 31 * result + tasks.hashCode();
        result = 31 * result + id;
        result = 31 * result + amountTasksUndone;
        result = 31 * result + story.hashCode();
        result = 31 * result + hoursSpent;
        return result;
    }
}
