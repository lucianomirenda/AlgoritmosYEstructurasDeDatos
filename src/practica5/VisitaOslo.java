package practica5;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class VisitaOslo {

    public List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo, List<String> restringidos) {
        List<String> camino = new LinkedList<>();
        if (!lugares.isEmpty()) {
            boolean[] visitados = new boolean[lugares.getSize()];
            Vertex<String> comienzo = lugares.search("Ayuntamiento");
            Vertex<String> fin = lugares.search(destino);
            if (comienzo != null && fin != null) {
                paseoEnBici(lugares, comienzo, fin, visitados, restringidos, camino, maxTiempo);
            }

        }

        return camino;
    }

    private boolean paseoEnBici(Graph<String> lugares, Vertex<String> origen, Vertex<String> destino, boolean[] visitados,
                                List<String> restringidos, List<String> camino, int maxTiempo) {
        boolean encontre = false;
        visitados[origen.getPosition()] = true;
        camino.add(origen.getData());

        System.out.println("entro con "+origen.getData());

        if (origen == destino) {
            encontre = true;
        } else {
            List<Edge<String>> ady = lugares.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();

            while (it.hasNext() && !encontre) {
                Edge<String> e = it.next();
                int j = e.getTarget().getPosition();
                if (!visitados[j] && (!restringidos.contains(e.getTarget().getData())) && ((maxTiempo - e.getWeight()) >= 0)) {
                    encontre = paseoEnBici(lugares, e.getTarget(), destino, visitados,
                            restringidos, camino, maxTiempo - e.getWeight());
                }
            }
        }
        if (!encontre) {
            camino.remove(camino.size() - 1);
        }
        visitados[origen.getPosition()] = false;

        System.out.println("salgo con "+origen.getData());


        return encontre;
    }


}







