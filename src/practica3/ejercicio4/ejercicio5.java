package practica3.ejercicio4;

import practica3.GeneralTree;

public class ejercicio5 {

    public static void main(String[] args) {
        GeneralTree<Integer> arbol = new GeneralTree<>(2);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(9));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(4));

        arbol.getChildren().get(1).addChild(new GeneralTree<>(6));
        arbol.getChildren().get(1).addChild(new GeneralTree<>(8));

        arbol.getChildren().get(2).addChild(new GeneralTree<>(10));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(11));

        System.out.println(arbol.esAncestro(2,9));

    }
}
