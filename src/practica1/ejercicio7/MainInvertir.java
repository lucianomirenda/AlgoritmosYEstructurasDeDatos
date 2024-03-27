package practica1.ejercicio7;

import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

public class MainInvertir {



    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("-----------");

        EjercicioInvertir.invertirArrayList(list.listIterator());

        for (int i : list) {
            System.out.println(i);
        }


    }


}
