package practica3.ejercicio10;

import practica3.GeneralTree;

import java.awt.image.renderable.ParameterBlock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ParcialArboles {

    private static class Valores {
        private int max;

        Valores(){
            max = -1;
        }

    }


    public static List<Integer> resolver(GeneralTree<Integer> arbol) {

        List<Integer> lista = new LinkedList<>();
        List<Integer> resultado = new LinkedList<>();

        Valores valor = new Valores();
        int nivel = 0;
        int calculo = 0;

        resolver(arbol, lista, resultado, valor,nivel,calculo);

        return resultado;
    }

    private static void resolver(GeneralTree<Integer> arbol, List<Integer> lista,List<Integer> listaMax, Valores valor,Integer nivel,Integer calculo) {

        if (arbol.getData() == 1) {
            lista.add(1);
        }

        calculo = calculo + nivel * arbol.getData();

        if (arbol.isLeaf()) {
            if(valor.max < calculo){
                listaMax.clear();
                listaMax.addAll(lista);
                valor.max = calculo;
            }

        } else {
            for (GeneralTree<Integer> child : arbol.getChildren()) {
                resolver(child,lista,listaMax,valor,nivel+1,calculo);
            }
        }

        if (arbol.getData() == 1) {
            lista.remove(lista.size() - 1);
        }

    }

}
