package practica2;

import practica1.ejercicio8.Queue;

import java.lang.annotation.Target;

public class TreeTool<T> {

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
                                System.out.println("Insertado en el nivel " + indice);
                                insertado = true;
                            }
                        } else {
                            aux.addLeftChild(new BinaryTree<T>(dato));
                            System.out.println("Insertado en el nivel " + indice);
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
                System.out.println("Insertado en el nivel " + indice);
            }
        } else {
            arbol = new BinaryTree<T>(dato);
            System.out.println("Insertado en el nivel " + indice);
        }
    }

    public void printPreOrden(BinaryTree<T> a) {
        if (a != null) {
            if (!a.isEmpty()) {
                System.out.print("["+a.getData()+"]->");
            } else {
                System.out.print("[Nodo vacio]");
            }
            printPreOrden(a.getLeftChild());
            printPreOrden(a.getRightChild());
        }
    }

    public void printInOrden(BinaryTree<T> a) {
        if (a != null) {
            printInOrden(a.getLeftChild());
            if (!a.isEmpty()) {
                System.out.print("[" + a.getData() + "]->");
            } else {
                System.out.print("[Nodo vacio");
            }
            printInOrden(a.getRightChild());
        }
    }

    public void printPostOrden(BinaryTree<T> a) {
        if (a != null) {
            printPreOrden(a.getLeftChild());
            printPreOrden(a.getRightChild());
            if (!a.isEmpty()) {
                System.out.print("[" + a.getData() + "]->");
            } else {
                System.out.print("[Nodo vacio");
            }

        }
    }

    public void printPorNivel(BinaryTree<T> a) {
        BinaryTree<T> aux = new BinaryTree<>();
        Queue<BinaryTree<T>> cola = new Queue<>();

        cola.enqueque(a);
        cola.enqueque(null);

        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            if (aux != null) {
                System.out.print("[" + aux.getData() + "]->");
                if (aux.hasLeftChild()) {
                    cola.enqueque(aux.getLeftChild());
                }
                if (aux.hasRightChild()) {
                    cola.enqueque(aux.getRightChild());
                }
            } else {
                if (!cola.isEmpty()) {
                    cola.enqueque(null);
                }
            }
        }
        System.out.println();
    }















}
