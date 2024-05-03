package practica3.creacionListas;

import practica3.GeneralTree;

public class RecorridoTest {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();

        arbol.setData(1);

        arbol.addChild(new GeneralTree<Integer>(2));
        arbol.addChild(new GeneralTree<Integer>(3));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(4));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(5));

        arbol.getChildren().get(1).addChild(new GeneralTree<>(6));
        arbol.getChildren().get(1).addChild(new GeneralTree<>(7));


        Recorrido.recorridoMax(arbol);
    }
}
