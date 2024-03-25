package tp1.ejercicio2;

public class Sequence {

	public static int[] arrayMultiplos(int n){
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = n*(1+i);
		}
		
		return array;
	}
	
}
