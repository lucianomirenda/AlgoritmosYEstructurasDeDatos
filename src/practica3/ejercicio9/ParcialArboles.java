package practica3.ejercicio9;

import practica3.GeneralTree;

import java.util.ArrayList;

public class ParcialArboles {

    public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
        boolean aux;
        if((arbol == null)| (arbol.isLeaf())){
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
            int min = arbol.getChildren().get(0).getData()*2;
            for (GeneralTree<Integer> child : arbol.getChildren()) {
                if (child.getData() < min) {
                    min = child.getData();
                }
            }

            if (min == arbol.getData()) {
                boolean aux = true;
                for (GeneralTree<Integer> child : arbol.getChildren()) {
                    aux = aux && esDeSeleccionPrivado(child);
                }
                return aux;
            } else {
                return false;
            }
        }
    }
}
