package practica1.ejercicio7;

import java.util.*;

public class TestArrayList {


	public static void main(String[] args) {
		
		
		ArrayList<Integer> listaNumeros = new ArrayList();
	
		
		String num1 = "2";
		
		
		int num = Input.num();
		
		while(num != 0) {
			listaNumeros.add(num);
			num = Input.num();
		}
		
		for(int n : listaNumeros) {
			System.out.println("["+n+"]");
		}
		
		
		Iterator<Integer> it = listaNumeros.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		for(int n : listaNumeros) {
			System.out.println("["+n+"]");
		}
		
		for(int n : listaNumeros) {
			System.out.println("["+n+"]");
		}
		
		for(int n : listaNumeros) {
			System.out.println("["+n+"]");
		}
		
	}
	


}

