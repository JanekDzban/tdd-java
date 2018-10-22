package pl.edu.lafk.tdd.fizzbuzz;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FizzBuzzTest {
    private final static FizzBuzzTDD fbt = new FizzBuzzTDD();
    //TODO: przeniesc do Testera
    private static final List<String> errors = new LinkedList<>();

    private void dlaXZwracaY(int x, String y) {
        //TODO: import z Testera
        asercja(fbt.numer(x).equals(y), String.format("dla %d nie zwraca %s", x, y));
    }

    //TODO: przeniesc do Testera
    private void asercja(boolean warunek, String komunikat) {
        if(!warunek) {
            throw new AssertionError(komunikat);
        } else {
            System.out.println("+: " + komunikat);
        }
    }

    public static void main(String[] args) {
        final FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        odpalTest(fizzBuzzTest,0, "0");
        odpalTest(fizzBuzzTest,1, "1");
        odpalTest(fizzBuzzTest,3, "fizz");
        odpalTest(fizzBuzzTest,5, "buzz");
        odpalTest(fizzBuzzTest,6, "fizz");
        odpalTest(fizzBuzzTest,15, "FizzBuzz");
        odpalTest(fizzBuzzTest,30, "FizzBuzz");
        odpalTest(fizzBuzzTest,45, "FizzBuzz");
        odpalTest(fizzBuzzTest,16, "16");

        int losowy = new Random().nextInt();
        if(fbt.fizz(losowy)) {
            odpalTest(fizzBuzzTest, losowy, "fizz");
        } else if(fbt.buzz(losowy)) {
            odpalTest(fizzBuzzTest, losowy, "buzz");
        } else if (fbt.fizz(losowy) && fbt.buzz(losowy)){
            odpalTest(fizzBuzzTest, losowy, "FizzBuzz");
        } else {
            odpalTest(fizzBuzzTest, losowy, Integer.toString(losowy));
        }
        if(!errors.isEmpty()) {
            System.err.println(errors);
        } else {
            System.out.println("bez bledow");
        }
    }

    //TODO: przeniesc do Testera
    private static void odpalTest(FizzBuzzTest fizzBuzzTest, int i, String s) {
        try {
            fizzBuzzTest.dlaXZwracaY(i, s);
        } catch (AssertionError ae) {
            errors.add(ae.getLocalizedMessage());
        }
    }

    //TODO: fizzBuzzTest tylko metody testowe, nowa klasa Tester ktora bedzie odpalac testy
}
