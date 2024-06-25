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

    private class Minimo{
        public int distancia;
        public int cargas;
        Minimo(int num) {
            distancia = num;
            cargas = num;
        }
    }

    public List<String> devolverCaminoMinimo(String ciudad1,String ciudad2){
        boolean[] visitados = new boolean[this.grafo.getSize()];
        List<String> listaActual = new LinkedList<>();
        List<String> listaMin = new ArrayList<>();
        Minimo min = new Minimo(Integer.MAX_VALUE);
        if (!this.grafo.isEmpty()) {
            Vertex<String> origen = this.grafo.search(ciudad1);
            Vertex<String> destino = this.grafo.search(ciudad2);
            if (origen != null && destino != null) {
                devolverCaminoMinimo(origen, destino, visitados, listaActual, listaMin, 0, min);
            }
        }
        return listaMin;
    }

    private void devolverCaminoMinimo(Vertex<String> origen, Vertex<String> destino, boolean[] visitados, List<String> listaActual, List<String> listaMin, int suma, Minimo min) {
        visitados[origen.getPosition()] = true;
        listaActual.add(origen.getData());
        if ((origen == destino) && (suma < min.distancia)) {
            min.distancia = suma;
            listaMin.clear();
            listaMin.addAll(listaActual);
        } else {
            List<Edge<String>> ady = this.grafo.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();
            while (it.hasNext() && suma < min.distancia) {
                Edge<String> v = it.next();
                int j = v.getTarget().getPosition();
                int aux = suma + v.getWeight();
                if (!visitados[j] && aux < min.distancia) {
                    devolverCaminoMinimo(v.getTarget(), destino, visitados, listaActual, listaMin, aux, min);
                }
            }
        }
        listaActual.remove(listaActual.size() - 1);
        visitados[origen.getPosition()] = false;
    }

    public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanque) {
        boolean[] visitados = new boolean[this.grafo.getSize()];
        List<String> camino = new LinkedList<>();
        if (!this.grafo.isEmpty()) {
            Vertex<String> origen = this.grafo.search(ciudad1);
            Vertex<String> destino = this.grafo.search(ciudad2);
            if (origen != null && destino != null) {
                caminoSinCargarCombustible(origen, destino, visitados, camino, tanque);
            }
        }

        return camino;
    }

    private boolean caminoSinCargarCombustible(Vertex<String> origen, Vertex<String> destino, boolean[] visitados, List<String> camino, int tanque) {
        boolean encontre = false;
        visitados[origen.getPosition()]=true;
        camino.add(origen.getData());
        if (origen == destino) {
            encontre = true;
        } else {
            List<Edge<String>> ady = this.grafo.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();
            while (it.hasNext() && !encontre) {
                Edge<String> v = it.next();
                int j = v.getTarget().getPosition();
                if (!visitados[j] && (tanque - v.getWeight()) > 0) {
                    encontre = caminoSinCargarCombustible(v.getTarget(), destino, visitados, camino, tanque - v.getWeight());
                }
            }
        }
        if (!encontre) {
            camino.remove(camino.size() - 1);
        }
        visitados[origen.getPosition()] = false;
        return encontre;

    }

    public List<String> caminoConMenorCargaCombustile(String ciudad1, String ciudad2, int tanque) {
        boolean[] visitados = new boolean[this.grafo.getSize()];
        List<String> listaMin = new ArrayList<>();
        List<String> listaAct = new LinkedList<>();
        Minimo min = new Minimo(Integer.MAX_VALUE);

        if (!this.grafo.isEmpty()) {
            Vertex<String> origen = this.grafo.search(ciudad1);
            Vertex<String> destino = this.grafo.search(ciudad2);
            if (origen != null && destino != null) {
                caminoConMenorCargaDeCombustible(origen, destino, visitados, listaMin, listaAct, tanque, tanque, 0, min);
            }
        }
        return listaMin;
    }

    private void caminoConMenorCargaDeCombustible(Vertex<String> origen, Vertex<String> destino,
                                                  boolean[] visitados, List<String> listaMin,
                                                  List<String> listaAct, int tanque, int combustible,
                                                  int cargas, Minimo min) {
        visitados[origen.getPosition()] = true;
        listaAct.add(origen.getData());

        if (tanque <= 0) {
            tanque = combustible;
            cargas++;
        }
        System.out.println("min cargas"+min.cargas);
        if (origen == destino && cargas < min.cargas) {
            listaMin.clear();
            listaMin.addAll(listaAct);
            min.cargas = cargas;
        } else {
            List<Edge<String>> ady = this.grafo.getEdges(origen);
            Iterator<Edge<String>> it = ady.iterator();
            while (it.hasNext() && cargas < min.cargas) {
                Edge<String> v = it.next();
                int j = v.getTarget().getPosition();
                if (!visitados[j]) {
                    caminoConMenorCargaDeCombustible(v.getTarget(), destino, visitados, listaMin,
                            listaAct, tanque - v.getWeight(), combustible, cargas, min);
                }
            }
        }

        visitados[origen.getPosition()] = false;
        listaAct.remove(listaAct.size() - 1);

    }







}
