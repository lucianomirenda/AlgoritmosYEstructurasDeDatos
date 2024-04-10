package practica2;

import practica1.ejercicio8.Queue;

public class TreeTool<T> {


    public void addNode(BinaryTree<T> a, T dato) {
        if (a == null) { //envia un arbol sin crear
            a = new BinaryTree<T>(dato);
        } else if (a.isEmpty()) { // envia un arbol vacio
            a.setData(dato);
        } else {
            if (a.hasLeftChild()) {
                addNode(a.getRightChild(), dato);
            } else {
                addNode(a.getLeftChild(), dato);
            }
        }
    }

    public void insertarPorNivel(BinaryTree<T> arbol, T dato) {

        BinaryTree<T> aux = null;
        Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
        int indice = 0;

        boolean insertado = false;

        if (arbol != null) {
            if (!arbol.isEmpty()) {

                indice = 1;

                cola.enqueque(arbol);
                cola.enqueque(null);

                while (!cola.isEmpty() && !insertado) {
                    aux = cola.dequeque();
                    if (aux != null) {

                        if (aux.hasLeftChild()) {
                            cola.enqueque(aux.getLeftChild());
                            if (aux.hasRightChild()) {
                                cola.enqueque(aux.getRightChild());
                            } else {
                                aux.addRightChild(new BinaryTree<T>(dato));
                                System.out.println("Insertado en el nivel "+indice);
                                insertado = true;
                            }
                        } else {
                            aux.addLeftChild(new BinaryTree<T>(dato));
                            System.out.println("Insertado en el nivel "+indice);
                            insertado = true;
                        }
                    } else {
                        indice++;
                        if (!cola.isEmpty()) {
                            cola.enqueque(null);

                        }
                    }
                }
            } else {
                arbol.setData(dato);
                System.out.println("Insertado en el nivel "+indice);
            }
        } else {
            arbol = new BinaryTree<T>(dato);
            System.out.println("Insertado en el nivel "+indice);
        }
    }







    public void printPreOrder(BinaryTree<T> a) {
        if (a != null) {
            System.out.print("[" + a.getData() + "] ");
        }
        if (a.hasLeftChild()) {
            printPreOrder(a.getLeftChild());
        }
        if (a.hasRightChild()) {
            printPreOrder(a.getRightChild());
        }
    }

}
