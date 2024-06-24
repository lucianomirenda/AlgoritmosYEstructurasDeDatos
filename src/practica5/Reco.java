package practica5;

import practica5.Edge;
import practica5.Graph;
import practica5.Vertex;

public class Reco <T>{

    public void base(Graph<T> grafo){
        boolean[] marca = new boolean[grafo.getSize()];
        for (int i = 0; i < grafo.getSize(); i++) {
            if (!marca[i]) {
                marca[i] = true;
                recorrido(grafo,i,marca);
                marca[i] = false;
            }
        }
    }

    private void recorrido(Graph<T> grafo, int i, boolean[] marca) {
        int j;
        Vertex<T> v = grafo.getVertex(i);
        for (Edge<T> e : grafo.getEdges(v)) {
            j = e.getTarget().getPosition();
            if (!marca[j]) {
                marca[j] = true;
                System.out.println(v.getData()+" hacia "+e.getTarget().getData()+". peso: "+e.getWeight());
                recorrido(grafo,j,marca);
                marca[j] = false;
            }

        }
    }
}
