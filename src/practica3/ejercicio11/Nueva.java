package practica3.ejercicio11;

import java.util.Scanner;

public class Nueva {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j+=n/2) {
                x = x + 1;
            }
        }
        
    }
}
