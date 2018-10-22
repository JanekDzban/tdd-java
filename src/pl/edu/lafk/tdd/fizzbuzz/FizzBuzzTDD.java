package pl.edu.lafk.tdd.fizzbuzz;

class FizzBuzzTDD {

    enum FizzBuzzNames {
        Fizz(3), Buzz(5);

        int nr;

        FizzBuzzNames(int nr) {
            this.nr = nr;
        }
        @Override
        public String toString() {
            return this.name();
        }
    }

    String numer(int nr) {
        if(nr == 0)  {
            return String.valueOf(0);
        }
        if(fizz(nr) && buzz(nr)) {
           return FizzBuzzNames.Fizz.name() + FizzBuzzNames.Buzz.name() ;
        } else if ((fizz(nr))) {
            return FizzBuzzNames.Fizz.name();
        } else if(buzz(nr)) {
            return FizzBuzzNames.Buzz.name();
        }
        return String.valueOf(nr);
    }

    boolean fizz(int nr) {
        return nr % FizzBuzzNames.Fizz.nr == 0;
    }

    boolean buzz(int nr) {
        return nr % FizzBuzzNames.Buzz.nr == 0;
    }
}
