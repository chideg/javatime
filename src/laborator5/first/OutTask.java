package laborator5.first;

public class OutTask implements Task{
    private String message;

    public OutTask(String message) {
        this.message= message;
    }

    @Override
    public void execute() {
        System.out.println("Executing OutTask using message: " + message);
    }
}
