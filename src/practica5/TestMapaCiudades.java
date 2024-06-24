package practica5;

public class TestMapaCiudades {

    public static void main(String[] args) {
        MapaCiudades mapa = new MapaCiudades();

        Vertex<String> v1 = mapa.grafo.createVertex("Cipolletti");
        Vertex<String> v2 = mapa.grafo.createVertex("Fernandez Oro");
        Vertex<String> v3 = mapa.grafo.createVertex("Roca");
        Vertex<String> v4 = mapa.grafo.createVertex("Neuquen");
        Vertex<String> v5 = mapa.grafo.createVertex("Buenos Aires");

        mapa.grafo.connect(v1,v2);
        mapa.grafo.connect(v2,v3);
        mapa.grafo.connect(v2,v5);
        mapa.grafo.connect(v5,v4);

        System.out.println(mapa.devolverCamino("Cipolletti","Neuquen"));
    }
}
