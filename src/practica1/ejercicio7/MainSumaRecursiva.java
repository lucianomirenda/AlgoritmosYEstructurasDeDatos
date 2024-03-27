package practica1.ejercicio7;

import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainSumaRecursiva {

    public static void main(String[]args) {

        LinkedList<Integer> lista = new LinkedList<Integer>();

        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(2);


        System.out.println(SumaRecursiva.sumarLinkedList(lista.listIterator()));

    }
}
