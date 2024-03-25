package practica1.ejercicio1;

public class printNumbers{

	public static void withFor(int a,int b) {	
		for(int i = a; i <=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void withWhile(int a,int b) {
		while(a <= b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void recursive(int a,int b) {
		if(a <= b) {
			System.out.println(a);
			a++;
			recursive(a,b);
		}
	}
	
}
