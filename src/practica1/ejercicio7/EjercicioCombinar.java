package practica1.ejercicio7;

import java.util.ArrayList;

public class EjercicioCombinar {

    public static ArrayList<Integer> combinadorOrdenado(ArrayList<Integer> list1,ArrayList<Integer>list2) {

        ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
        int j;

        for (int i = 0 ; i < list1.size(); i++) {
            j = 0;
            if (list1.get(i) < list2.get(i)) {

                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list1.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                    nuevaLista.add(j, list1.get(i));
                    System.out.println("inserto "+list1.get(i));

                } else {
                    nuevaLista.add(j,list1.get(i));
                    System.out.println("inserto "+list1.get(i));

                }

                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list2.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                    nuevaLista.add(j, list2.get(i));
                    System.out.println("inserto "+list2.get(i));

                } else {
                    nuevaLista.add(j,list2.get(i));
                    System.out.println("inserto "+list2.get(i));

                }

            } else {

                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list2.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                    nuevaLista.add(j, list2.get(i));
                    System.out.println("inserto "+list2.get(i));

                } else {
                    nuevaLista.add(j,list2.get(i));
                    System.out.println("inserto "+list2.get(i));

                }

                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list1.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                    nuevaLista.add(j, list1.get(i));
                    System.out.println("inserto "+list1.get(i));

                } else {
                    nuevaLista.add(j,list1.get(i));
                    System.out.println("inserto "+list1.get(i));

                }

            }

        }

        return nuevaLista;
    }
}
