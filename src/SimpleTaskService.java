import java.util.ArrayList;
import java.util.List;

public class SimpleTaskService implements TaskService{
    private List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added task: " + task);
    }

    @Override
    public void showTask() {
        System.out.println("Your task: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }
}
