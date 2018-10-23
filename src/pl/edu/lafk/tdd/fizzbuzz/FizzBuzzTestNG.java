package pl.edu.lafk.tdd.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTestNG {

    @DataProvider(name = "fizzbuzzProvider")
    private Object[][] fizzbuzzProvider() {
        String oczekiwanyWynikPodzielnePrzez3 = "Fizz";
        String oczekiwanyWynikPodzielnePrzez5 = "Buzz";
        String oczekiwanyWynikPodzielnePrzez3i5 = "FizzBuzz";
        String komunikatPodzielnePrzez3 = "Dla podzielnej przez 3 nie bylo Fizz;";
        String komunikatPodzielnePrzez5 = "Dla podzielnej przez 5 nie bylo Buzz;";
        String komunikatPodzielnePrzez3i5 = "Dla podzielnej przez 3 i 5 nie bylo FizzBuzz;";


        return new Object[][] {
                {3, oczekiwanyWynikPodzielnePrzez3, komunikatPodzielnePrzez3},
                {5, oczekiwanyWynikPodzielnePrzez5, komunikatPodzielnePrzez5},
                {6, oczekiwanyWynikPodzielnePrzez3, komunikatPodzielnePrzez3},
                {9, oczekiwanyWynikPodzielnePrzez3, komunikatPodzielnePrzez3},
                {10, oczekiwanyWynikPodzielnePrzez5, komunikatPodzielnePrzez5},
                {15, oczekiwanyWynikPodzielnePrzez3i5, komunikatPodzielnePrzez3i5},
                {30, oczekiwanyWynikPodzielnePrzez3i5, komunikatPodzielnePrzez3i5},
                {45, oczekiwanyWynikPodzielnePrzez3i5, komunikatPodzielnePrzez3i5},
        };
    }

    @Test(dataProvider = "fizzbuzzProvider")
    public void podzielnePrzezXDajeY(int x, String y, String komunikat) {
        //given
        FizzBuzzNG fizzBuzzNG = new FizzBuzzNG();
        //when
        String wynik = fizzBuzzNG.fizzbuzz(x);
        //then
        Assert.assertEquals(wynik, y, komunikat);
    }
}
