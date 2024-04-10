package practica2;

import practica1.ejercicio8.Queue;

public class ProfundidadDeArbolBinario {

    BinaryTree<Integer> arbol;

    ProfundidadDeArbolBinario() {
        arbol = new BinaryTree<>();
    }

    public int sumaElementosProfundidad(int nivel) {
        int suma = 0;
        int indice = 0;
        BinaryTree<Integer> aux = new BinaryTree<Integer>();
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();

        if(!this.arbol.isEmpty()){

            cola.enqueque(this.arbol);
            cola.enqueque(null);

            while (!cola.isEmpty()&& indice <= nivel ) {
                aux = cola.dequeque();
                if (aux != null) {
                    if (indice == nivel) {
                        suma+= aux.getData();
                    }
                    if (aux.hasLeftChild()) {
                        cola.enqueque(aux.getLeftChild());
                    }
                    if (aux.hasRightChild()) {
                        cola.enqueque(aux.getRightChild());
                    }
                } else {
                    indice++;
                    if (!cola.isEmpty()) {
                        cola.enqueque(null);
                    }
                }
            }
        }

        return suma;
    }


}
