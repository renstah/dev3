import java.time.LocalDate;

/**
 * Created by lorenzo on 11-2-15.
 */
public class Task {

    private boolean done;
    private int estimatedHours;
    private LocalDate doneDate;
    private String description;
    private int id;
    private int hoursSpent;

    // int probably id.


    public Task(String description, int id) {
        this.description = description;
        this.id = id;

        this.done = false;
        this.hoursSpent = 0;
    }

    public Task(boolean done, int estimatedHours, LocalDate doneDate, String description, int id, int hoursSpent) {
        this.done = done;
        this.estimatedHours = estimatedHours;
        this.doneDate = doneDate;
        this.description = description;
        this.id = id;
        this.hoursSpent = hoursSpent;
    }

    public void endTask(int id, LocalDate doneDate, boolean done) {

    }

    public int getId() {

        return id;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public LocalDate getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDate doneDate) {
        this.doneDate = doneDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "done=" + done +
                ", estimatedHours=" + estimatedHours +
                ", doneDate=" + doneDate +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", hoursSpent=" + hoursSpent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (done != task.done) return false;
        if (estimatedHours != task.estimatedHours) return false;
        if (hoursSpent != task.hoursSpent) return false;
        if (id != task.id) return false;
        if (!description.equals(task.description)) return false;
        if (!doneDate.equals(task.doneDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (done ? 1 : 0);
        result = 31 * result + estimatedHours;
        result = 31 * result + doneDate.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + id;
        result = 31 * result + hoursSpent;
        return result;
    }
}
