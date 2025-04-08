public class ToDoApp {
    private final TaskService taskService;

    public ToDoApp(TaskService taskService) {
        this.taskService = taskService;
    }

    public void run() {
        taskService.addTask("MY JOB");
        taskService.addTask("MY ENGLISH");
        taskService.showTask();
    }
}
