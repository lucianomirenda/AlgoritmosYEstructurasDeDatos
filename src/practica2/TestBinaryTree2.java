package practica2;

import java.util.Scanner;

public class TestBinaryTree2 {

    public static void main(String[] args) {

        BinaryTree<Integer> arbol = new BinaryTree<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un dato por teclado");
            //BinaryTree<Integer> nuevoNodo = new BinaryTree<>(scanner.nextInt());
            //agregarNodo(arbol,nuevoNodo);
            agregarDato(arbol,scanner.nextInt());
            System.out.println("---");
            imprimirArbol(arbol);
            System.out.println("");
            System.out.println("---");
        }

        System.out.println("La cantidad de hojas es: "+arbol.contarHojas());


    }

    public static void agregarNodo(BinaryTree<Integer> nodoActual, BinaryTree<Integer> nodoNuevo) {
        if (nodoActual.getData() == null) {
            nodoActual.setData(nodoNuevo.getData());
        } else {
            if (nodoActual.hasLeftChild()) {
                if (nodoActual.hasRightChild()) {
                    agregarNodo(nodoActual.getLeftChild(), nodoNuevo);
                } else {
                    nodoActual.addRightChild(nodoNuevo);
                }
            } else {
                nodoActual.addLeftChild(nodoNuevo);
            }
        }
    }

    public static void agregarDato(BinaryTree<Integer> a, Integer dato) {
        if (a.getData() == null) {
            a.setData(dato);
        } else {
            if (a.hasLeftChild()) {
                if (a.hasRightChild()) {
                    agregarDato(a.getLeftChild(), dato);
                } else {
                    a.addRightChild(new BinaryTree<Integer>(dato));
                }
            } else {
                a.addLeftChild(new BinaryTree<Integer>(dato));
            }
        }
    }

    public static void agregarOrdenado(BinaryTree<Integer> a, Integer dato) {
        if (a.getData() == null) {
            a.setData(dato);
        } else {
            if (a.getData() > dato) {
                if (a.hasLeftChild()) {
                    agregarOrdenado(a.getLeftChild(), dato);
                } else {
                    a.addLeftChild(new BinaryTree<Integer>(dato));
                }
            } else {
                if (a.hasRightChild()) {
                    agregarOrdenado(a.getRightChild(), dato);
                } else {
                    a.addRightChild(new BinaryTree<Integer>(dato));
                }
            }
        }
    }

    public static void imprimirArbol(BinaryTree<Integer> a) {
        if (a != null) {
            imprimirArbol(a.getLeftChild());
            System.out.print("["+a.getData()+"] ");
            imprimirArbol(a.getRightChild());
        }
    }

}
