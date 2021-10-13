package laborator5.first;

import java.util.Random;

public class RandomOutTask implements Task{
    public RandomOutTask() {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println("Random number: " + randomNum);
    }

    @Override
    public void execute() {
    }
}
