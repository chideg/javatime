package laborator5.first;

public class CounterOutTask implements Task{
    private static int globalCounter = 0;

    public CounterOutTask() {
        globalCounter++;
        System.out.println(globalCounter);
    }

    @Override
    public void execute() {

    }
}
