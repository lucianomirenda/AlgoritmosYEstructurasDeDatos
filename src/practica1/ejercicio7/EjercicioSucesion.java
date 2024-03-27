package practica1.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EjercicioSucesion {


    private List<Integer> list = new ArrayList();
    public  List<Integer> calcuarSucesion(int n) {

        if(n == 1){
            list.add(n);
            return list;
        } else {
            list.add(n);
            if(n % 2 == 0){
                return calcuarSucesion(n / 2);
            } else {
                return calcuarSucesion((n*3)+1);
            }
        }

    }

}
