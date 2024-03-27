package practica1.ejercicio7;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class EjercicioInvertir {

    private static int i = 0;
    private static ArrayList<Character> listaAux = new ArrayList<>();
    private static Stack<Integer> pila = new Stack<>();
    private static Stack<Integer> pila2 = new Stack<>();

    public static void invertirArrayListIndice(ArrayList<Integer> lista) {

        if (i < lista.size()) {
            pila.push(lista.get(i));
            i++;
            invertirArrayListIndice(lista);
            lista.set(lista.size() - i, pila.pop());

        }
        if (lista.size() - 1 == 0) {
            i = 0;
        }

    }

    public static void invertirArrayList(ListIterator<Integer> listaChar) {
        if (listaChar.hasNext()) {

            pila.push(listaChar.next());
            listaChar.remove();
            invertirArrayList(listaChar);
            listaChar.add(pila.pop());

        }
    }


}

