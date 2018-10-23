package pl.edu.lafk.tdd.dice;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int diceNumber = 5;

    public Player () {
    }

    public Player (int diceNumber) {
        this.diceNumber = diceNumber;
    }

    public ArrayList<Integer> getResults() {
        Dice dice = new Dice();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            numbers.add(dice.makeThrow());
        }
//        return numbers;
    }

//    public List<Integer> makeFirstThrow() {
//        Dice dice = new Dice();
//        List<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i < 5; i++) {
//            numbers.add(dice.makeThrow());
//        }
//        return numbers;
//    }


}
