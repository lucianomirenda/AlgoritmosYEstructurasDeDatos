package practica5;

import java.util.*;
import practica1.ejercicio8.Queue;

public class Recorridos<T> {

    public void printDFS(Graph<T> grafo) {
        boolean[] marca = new boolean[grafo.getSize()];
        for (int i = 0; i < grafo.getSize(); i++) {
            if (!marca[i]) {
                System.out.println("largo con: " + grafo.getVertex(i).getData());
                printDFS(i, grafo, marca);
            }
        }
    }

    private void printDFS(int i, Graph<T> grafo, boolean[] marca) {
        marca[i] = true;
        Vertex<T> v = grafo.getVertex(i);
        System.out.println(v.getData());
        List<Edge<T>> adyacentes = grafo.getEdges(v);
        for (Edge<T> e : adyacentes) {
            int j = e.getTarget().getPosition();
            if (!marca[j]) {
                printDFS(j, grafo, marca);
            }
        }
    }

    public List<T> listaDFS(Graph<T> grafo) {
        List<T> lista = new ArrayList<>();
        boolean[] marca = new boolean[grafo.getSize()];
        for (int i = 0; i < grafo.getSize(); i++) {
            if (!marca[i]) {
                listaDFS(grafo, i, marca, lista);
            }
        }
        return lista;
    }

    public void listaDFS(Graph<T> grafo, Integer i, boolean[] marca, List<T> lista) {
        marca[i] = true;
        Vertex<T> v = grafo.getVertex(i);
        lista.add(v.getData());
        List<Edge<T>> adyacentes = grafo.getEdges(v);
        for (Edge<T> e : adyacentes) {
            int j = e.getTarget().getPosition();
            if (!marca[j]) {
                listaDFS(grafo, j, marca, lista);
            }
        }
    }


    public List<LinkedList<T>> caminosConTaLPeso(Graph<T> grafo, int k) {
        boolean[] marca = new boolean[grafo.getSize()];
        LinkedList<T> actual = null;
        LinkedList<LinkedList<T>> caminos = new LinkedList<LinkedList<T>>();
        int costo = 0;
        for (int i=0; i < grafo.getSize(); i++) {
            actual = new LinkedList<>();
            actual.add(grafo.getVertex(i).getData());
            marca[i] = true;
            caminosConTalPeso(grafo, marca, actual, caminos, i, costo, k);
            marca[i] = false;
        }
        return caminos;
    }

    private void caminosConTalPeso(Graph<T> grafo,boolean[] marca, LinkedList<T> actual, LinkedList<LinkedList<T>> caminos, int i,int costo, int k) {
        Vertex<T> vDestino = null;
        int p = 0; int j = 0;
        Vertex<T> v = grafo.getVertex(i);
        List<Edge<T>> adyacentes = grafo.getEdges(v);
        for(Edge<T> e : adyacentes) {
            j = e.getTarget().getPosition();
            if (!marca[j]) {
                p = e.getWeight();
                if((costo+p) <= k){
                    vDestino = e.getTarget();
                    actual.add(vDestino.getData());
                    marca[j] = true;
                    if ((costo + p) == k) {
                        caminos.add(new LinkedList<>(actual));
                    } else {
                        caminosConTalPeso(grafo,marca,actual,caminos,j,costo + p,k);
                    }
                    actual.remove(vDestino.getData());
                    marca[j] = false;
                }

            }
        }
    }

    public List<T> listaBFS(Graph<T> grafo) {
        boolean[] marca = new boolean[grafo.getSize()];
        List<T> lista = new ArrayList<>();
        for (int i = 0; i < grafo.getSize(); i++) {
            if(!marca[i]){
                listaBFS(grafo, marca, i,lista);
            }
        }
        return lista;
    }

    private void listaBFS(Graph<T> grafo, boolean[] marca, int i, List<T> lista) {
        Queue<Vertex<T>> cola = new Queue<>();
        marca[i] = true;
        Vertex<T> v = grafo.getVertex(i);
        cola.enqueque(v);
        while (!cola.isEmpty()) {
            v = cola.dequeque();
            lista.add(v.getData());
            for (Edge<T> e : grafo.getEdges(v)) {
                i = e.getTarget().getPosition();
                if (!marca[i]) {
                    cola.enqueque(e.getTarget());
                    marca[i] = true;
                }
            }
        }
    }

    public void printBFS(Graph<T> grafo) {
        boolean[] visitados = new boolean[grafo.getSize()];
        for (int i = 0; i < grafo.getSize(); i++) {
            if (!visitados[i]) {
                Vertex<T> v = grafo.getVertex(i);
                printBFS(grafo,visitados,v);
            }
        }
    }

    private void printBFS(Graph<T> grafo,boolean[] visitados,Vertex<T> v) {
        Queue<Vertex<T>> cola = new Queue<>();
        visitados[v.getPosition()] = true;
        cola.enqueque(v);
        while (!cola.isEmpty()) {
            Vertex<T> aux = cola.dequeque();
            System.out.println("soy "+aux.getData());
            for (Edge<T> e : grafo.getEdges(aux)) {
                int j = e.getTarget().getPosition();
                if (!visitados[j]) {
                    cola.enqueque(e.getTarget());
                    visitados[j] = true;
                }
            }
        }

    }




}
