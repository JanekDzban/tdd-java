package pl.edu.lafk.tdd.dice;

import java.util.Random;

public class Dice {
    public int makeThrow() {
        return new Random().nextInt(6) + 1;
    }
}
