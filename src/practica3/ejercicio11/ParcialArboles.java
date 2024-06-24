package practica3.ejercicio11;
import practica1.ejercicio8.Queue;
import practica3.GeneralTree;
public class ParcialArboles {

    public static boolean resolver(GeneralTree<Integer> arbol) {

        boolean esCreciente = true;

        if (arbol == null) {
            esCreciente = false; //deberia devolver false?
        } else {

            GeneralTree<Integer> aux = new GeneralTree<>();
            Queue<GeneralTree<Integer>> cola = new Queue<>();
            int nivel = 0;
            int cantNodos = 0;
            int cantNodosAnterior = 1;

            cola.enqueque(arbol);
            cola.enqueque(null);

            while ((!cola.isEmpty()) && (esCreciente)) {
                aux = cola.dequeque();

                if (aux != null) {
                    for (GeneralTree<Integer> child : aux.getChildren()) {
                        cantNodos++;
                        cola.enqueque(child);
                    }
                } else {
                    if (!cola.isEmpty()) {
                        esCreciente = cantNodos == cantNodosAnterior + 1;
                        cantNodosAnterior = cantNodos;
                        cantNodos = 0;
                        cola.enqueque(null);
                    }
                }
            }
        }
        return esCreciente;
    }
}
