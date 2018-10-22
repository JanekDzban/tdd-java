package pl.edu.lafk.tdd.fizzbuzz;

public class Tester {
    public static void main(String[] args) {
        final FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        //FIXME: skad mam wiedziec, ktore metody z FizzBuzzTest odpalic?
        fizzBuzzTest.getClass().getDeclaredMethods();
    }
}
