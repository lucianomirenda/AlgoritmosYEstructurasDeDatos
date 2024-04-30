package practica3.ejercicio7;

import practica3.GeneralTree;

public class TestCamino2 {

    public static void main(String[] args) {
        Caminos camino = new Caminos(2);

        camino.getArbol().addChild(new GeneralTree<>(3));
        camino.getArbol().addChild(new GeneralTree<>(4));
        camino.getArbol().getChildren().get(1).addChild(new GeneralTree<>(5));
        camino.getArbol().getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(6));

        camino.getArbol().getChildren().get(0).addChild(new GeneralTree<>(2));
        camino.getArbol().getChildren().get(0).addChild(new GeneralTree<>(8));


        System.out.println(camino.caminoAHojaMasLejana());

    }

}
