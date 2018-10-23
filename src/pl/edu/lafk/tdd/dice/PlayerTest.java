package pl.edu.lafk.tdd.dice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PlayerTest {

    @DataProvider(name = "players")
    public Object[][] players () {

        return new Object[][]{
                {new Player(5)}

        };
    }

    @Test(dataProvider = "players")
    public void dostepnaLiczbaWynikowtoX(Player player) {
        //given

        //when
        player.getResults();
        //then
        //Po rzucie w ktorym wyszlo 4 4 4 3 1 pozostaja 2 rzuty
        player.getDicesNumber() ==
    }


//    @Test(invocationCount = 10)
//    public void pierwszyRzut5Kosciami() {
//        //given
//        Player gracz = new Player();
//        SoftAssert sa = new SoftAssert();
//        //when
//        List<Integer> wynikRzutu = gracz.makeFirstThrow();
//        //then
//        for(Integer wynik : wynikRzutu) {
//            sa.assertTrue(wynik <= 6 && wynik >= 1, "wynik nie miesci sie w zakresie 1-6");
//        }
//        sa.assertEquals(wynikRzutu.size(),5, "pierwszy rzut nie zwrocil 5 liczb");
//        sa.assertAll();
//    }
//
//    @Test(dataProvider = "players")
//    public void iloscRzutowGraczaPoprawnieLiczona() {
//        //given
//        Player gracz = new Player();
//        //when
//        gracz.availableThrows();
//        //then
//
//
//    }
}
