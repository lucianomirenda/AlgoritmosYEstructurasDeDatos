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




        return true;

    }
}
