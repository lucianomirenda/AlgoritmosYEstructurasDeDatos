package practica2;

import practica1.ejercicio8.Queue;

public class ParcialArboles {

    public BinaryTree<Integer> arbol;

    ParcialArboles() {
        arbol = new BinaryTree<>();
    }

    ParcialArboles(BinaryTree<Integer> a) {
        arbol = a;
    }

    public boolean isLeftTree(int num) {
        boolean aux;
        BinaryTree<Integer> a = buscarNodo(num);

        if (a != null) {
            System.out.println("Se encontro el nodo: "+num);
            int cantL;
            int cantR;

            if (a.hasLeftChild()) {
                cantL = cantHijoUnico(a.getLeftChild());
            } else {
                cantL = -1;
            }

            if (a.hasRightChild()) {
                cantR = cantHijoUnico(a.getRightChild());
            } else {
                cantR = -1;
            }

            System.out.println("La rama izquierda tiene una cantidad de "+cantL+" nodos con un único hijo");
            System.out.println("La rama derecha tiene una cantidad de "+cantR+" nodos con un único hijo");
            aux = cantL > cantR;
            System.out.println("Por lo que el resultado es: "+ aux);
        } else {
            System.out.println("No se encontro el nodo con ese numero :(");
            aux = false;
        }

        return aux;
    }

    private int cantHijoUnico(BinaryTree<Integer> a) {
        int cant = 0;
        boolean hasR = a.hasRightChild();
        boolean hasL = a.hasLeftChild();

        if (!(hasL && hasR) && !(a.isLeaf())) {
            cant = 1;
        }

        if (hasL) {
            cant += cantHijoUnico(a.getLeftChild());
        }
        if (hasR) {
            cant += cantHijoUnico(a.getRightChild());
        }

        return cant;

    }

    private BinaryTree<Integer> buscarNodo(int num) {
        BinaryTree<Integer> aux = new BinaryTree<>();
        Queue<BinaryTree<Integer>> cola = new Queue<>();
        boolean encontrado = false;

        cola.enqueque(this.arbol);
        cola.enqueque(null);


        while ((!cola.isEmpty())&&(!encontrado)) {
            aux = cola.dequeque();
            if (aux != null) {
                if (!aux.isEmpty()) {
                    encontrado = aux.getData() == num;
                }
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
        return aux;
    }


}
















