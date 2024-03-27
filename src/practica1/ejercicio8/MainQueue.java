package practica1.ejercicio8;

public class MainQueue {
    public static void main(String[] args) {

        Queue<Integer> cola = new Queue<>();

        cola.enqueque(1);
        cola.enqueque(4);
        cola.enqueque(7);
        cola.enqueque(10);
        cola.enqueque(13);

        CircularQueue<Integer> colaCircular = new CircularQueue<>();

        colaCircular.enqueque(1);
        colaCircular.enqueque(2);
        colaCircular.enqueque(3);
        colaCircular.enqueque(4);
        colaCircular.enqueque(5);


        for (int i = 0; i < 20 ; i++) {
            System.out.println(colaCircular.shift());
        }

    }
}
