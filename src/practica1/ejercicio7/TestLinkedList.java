package practica1.ejercicio7;

import java.util.*;

public class TestLinkedList {


	public static void main(String[] args) {
		
		LinkedList<Integer> listaNumeros = new LinkedList();
		
		int num = Input.num();
		
		while(num != 0) {
			listaNumeros.add(num);
			num = Input.num();
		}
		
		for(int n : listaNumeros) {
			System.out.println("["+n+"]");
		}
		
		
	}
	


}

