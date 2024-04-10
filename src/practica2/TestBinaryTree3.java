package practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBinaryTree3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTree<Integer> arbol = new BinaryTree<Integer>();
        TreeTool<Integer> treeTool = new TreeTool<>();

        System.out.println("Ingrese un dato");
        int dato = scanner.nextInt();

        while (dato != 0) {
            treeTool.addNode(arbol,dato);
            System.out.println("Ingrese un dato");
            dato = scanner.nextInt();
        }

        //treeTool.printPreOrder(arbol);


    }


}
