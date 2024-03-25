package practica1.ejercicio2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		
		int n = scanner.nextInt();
		int[] arreglo;
		
		while(n != 0) {
			
			arreglo = tp1.ejercicio2.Sequence.arrayMultiplos(n);
			
			for(int i=0;i<arreglo.length;i++) {
				System.out.println("["+arreglo[i]+"]");
			}
			
			System.out.println("Ingrese un número: ");
			n = scanner.nextInt();
			
			
		}
		
		scanner.close();
	}

}
