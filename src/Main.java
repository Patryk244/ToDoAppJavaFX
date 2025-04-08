public class Main {
    public static void main(String[] args) {
        TaskService taskService = new SimpleTaskService();
        ToDoApp app = new ToDoApp(taskService);
        app.run();
    }
}