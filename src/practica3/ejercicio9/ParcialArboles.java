package practica3.ejercicio9;

import practica3.GeneralTree;

import java.util.ArrayList;

public class ParcialArboles {

    public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
        boolean aux;
        if((arbol == null)|(arbol.isLeaf())){
            aux = false;
        } else {
            aux = esDeSeleccionPrivado(arbol);
        }

        return aux;
    }

    private static boolean esDeSeleccionPrivado(GeneralTree<Integer> arbol) {

        if (arbol.isLeaf()) {
            return true;
        } else {
            int min = Integer.MAX_VALUE;
            boolean aux = true;
            for (GeneralTree<Integer> child : arbol.getChildren()) {
                esDeSeleccionPrivado(child);
                min = Math.min(min, child.getData());

            }

            if (arbol.getData() == min) {
                return true;
            }


        }



        return true;

    }
}
