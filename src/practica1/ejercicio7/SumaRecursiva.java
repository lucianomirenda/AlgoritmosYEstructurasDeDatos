package practica1.ejercicio7;

import java.util.ListIterator;

public class SumaRecursiva {

    public static Integer sumarLinkedList(ListIterator<Integer> listIterator) {
        if (listIterator.hasNext()) {
            return listIterator.next() + sumarLinkedList(listIterator);
        } else {
            return 0;
        }
    }


}
