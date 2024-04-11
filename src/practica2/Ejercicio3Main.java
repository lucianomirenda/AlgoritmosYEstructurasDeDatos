package practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContadorArbol contador = new ContadorArbol(2);
        TreeTool<Integer> treeTool = new TreeTool<>();

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        while (num != 0) {
            treeTool.insertarPorNivel(contador.arbol,num);
            System.out.println("Ingrese un número");
            num = scanner.nextInt();

        }

        ArrayList<Integer> pares = contador.numerosParesInOrden();

        System.out.println("InOrden");
        for (int i : pares) {
            System.out.print("["+i+"] ");
        }

        System.out.println();
        pares = contador.numerosParesPostOrden();

        System.out.println("PostOrden");
        for (int i : pares) {
            System.out.print("["+i+"] ");
        }
    }


}
