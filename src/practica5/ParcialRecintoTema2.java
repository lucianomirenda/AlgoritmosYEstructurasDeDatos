package practica5;

import java.util.*;

public class ParcialRecintoTema2{

    private Vertex<Recinto> buscarRecinto(Graph<Recinto> grafo, String nombre) {
        List<Vertex<Recinto>> vertices = grafo.getVertices();
        Iterator<Vertex<Recinto>> it = vertices.iterator();
        Vertex<Recinto> aux = null;
        boolean sigo = true;
        while (it.hasNext() && sigo) {
            Vertex<Recinto> actual = it.next();
            if (actual.getData().getNombre().equals(nombre)) {
                aux = actual;
                sigo = false;
            }
        }
        return aux;
    }

    public String resolver(Graph<Recinto> grafo, int tiempo) {
        boolean alcanza = false;
        String respuesta;

        if ((grafo != null) && (!grafo.isEmpty())) {
            Vertex<Recinto> origen = buscarRecinto(grafo, "ENTRADA");
            if (origen != null) {
                boolean[] visitados = new boolean[grafo.getSize()];
                alcanza = resolver(grafo, origen, visitados, 0, tiempo);
            }
        }

        if (alcanza) {
            respuesta = "Alcanzable";
        } else {
            respuesta = "No Alcanzable";
        }

        return respuesta;
    }

    private boolean resolver(Graph<Recinto> grafo, Vertex<Recinto> origen, boolean[] visitados, int cantRecintos, int tiempo) {
        System.out.println("Entra con "+origen.getData().getNombre());
        boolean cumple = false;
        visitados[origen.getPosition()] = true;
        cantRecintos++;
        System.out.println("Cantidad de recinitos visitados: "+cantRecintos);
        System.out.println("Cantidad total de recintos: "+grafo.getSize());
        if (cantRecintos == grafo.getSize()) {
            cumple = true;
        } else {
            List<Edge<Recinto>> ady = grafo.getEdges(origen);
            Iterator<Edge<Recinto>> it = ady.iterator();
            while (it.hasNext() && !cumple) {
                Edge<Recinto> e = it.next();
                int peso = e.getWeight();
                Vertex<Recinto> v = e.getTarget();
                int j = v.getPosition();
                int aux = tiempo - v.getData().getTiempo() - peso;
                if (!visitados[j] && aux >= 0) {
                    cumple = resolver(grafo, v, visitados, cantRecintos, aux);
                }
            }
        }
        visitados[origen.getPosition()] = false;
        System.out.println("Sale con "+origen.getData().getNombre());

        return cumple;
    }


}
