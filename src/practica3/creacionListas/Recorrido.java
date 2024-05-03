package practica3.creacionListas;

import practica3.GeneralTree;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    public static List<Integer> recorridoMax(GeneralTree<Integer> arbol) {

        List<Integer> listaActual = new ArrayList<>();
        List<Integer> listaMax = new ArrayList<>();
        Integer num = 0;
        Integer num2 = 0;

        recorridoMax(arbol, listaActual, listaMax,num,num2);

        return null;
    }

    private static void recorridoMax(GeneralTree<Integer> arbol, List<Integer> lista, List<Integer> listaMax,Integer nivel,Integer hijo) {

        lista.add(arbol.getData());

        if (arbol.isLeaf()) {
            System.out.println("Arbol data: "+arbol.getData());
            System.out.println("llamda: "+nivel+". hijo: "+hijo+". lista: "+ lista);

        } else {

            System.out.println("Arbol data: "+arbol.getData());
            System.out.println("llamda: "+nivel+". hijo: "+hijo+". lista: "+ lista);

            for (GeneralTree<Integer> child : arbol.getChildren()) {
                recorridoMax(child,lista,listaMax,nivel+1,hijo++);
            }

        }

        lista.remove(lista.size() - 1);

    }

}


