package practica2;

import java.util.Scanner;

public class Recorridos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTree<Integer> arbol = new BinaryTree<Integer>();
        TreeTool<Integer> treeTool = new TreeTool<>();

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        while (num != 0) {
            treeTool.insertarPorNivel(arbol,num);
            System.out.println("Ingrese un número");
            num = scanner.nextInt();
        }

        System.out.println("arbol completado.");

        System.out.println("Recorrido Pre-Orden");
        treeTool.printPreOrden(arbol);
        System.out.println("fin pre-orden");
        System.out.println();

        System.out.println("Recorrido In-Orden");
        treeTool.printInOrden(arbol);
        System.out.println("fin in-orden");
        System.out.println();



    }

}
