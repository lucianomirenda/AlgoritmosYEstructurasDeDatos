package practica2;

import java.util.Scanner;

public class TestEjercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProfundidadDeArbolBinario arbolProfundo = new ProfundidadDeArbolBinario();

        TreeTool<Integer> treeTool = new TreeTool<>();
        int num;

        do {
            System.out.println("Llenar el nuevo arbol");
            num = scanner.nextInt();
            treeTool.insertarPorNivel(arbolProfundo.arbol,num);
        } while (num != 0);

        System.out.println("Ingrese el nivel para saber la suma de sus nodos");
        num = scanner.nextInt();

        do {
            System.out.println("La suma de sus nodos es: " + arbolProfundo.sumaElementosProfundidad(num));
            num = scanner.nextInt();
        } while (num != 9);
    }

}
