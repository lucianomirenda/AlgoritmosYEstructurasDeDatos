package practica1.ejercicio7;

import java.util.ArrayList;

public class EjercicioCombinarMain {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(5);
        lista1.add(7);
        lista1.add(13);
        lista1.add(18);

        lista2.add(2);
        lista2.add(3);
        lista2.add(6);
        lista2.add(15);
        lista2.add(20);
        lista2.add(23);

        ArrayList<Integer> nuevaLista = EjercicioCombinar.combinadorOrdenado(lista1,lista2);

        for (int i = 0; i < nuevaLista.size(); i++) {
            System.out.println(nuevaLista.get(i));
        }


    }
}
