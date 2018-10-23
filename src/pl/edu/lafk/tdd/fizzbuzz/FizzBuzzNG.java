package pl.edu.lafk.tdd.fizzbuzz;

public class FizzBuzzNG {

    public String fizzbuzz(int numer) {
        String wynik = "";
        if(numer % 3 == 0) wynik += "Fizz";
        if(numer % 5 == 0) wynik += "Buzz";
        return wynik;
    }
}
