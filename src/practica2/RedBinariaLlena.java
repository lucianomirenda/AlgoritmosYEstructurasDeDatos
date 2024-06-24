package practica2;

import java.util.ArrayList;
import java.util.List;
public class RedBinariaLlena {
    private class Valores {
        int max = -1;
        int actual = 0;
    }

    BinaryTree<Integer> arbol;

    RedBinariaLlena(Integer num) {
        arbol = new BinaryTree<>(num);
    }

    int retardoReenvio() {
        int max = -1;

        if (!arbol.isEmpty()) {
            max = retardoReenvioPrivado(arbol);
        }

        return max;
    }

    private int retardoReenvioPrivado(BinaryTree<Integer> a) {
        if (!a.isLeaf()) {

            return Math.max(a.getData()+retardoReenvioPrivado(a.getLeftChild()),
                            a.getData()+retardoReenvioPrivado(a.getRightChild()));

        } else {
            return a.getData();
        }
    }

    public List<Integer> retornarListaMaxima() {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaMaxima = new ArrayList<>();
        Valores max = new Valores();


        return lista;
    }

    private void retornarListaMaxima(BinaryTree<Integer> arbol, List<Integer> lista, List<Integer> listaMaxima, Valores val){

        lista.add(arbol.getData());
        val.actual = arbol.getData() + val.actual;

        if (arbol.isLeaf()) {
            if(val.actual > val.max){
                listaMaxima.addAll(lista);
                val.max = val.actual;
            }
        } else {
            if (arbol.hasLeftChild()) {
                retornarListaMaxima(arbol.getLeftChild(), lista, listaMaxima, val);
            }
            if (arbol.hasRightChild()) {
                retornarListaMaxima(arbol.getRightChild(),lista, listaMaxima, val);
            }
        }

        lista.remove(lista.size()-1);
        val.actual = val.actual - arbol.getData();

    }


}
