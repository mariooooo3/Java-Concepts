package Abstraction;

import java.util.Random;

public class RandomOutTask implements Task {
    public Random rnd;

    public RandomOutTask() {
        rnd = new Random();
        rnd.setSeed(12345);
    }

    @Override
    public void execute() {
        System.out.println("Numarul random este:" + rnd.nextInt());
    }

}
