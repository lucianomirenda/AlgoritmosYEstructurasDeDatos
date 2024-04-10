package practica2;

import java.util.ArrayList;

public class ContadorArbol {

    BinaryTree<Integer> arbol;

    ContadorArbol(Integer num){
        arbol = new BinaryTree<Integer>(num);
    }

    ArrayList<Integer> numerosParesInOrden() {

        ArrayList<Integer> lista = new ArrayList<>();
        if(!arbol.isEmpty()){
            numerosParesPrivadoInOrden(lista,arbol);
        }

        return lista;
    }

    private void numerosParesPrivadoInOrden(ArrayList<Integer> lista, BinaryTree<Integer> a) {
        if (a.hasLeftChild()) {
            numerosParesPrivadoInOrden(lista,a.getLeftChild());
        }
        if (a.getData() % 2 == 0) {
            lista.add(a.getData());
        }
        if (a.hasRightChild()) {
            numerosParesPrivadoInOrden(lista,a.getRightChild());
        }

    }


    ArrayList<Integer> numerosParesPostOrden() {

        ArrayList<Integer> lista = new ArrayList<>();
        if(!arbol.isEmpty()){
            numerosParesPrivadoPostOrden(lista,arbol);
        }

        return lista;
    }

    private void numerosParesPrivadoPostOrden(ArrayList<Integer> lista, BinaryTree<Integer> a) {
        if (a.hasLeftChild()) {
            numerosParesPrivadoPostOrden(lista,a.getLeftChild());
        }
        if (a.hasRightChild()) {
            numerosParesPrivadoPostOrden(lista,a.getRightChild());
        }
        if (a.getData() % 2 == 0) {
            lista.add(a.getData());
        }

    }




}
