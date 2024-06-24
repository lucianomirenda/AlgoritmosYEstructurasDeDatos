package practica5;
import practica5.adjList.AdjListGraph;

import java.util.*;
public class MapaCiudades {

    AdjListGraph<String> grafo;

    MapaCiudades() {
        grafo = new AdjListGraph<>();
    }
    public List<String> devolverCamino(String ciudad1, String ciudad2) {
        boolean[] visitados = new boolean[grafo.getSize()];
        List<String> caminoActual = new ArrayList<>();
        List<String> caminoFinal = new ArrayList<>();

        for (int i = 0; i < grafo.getSize(); i++) {
            if (ciudad1.equals(grafo.getVertex(i).getData())) {
                visitados[i] = true;
                caminoActual.add(grafo.getVertex(i).getData());
                devolverCamino(grafo, i, visitados, caminoActual,caminoFinal,ciudad2);
            }

        }

        return caminoFinal;
    }

    private void devolverCamino(Graph<String> grafo, Integer i, boolean[] visitados, List<String> caminoActual,List<String> caminoFinal, String ciudad2) {
        int j;
        Vertex<String> v = grafo.getVertex(i);
        for(Edge<String> e : grafo.getEdges(v)){
            j = e.getTarget().getPosition();
            if (!visitados[j]) {
                visitados[j] = true;
                caminoActual.add(e.getTarget().getData());
                if (ciudad2.equals(e.getTarget().getData())) {
                    caminoFinal.addAll(caminoActual);
                } else {
                    devolverCamino(grafo, j, visitados, caminoActual, caminoFinal, ciudad2);
                }
                caminoActual.remove(caminoActual.size() - 1);
            }
        }

    }















}
