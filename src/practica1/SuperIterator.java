package practica1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SuperIterator {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(2);
        lista.add(6);

        ListIterator<Integer> iteracion = lista.listIterator();


        LinkedList nuevaLista;

        nuevaLista = new LinkedList<Integer>();

        nuevaLista.add(12);
        nuevaLista.add(14);
        nuevaLista.add(15);
        nuevaLista.add(16);


        ListIterator<Integer> pepeIterator = nuevaLista.listIterator();

        iterar(pepeIterator);

    }


    private static void iterar(ListIterator listaIteradora) {
        if (listaIteradora.hasNext()) {
            System.out.println(listaIteradora.next());
            iterar(listaIteradora);
            System.out.println(listaIteradora.previous());
        }
    }


}


