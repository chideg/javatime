package laborator5.first;

public class OutTask implements Task{
    public OutTask(String message) {
        System.out.println(message);
    }

    @Override
    public void execute() {
    }
}
