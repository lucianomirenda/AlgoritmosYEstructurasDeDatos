package practica1.ejercicio7;

import java.util.List;

public class puntoG {

    public static void main(String[] args) {

        EjercicioSucesion test = new EjercicioSucesion();

        List<Integer> lista = test.calcuarSucesion(6);

        for (int i : lista){
            System.out.println(i);
        }




    }
}
