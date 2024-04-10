package practica2;

import java.util.Scanner;

public class TestInsertar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTree<Integer> arbol = new BinaryTree<>();
        TreeTool<Integer> treeTool = new TreeTool<>();

        int dato;

        do {
            System.out.println("Ingrese un dato: ");
            dato = scanner.nextInt();
            treeTool.insertarPorNivel(arbol,dato);
        } while (dato != 0);


    }
}
