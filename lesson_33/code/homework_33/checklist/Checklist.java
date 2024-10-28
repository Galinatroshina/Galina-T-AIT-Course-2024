package homework_33.checklist;

public enum Checklist {
    ADD("Add a new task", 1), VIEW("View all tasks", 2), UPDATE("Update an existing task", 3), DELETE("Delete a task", 4), COMPLETE("Mark a task complete", 5), EXIT("Exit the application", 6);

    //fields
    private String task;
    private int number;

    Checklist(String task, int number) {
        this.task = task;
        this.number = number;
    }

    public String getTask() {
        return task;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checklist{");
        sb.append("task='").append(task).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    public static void printMenu() {
        System.out.println("To-Do List Menu:");
        for (Checklist option : Checklist.values()) {
            System.out.println(option.getNumber() + ". " + option.getTask());
        }
    }
}
