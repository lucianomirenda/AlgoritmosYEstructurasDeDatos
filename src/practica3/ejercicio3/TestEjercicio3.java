package practica3.ejercicio3;

import practica3.GeneralTree;

public class TestEjercicio3 {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();
        arbol.setData(2);

        arbol.addChild(new GeneralTree<>(3));
        arbol.addChild(new GeneralTree<>(1));
        arbol.addChild(new GeneralTree<>(5));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(8));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(7));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(4));

        arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<>(6));
        arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<>(6));


        System.out.println(arbol.ancho());
    }

}
