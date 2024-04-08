import java.util.HashMap;

public class Task {
    private String name;
    private String description;
    private int taskID;
    private Status status;

    public Task(int taskID, String name, String description, Status status) {
        this.taskID = taskID;
        this.name = name;
        this.description = description;
        this.status = status;
    }

        public int getId() {
        return taskID;
    }

    public String getTitle() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }
    public void update(String title, String description, Status status) {
        this.name = title;
        this.description = description;
        this.status = status;
    }



    public Task(String name, String description, int taskID){
        this.name = name;
        this.description = description;
        this.taskID = taskID;
    }

}