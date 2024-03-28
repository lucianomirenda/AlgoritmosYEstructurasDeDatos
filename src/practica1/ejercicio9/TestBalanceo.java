package practica1.ejercicio9;

import java.util.Scanner;
import java.util.Stack;

public class TestBalanceo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.println("Ingrese un string para testear su balanceo");
        String S = scanner.nextLine();
        Character act;
        int i = 0;
        boolean balanceado = true;

        while (i < S.length() && balanceado) {
            act = S.charAt(i);
            i++;
            if (act == '(' | act == '[' | act == '{') {
                pila.push(act);
            } else {
                if (pila.isEmpty()) {
                    balanceado = false;
                } else {
                    switch (act) {
                        case ')' -> {
                            balanceado = pila.pop() == '(';
                        }
                        case ']' -> {
                            balanceado = pila.pop() == '[';
                        }
                        case '}' -> {
                            balanceado = pila.pop() == '{';
                        }
                        default -> {}
                    }
                }
            }
        }

        if (pila.isEmpty() && balanceado) {
            System.out.println("ta balanceado!");
        } else {
            System.out.println("Desbalanceado :(");
        }
        
    }

}
