package practica2;

import org.ietf.jgss.GSSContext;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TestEjercicio7 {

    public static void main(String[] args) {

        BinaryTree<Integer> arbol = new BinaryTree<>();
        Scanner scanner = new Scanner(System.in);
        arbol.setData(2);

        arbol.addLeftChild(new BinaryTree<>(1));
        arbol.getLeftChild().addRightChild(new BinaryTree<>(9));
        arbol.getLeftChild().getRightChild().addRightChild(new BinaryTree<>(10));
        arbol.getLeftChild().getRightChild().getRightChild().addRightChild(new BinaryTree<>(11));
        arbol.getLeftChild().getRightChild().getRightChild().getRightChild().addRightChild(new BinaryTree<>(12));
        arbol.addRightChild(new BinaryTree<>(4));
        arbol.getRightChild().addLeftChild(new BinaryTree<>(6));
        arbol.getRightChild().addRightChild(new BinaryTree<>(5));
        arbol.getRightChild().getRightChild().addRightChild(new BinaryTree<>(7));
        arbol.getRightChild().getRightChild().getRightChild().addRightChild(new BinaryTree<>(8));


        ParcialArboles parcialArboles = new ParcialArboles(arbol);

        System.out.println("Ingrese un valor para encontrar un nodo en el arbol");
        int num = scanner.nextInt();

        while (num != 0) {
            System.out.println("Buscando..");
            parcialArboles.isLeftTree(num);
            System.out.println("Ingrese un valor distinto de 0 para encontrar un nodo en el arbol");
            num = scanner.nextInt();
        }


    }

}
