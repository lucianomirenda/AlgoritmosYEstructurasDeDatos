package practica3.ejercicio4;

import practica1.ejercicio8.Queue;
import practica3.GeneralTree;


public class AnalizadorArbol {

    public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {

        double maxPromedio = -1;
        int cantNodos = 0;
        int sumaNivel = 0;

        GeneralTree<AreaEmpresa> aux = new GeneralTree<>();
        Queue<GeneralTree<AreaEmpresa>> cola = new Queue<>();

        cola.enqueque(arbol);
        cola.enqueque(null);

        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            if (aux != null) {
                cantNodos++;
                sumaNivel+= aux.getData().getLag();
                for (GeneralTree<AreaEmpresa> child : aux.getChildren()) {
                    cola.enqueque(child);
                }
            } else {
                maxPromedio = Math.max(maxPromedio,(double) sumaNivel / cantNodos);
                if (!cola.isEmpty()) {
                    cantNodos = 0;
                    sumaNivel = 0;
                    cola.enqueque(null);
                }
            }
        }

        return maxPromedio;
    }

}
