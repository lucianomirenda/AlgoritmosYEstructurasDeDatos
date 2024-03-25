package practica1;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList();

        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(5);
        listaNumeros.add(53);

        for (int i : listaNumeros) {
            System.out.println(i);
        }

    }

}
