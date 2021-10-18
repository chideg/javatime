package laborator5.first;

public class CounterOutTask implements Task{
    private static int globalCounter = 0;

    public CounterOutTask() {
        globalCounter++;
    }

    @Override
    public void execute() {
        System.out.println("Executing CounterOutTask with globalCounter: " + globalCounter);
    }
}
