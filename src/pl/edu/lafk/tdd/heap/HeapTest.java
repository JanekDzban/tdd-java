package pl.edu.lafk.tdd.heap;

/*
    Przypadki testowe:
    1.1 zerknijZwracaObiekt - zwraca obiekt z gory
    1.2 zerknijNieZwracaObiektu - nie zwraca obiektu z gory bo stos jest pusty
    2.1 polozDodajeObiekt - doda element na poczatek stosu
    3.1 pobierzZdejmujeObiekt - zdejmie element z gory
    3.2 pobierzNieZdejmujeObiektu - nie zdejmie elementu z gory bo stos jest pusty i rzuca wyjatek

    dodawanie kolekcji
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class HeapTest {
    public static void main(String args[]) throws EmptyHeapException {
        HeapTest heapTest = new HeapTest();

        heapTest.zerknijNieZwracaObiektu();
        heapTest.pobierzNieZdejmujeObiektu();
        heapTest.dodajDoPustegoStosu();
        heapTest.pobierzPustyObiekt();
        heapTest.pobierzZdejmujeObiekt();
        heapTest.zerknijZwracaObiekt(5);
        heapTest.dodajWieleELementow(5);
        heapTest.zdejmijWieleElementow(5);
        heapTest.dodajKolekcjeDoPustegoStosu();
        heapTest.dodajGranicznyElementDoStosu();
    }

    private void pobierzPustyObiekt() throws EmptyHeapException {
        Heap heap = generujStos(0);
        heap.add(0);
        assert heap.get().equals(0) : "nie dodano elementu do pustego stosu";
    }

    private void zerknijNieZwracaObiektu() {
        assert generujStos(0).lookup() == null : "mialo nie byc zwroconego obiektu";
    }

    private void pobierzNieZdejmujeObiektu() {
        try {
            generujStos(0).get();
            assert true == false : "nie polecial wyjatek";
        } catch(EmptyHeapException e) {
            assert e.getClass().equals(EmptyHeapException.class) : "polecial inny wyjatek";
            assert e.getLocalizedMessage().equals("no elements on heap") : "wyjatek ma inny komunikat";
        }
    }

    private void zdejmijWieleElementow(int n) throws EmptyHeapException {
        Heap heap = generujStos(n);
        for(int i = 0; i < n; i++) {
            Integer obj = (Integer) heap.get();
            assert !obj.equals(heap.lookup());
        }
        assert heap.lookup() == null;
    }


    private void dodajDoPustegoStosu() {
        Heap heap = generujStos(0);
        heap.add(0);
        assert heap.lookup().equals(0) : "nie dodano elementu do pustego stosu";
    }

    private void dodajWieleELementow(int n) {
        Heap heap = generujStos(0);
        for(int i = 0; i < n; i++) {
            heap.add(i);
            assert heap.lookup().equals(i) : String.format("nie dodano elementu %d, na wierzchu jest %d",i ,heap.lookup());
        }
    }

    private void dodajKolekcjeDoPustegoStosu() {
        Heap heap = generujStos(0);
        Collection<Integer> collection = new ArrayList<>();
        heap.add(collection);
        assert heap.lookup().equals(collection);
    }

    private void dodajGranicznyElementDoStosu() {
        Heap heap = generujStos(0);
        heap.add(Integer.MAX_VALUE);
        assert heap.lookup().equals(Integer.MAX_VALUE);
        heap.add(Integer.MIN_VALUE);
        assert heap.lookup().equals(Integer.MIN_VALUE);
    }

    private void pobierzZdejmujeObiekt() throws EmptyHeapException {
        Heap heap = generujStos(5);
        Integer obj = (Integer)heap.get();
        assert !heap.lookup().equals(obj) : "obiekt nie zostal usuniety ze stosu";
    }

    private void zerknijZwracaObiekt(int n) {
        assert generujStos(n).lookup() != null : "stos nie zwrocil obiektu";
    }

    private Heap generujStos(int n) {
        Heap heap = new Heap();
        for(int i = 0; i < n ; i++) {
            heap.add(new Random().nextInt());
        }
        return heap;
    }
}
