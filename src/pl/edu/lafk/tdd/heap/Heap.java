package pl.edu.lafk.tdd.heap;

import java.util.ArrayList;
import java.util.List;

 class Heap<T> {
    private List<T> collection;

    Heap() {
        collection = new ArrayList<>();
    }

    private T getTop() {
        return collection.get(collection.size() - 1 );
    }

    T lookup() {
        if(collection.isEmpty()) {
            return null;
        } else {
            return getTop();
        }
    }

    void add(T obj) {
        collection.add(obj);
    }

    T get() throws EmptyHeapException {
        if(collection.isEmpty()) {
            throw new EmptyHeapException("no elements on heap");
        } else {
            T obj = getTop();
            collection.remove(collection.indexOf(getTop()));
            return obj;
        }
    }
}
