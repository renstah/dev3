import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // create Sprint.
        String vision = "This sprint is going to be awesome xD";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2015-02-12", formatter);
        Period period = Period.ofWeeks(2);

        Sprint sprint = new Sprint(5, "12-02-2015", "Lorenzo", vision, date, period);

        //Create the userstory.
        String userStoryName = "This is an awesome user story";
        UserStory userStory = new UserStory(0, userStoryName);

        LinkedList tasks = new LinkedList();

        for (int i = 0; i < 10; i++) {
            Task task = new Task("Awesome task number" + i, i);
            tasks.add(task);
        }

        userStory.addTasks(tasks);
        sprint.addUserStory(userStory);
        System.out.print(sprint);
    }
}
