import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by lorenzo on 11-2-15.
 */
public class Sprint extends ScrumItem {

    private LinkedList<UserStory> userStories = new LinkedList<UserStory>();
    private String sprintVision;
    private LocalDate startDate;
    private Period sprintDuration;

    public Sprint(int id, String createDate, String creator, String sprintVision, LocalDate startDate, Period sprintDuration) {
        super(id, createDate, creator);
        this.sprintVision = sprintVision;
        this.startDate = startDate;
        this.sprintDuration = sprintDuration;
    }

    public void addAllUserStories(LinkedList userStories) {

    }

    public void addUserStory(UserStory userStory) {
        userStories.add(userStory);
    }

    public LinkedList getUserStories() {
        return userStories;
    }

    public void setUserStories(LinkedList userStories) {
        this.userStories = userStories;
    }

    public String getSprintVision() {
        return sprintVision;
    }

    public void setSprintVision(String sprintVision) {
        this.sprintVision = sprintVision;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Period getSprintDuration() {
        return sprintDuration;
    }

    public void setSprintDuration(Period sprintDuration) {
        this.sprintDuration = sprintDuration;
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "userStories=" + userStories +
                ", sprintVision='" + sprintVision + '\'' +
                ", startDate=" + startDate +
                ", sprintDuration=" + sprintDuration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sprint)) return false;

        Sprint sprint = (Sprint) o;

        if (sprintDuration != null ? !sprintDuration.equals(sprint.sprintDuration) : sprint.sprintDuration != null)
            return false;
        if (sprintVision != null ? !sprintVision.equals(sprint.sprintVision) : sprint.sprintVision != null)
            return false;
        if (startDate != null ? !startDate.equals(sprint.startDate) : sprint.startDate != null) return false;
        if (userStories != null ? !userStories.equals(sprint.userStories) : sprint.userStories != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userStories != null ? userStories.hashCode() : 0;
        result = 31 * result + (sprintVision != null ? sprintVision.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (sprintDuration != null ? sprintDuration.hashCode() : 0);
        return result;
    }
}
