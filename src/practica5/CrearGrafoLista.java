package practica5;

import practica5.adjList.AdjListGraph;

public class CrearGrafoLista {

    public static void main(String[] args) {

        AdjListGraph<Integer> grafo = new AdjListGraph<>();
        Recorridos recorridos = new Recorridos();
        Reco<Integer> recos = new Reco<>();

        Vertex<Integer> A = grafo.createVertex(1);
        Vertex<Integer> B = grafo.createVertex(2);
        Vertex<Integer> C = grafo.createVertex(7);
        Vertex<Integer> D = grafo.createVertex(4);
        Vertex<Integer> E = grafo.createVertex(6);

        grafo.connect(A,B,10);
        grafo.connect(A,C,5);
        grafo.connect(C,D,5);
        grafo.connect(B,D,5);
        grafo.connect(C,E,13);
        grafo.connect(B,E,4);

        grafo.getEdges(A).get(0).getWeight();

        System.out.println("Grafo Creado");

        /*
        for (Vertex<Integer> v : grafo.getVertices()) {
            System.out.print(v.getData() + ": ");
            for(Edge<Integer> e : grafo.getEdges(v)) {
                System.out.print(e.getTarget().getData()+ " ");
            }
            System.out.println();
        }

        recorridos.printDFS(grafo);

         */
        recos.base(grafo);
    }

}
