package practica2;

import java.util.Scanner;

public class Ejercicio4Main {

    public static void main(String[] args) {

        RedBinariaLlena redBinariaLlena = new RedBinariaLlena(2);
        TreeTool<Integer> treeTool = new TreeTool<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingresar un numero");
            int num = scanner.nextInt();
            treeTool.insertarPorNivel(redBinariaLlena.arbol, num);
        }

        redBinariaLlena.arbol.entreNiveles(0,4);

        //System.out.println("Resultado: "+ redBinariaLlena.retardoReenvio());

    }
}
