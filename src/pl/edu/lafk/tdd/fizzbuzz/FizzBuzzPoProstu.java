package pl.edu.lafk.tdd.fizzbuzz;

import java.util.Scanner;

class FizzBuzzPoProstu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int x = s.nextInt();
        String napis = magicznaMetoda(x);
        System.out.println(napis);
    }

    static String magicznaMetoda(int x) {
        String doZwrotu = "";
        if (x % 3 == 0) {
            doZwrotu += "fizz";
        }
        if(x % 5 == 0) {
            doZwrotu += "buzz";
        }
        if(doZwrotu.isEmpty()) {
            return String.valueOf(x);
        } else {
            return doZwrotu;
        }
    }
}

class FizzBuzzPoProstuTest {

    void dla0Zwraca0() {
        FizzBuzzPoProstu fbpp = new FizzBuzzPoProstu();
        assert fbpp.magicznaMetoda(1).equals(1);
    }
}
