package pl.edu.lafk.tdd.dice;
/*
    1. rzut kosciami
        -pierwszy rzut
        -kolejne rzuty (2 i 3)
    2. obliczanie wyniku
        -sprawdzenie dostepnej kategorii
        -oblicze wyniku w ramach tej katergorii
        -liczenie premii
 */


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class DiceTest {


    @Test(invocationCount = 10)
    public void koscZwracaPoprawnaWartosc() {
        //given
        Dice kosc = new Dice();
        //when
        int wynik = kosc.makeThrow();
        //then
        Assert.assertTrue(wynik <= 6 && wynik >= 1, "wynik nie miesci sie w zakresie 1-6");
    }

}
