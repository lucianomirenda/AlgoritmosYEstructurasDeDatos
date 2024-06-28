package practica5;

import practica5.adjList.AdjListGraph;

public class RecintoTest {

    public static void main(String[] args) {
        AdjListGraph<Recinto> grafo = new AdjListGraph<>();

        Vertex<Recinto> entrada = grafo.createVertex(new Recinto(15, "ENTRADA"));
        Vertex<Recinto> flamencos = grafo.createVertex(new Recinto(10, "Flamencos"));
        Vertex<Recinto> murcielagos = grafo.createVertex(new Recinto(20, "Murcielagos"));
        Vertex<Recinto> tigres = grafo.createVertex(new Recinto(10, "Tigres"));
        Vertex<Recinto> cebras = grafo.createVertex(new Recinto(10, "Cebras"));
        Vertex<Recinto> wallabies = grafo.createVertex(new Recinto(30, "Wallabies"));
        Vertex<Recinto> tortugas = grafo.createVertex(new Recinto(10, "Tortugas"));
        Vertex<Recinto> pumas = grafo.createVertex(new Recinto(10, "Pumas"));

        grafo.connect(entrada, flamencos, 25);
        grafo.connect(entrada,murcielagos,20);
        grafo.connect(entrada,tigres,10);
        grafo.connect(entrada,cebras,10);
        grafo.connect(flamencos,murcielagos,25);
        grafo.connect(murcielagos, wallabies, 10);
        grafo.connect(tigres, cebras, 8);
        grafo.connect(cebras, tigres, 5);
        grafo.connect(wallabies,tortugas,10);
        grafo.connect(wallabies,pumas,2);
        grafo.connect(pumas,tortugas,10);
        grafo.connect(tortugas,cebras,30);
        grafo.connect(cebras,tigres,10);
        grafo.connect(tortugas,pumas,15);

        ParcialRecintoTema2 parcial = new ParcialRecintoTema2();

        System.out.println(parcial.resolver(grafo,400));


    }
}
