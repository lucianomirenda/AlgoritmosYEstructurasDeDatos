package practica2;

import java.util.Scanner;

public class TestEjercicio6 {

    public static void main(String[] args) {

        Transformacion transformacion = new Transformacion();
        TreeTool<Integer> treeTool = new TreeTool<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        while (num != 9) {
            treeTool.insertarPorNivel(transformacion.arbol, num);
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
        }

        System.out.println("Su arbol es: ");
        treeTool.printPorNivel(transformacion.arbol);

        BinaryTree<Integer> arbolT = transformacion.suma();

        System.out.println("Su arbol transformado es: ");
        treeTool.printPorNivel(arbolT);
    }

}
