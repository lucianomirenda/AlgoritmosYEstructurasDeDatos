package practica5;
import java.util.ArrayList;
import java.util.List;
public class TestMapaCiudades {

    public static void main(String[] args) {
        MapaCiudades mapa = new MapaCiudades();
        Recorridos reco = new Recorridos();

        Vertex<String> v1 = mapa.grafo.createVertex("Cipolletti");
        Vertex<String> v2 = mapa.grafo.createVertex("Fernandez Oro");
        Vertex<String> v3 = mapa.grafo.createVertex("Roca");
        Vertex<String> v4 = mapa.grafo.createVertex("Neuquen");
        Vertex<String> v5 = mapa.grafo.createVertex("Buenos Aires");
        Vertex<String> v6 = mapa.grafo.createVertex("Bariloche");

        mapa.grafo.connect(v1,v2,10);
        mapa.grafo.connect(v2,v3,10);
        mapa.grafo.connect(v3,v4,10);
        mapa.grafo.connect(v2,v6,1);
        mapa.grafo.connect(v6,v4,1);
        mapa.grafo.connect(v1, v5,200);
        mapa.grafo.connect(v5,v4,100);

        List<String> ciudades = new ArrayList<>();
        /*
        System.out.println(mapa.caminoConMenorCargaCombustile("Cipolletti","Neuquen",10));
        */
        reco.printBFS(mapa.grafo);

    }
}
