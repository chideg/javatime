package laborator5.first;

import java.util.Random;

public class RandomOutTask implements Task{
    private int randomNum;

    public RandomOutTask() {
        Random random = new Random();
        randomNum = random.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Executing RandomOutTask with random number: " + randomNum);
    }
}
