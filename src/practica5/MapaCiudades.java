package practica5;
import practica5.adjList.AdjListGraph;

import javax.net.ssl.SSLContext;
import java.util.*;
public class MapaCiudades {

    AdjListGraph<String> grafo;

    MapaCiudades() {
        grafo = new AdjListGraph<>();
    }
    public List<String> devolverCamino(String ciudad1, String ciudad2) {
        boolean[] visitados = new boolean[grafo.getSize()];
        List<String> camino = new ArrayList<>();
        Vertex<String> origen = this.grafo.search(ciudad1);
        Vertex<String> destino = this.grafo.search(ciudad2);
        if (origen != null && destino != null) {
            devolverCamino(origen,destino,camino,visitados);
        }

        return camino;
    }

    private boolean devolverCamino(Vertex<String> origen, Vertex<String> destino, List<String> camino, boolean[] visitados) {
        boolean encontre = false;
        visitados[origen.getPosition()] = true;
        camino.add(origen.getData());
        if (origen == destino) {
            encontre = true;
        }  else {
            List<Edge<String>> ady = this.grafo.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();
            while (it.hasNext() && !encontre) {
                Vertex<String> v = it.next().getTarget();
                int j = v.getPosition();
                if (!visitados[j]) {
                    encontre = devolverCamino(v, destino, camino, visitados);
                }
            }
        }
        if (!encontre) {
            camino.remove(camino.size() - 1);
        }
        return encontre;
    }

    public List<String> devolverCaminoExceptuando(String ciudad1, String ciudad2, List<String> ciudades) {
        List<String> lista = new ArrayList<>();
        if (!this.grafo.isEmpty()) {
            boolean[] visitados = new boolean[this.grafo.getSize()];
            Vertex<String> origen = this.grafo.search(ciudad1);
            Vertex<String> destino = this.grafo.search(ciudad2);
            if (origen != null && destino != null) {
                devolverCaminoExceptuando(origen, destino, visitados, ciudades, lista);
            }

        }
        return lista;
    }


    private boolean devolverCaminoExceptuando(Vertex<String> origen,Vertex<String> destino,boolean[] visitados,
                                              List<String> ciudades,List<String> lista) {
        boolean encontre = false;
        visitados[origen.getPosition()] = true;
        lista.add(origen.getData());
        if (origen == destino) {
            encontre = true;
        } else {
            List<Edge<String>> ady = this.grafo.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();
            while (it.hasNext() && !encontre) {
                Vertex<String> v = it.next().getTarget();
                int j = v.getPosition();
                if (!visitados[j] && !ciudades.contains(v.getData())) {
                    encontre = devolverCaminoExceptuando(v, destino, visitados, ciudades, lista);
                }
            }
        }
        if (!encontre) {
            lista.remove(lista.size()-1);
        }

        return encontre;
    }













}
