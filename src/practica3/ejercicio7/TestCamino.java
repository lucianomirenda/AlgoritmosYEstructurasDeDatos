package practica3.ejercicio7;

import practica3.GeneralTree;

public class TestCamino {

    public static void main(String[] args) {
        Caminos camino = new Caminos(2);

        camino.getArbol().addChild(new GeneralTree<>(3));
        camino.getArbol().addChild(new GeneralTree<>(3));
        camino.getArbol().addChild(new GeneralTree<>(3));

        camino.getArbol().getChildren().get(2).addChild(new GeneralTree<>(4));

        camino.getArbol().getChildren().get(0).addChild(new GeneralTree<>(6));

        camino.getArbol().getChildren().get(1).addChild(new GeneralTree<>(1));
        camino.getArbol().getChildren().get(1).addChild(new GeneralTree<>(11));

        camino.getArbol().getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(111));
        camino.getArbol().getChildren().get(1).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(112));


        camino.getArbol().getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(7));

        System.out.println(camino.caminoAHojaMasLejana());

    }
}
