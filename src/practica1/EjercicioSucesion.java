package practica1;

import java.util.ArrayList;
import java.util.List;

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

    public void invertirArrayList(ArrayList<Integer> list) {
    }
}
