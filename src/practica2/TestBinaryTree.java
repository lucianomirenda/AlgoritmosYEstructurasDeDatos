package practica2;

import java.util.Scanner;

public class TestBinaryTree {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BinaryTree<Integer> arbol = new BinaryTree<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un elemento en el arbol");
            Integer dato = scanner.nextInt();
            BinaryTree<Integer> nuevoNodo = new BinaryTree<>(dato);

            agregarArbol(arbol,nuevoNodo);
            imprimirArbol(arbol);

        }

        System.out.println(arbol.contarHojas());

        imprimirArbol(arbol);

    }

    public static void agregarArbol(BinaryTree<Integer> a, BinaryTree<Integer> nuevoNodo) {
        if(a.getData() == null){
            a.setData(nuevoNodo.getData());
            a.getLeftChild();
        } else {
            if (a.getData() > nuevoNodo.getData()) {
                agregarArbol(a.getRightChild(), nuevoNodo);
            } else {
                agregarArbol(a.getLeftChild(),nuevoNodo);
            }
        }
    }

    public static void agregarArbol2(BinaryTree<Integer> a, BinaryTree<Integer> nuevoNodo) {

        if (a.getData() != null) {
            if (a.hasLeftChild()) {
                agregarArbol2(a.getLeftChild(), nuevoNodo);
            } else if(a.hasRightChild()) {
                agregarArbol2(a.getRightChild(),nuevoNodo);
            } else {
                a = nuevoNodo;
            }
        } else {
            a.setData(nuevoNodo.getData());
        }


    }



    public static void imprimirArbol(BinaryTree<Integer> a) {
        if (a != null) {
            imprimirArbol(a.getLeftChild());
            System.out.println(a.getData());
            imprimirArbol(a.getRightChild());
        }
    }


}
