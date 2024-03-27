package practica1.ejercicio8;

import java.util.*;
public class Queue<T> extends Sequence {

    protected List<T> data;

    public Queue() {
        data = new ArrayList<T>();
    }

    public void enqueque(T dato) {
            data.add(dato);
    }

    public T dequeque() {
        T aux = data.get(0);
        data.remove(0);
        return aux;
    }

    public T head(){
        return data.get(0);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {

        String aux = "";

        for (Iterator<T> iterator = data.iterator(); iterator.hasNext(); ) {
            aux = aux + iterator.next().toString() + "\n";
        }

        return aux;
    }
}
