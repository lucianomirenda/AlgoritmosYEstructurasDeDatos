package practica5;

import practica5.adjList.AdjListGraph;

import java.util.LinkedList;
import java.util.List;

public class TestVisitaOslo {
    public static void main(String[] args) {
        AdjListGraph<String> lugares = new AdjListGraph<>();
        Vertex<String> ayuntamiento = lugares.createVertex("Ayuntamiento");
        Vertex<String> elTigre = lugares.createVertex("El Tigre");
        Vertex<String> museoMunch = lugares.createVertex("Museo Munch");
        Vertex<String> parqueBotanico = lugares.createVertex("Parque Botanico");
        Vertex<String> galeriaNacional = lugares.createVertex("Galeria Nacional");
        Vertex<String> parqueVigeland = lugares.createVertex("Parque Vigeland");
        Vertex<String> palacioReal = lugares.createVertex("Palacio Real");
        Vertex<String> akkerBrigge = lugares.createVertex("Akker Brigge");
        Vertex<String> holmenkollen = lugares.createVertex("Holmenkollen");
        Vertex<String> folkMuseum = lugares.createVertex("FolkMuseum");
        Vertex<String> museoVikingo = lugares.createVertex("Museo Vikingo");
        Vertex<String> museoFram = lugares.createVertex("Museo Fram");
        Vertex<String> museoPolar = lugares.createVertex("Museo del Barco Polar");

        lugares.connect(ayuntamiento, elTigre, 15);
        lugares.connect(ayuntamiento, parqueBotanico, 10);
        lugares.connect(ayuntamiento,palacioReal,5);
        lugares.connect(ayuntamiento,akkerBrigge,20);
        lugares.connect(elTigre,museoMunch,15);
        lugares.connect(museoMunch,parqueBotanico,1);
        lugares.connect(parqueBotanico,galeriaNacional,15);
        lugares.connect(galeriaNacional,parqueVigeland,10);
        lugares.connect(parqueVigeland,holmenkollen,30);
        lugares.connect(parqueVigeland, folkMuseum, 20);
        lugares.connect(folkMuseum,palacioReal,5);
        lugares.connect(folkMuseum,akkerBrigge,30);
        lugares.connect(akkerBrigge,museoVikingo,30);
        lugares.connect(folkMuseum,museoFram,5);
        lugares.connect(museoFram,museoPolar,5);
        lugares.connect(museoVikingo,museoPolar,5);
        lugares.connect(museoPolar,museoVikingo,5);

        VisitaOslo visitaOslo = new VisitaOslo();
        List<String> restringidos = new LinkedList<>();
        restringidos.add(akkerBrigge.getData());
        restringidos.add(palacioReal.getData());


        System.out.println(visitaOslo.paseoEnBici(lugares,"Museo Vikingo",120,restringidos));


    }
}
