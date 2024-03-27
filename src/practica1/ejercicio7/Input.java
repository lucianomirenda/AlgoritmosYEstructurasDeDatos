package practica1.ejercicio7;
import java.util.Scanner;

public class Input {
	
	public static Integer num() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número");
		return scanner.nextInt();
	}
}
