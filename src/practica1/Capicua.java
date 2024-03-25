package practica1;

import java.util.ArrayList;
import java.util.List;

public class Capicua {

    public static void main(String[]args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(1);


        if(!esCapicua(lista)){
            System.out.println("Es capicua");
        }

    }

     static boolean  esCapicua(List<Integer> list) {

        boolean aux = false;

        if(list.size() % 2 == 0){

            int j = list.size() - 1;
            int i = 0;

            while((!aux ) && (i < list.size()/2)){

                if(list.get(i) != list.get(j)){
                    System.out.println(list.get(i));
                    System.out.println(list.get(j));
                    aux = true;
                }


                i++;
                j--;
            }

        }

        return aux;
    }
}
