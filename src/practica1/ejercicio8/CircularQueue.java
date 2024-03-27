package practica1.ejercicio8;

public class CircularQueue<T> extends Queue{

    public Object shift(){

        Object aux = super.dequeque();
        data.add(aux);
        return aux;
    }

}
