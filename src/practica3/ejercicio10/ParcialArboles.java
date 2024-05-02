package practica3.ejercicio10;

import practica3.GeneralTree;

import java.util.ArrayList;
import java.util.List;



public class ParcialArboles {

    private static class Valores {
        int calculo;
        int max;

        Valores(){
            max = -1;
            calculo = 0;
        }

    }


    public static List<Integer> resolver(GeneralTree<Integer> arbol) {

        List<Integer> lista = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        Valores valores = new Valores();
        int nivel = 0;

        resolver(arbol, lista, resultado, valores,nivel);

        return resultado;
    }

    private static void resolver(GeneralTree<Integer> arbol, List<Integer> lista,List<Integer> listaMax, Valores valores,int nivel) {

        if (arbol.isLeaf()) {
            if (arbol.getData() == 1) {
                lista.add(1);
            }
            valores.calculo = valores.calculo + (nivel * arbol.getData());

        } else {

            for (GeneralTree<Integer> child : arbol.getChildren()) {

                if (arbol.getData() == 1) {
                    lista.add(1);
                }

                valores.calculo = valores.calculo + (nivel * arbol.getData());

                int calculoAnterior = valores.calculo;

                resolver(child, lista,listaMax, valores,nivel+1);

                if (valores.calculo > valores.max) {
                    listaMax.clear();
                    valores.max = valores.calculo;
                    for (int num : lista) {
                        listaMax.add(num);
                    }
                }

                if(lista.size()>0){
                    lista.remove(lista.size()-1);
                }

                valores.calculo = calculoAnterior;

            }
        }

    }
}
