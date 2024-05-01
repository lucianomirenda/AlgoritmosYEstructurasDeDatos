package practica3.ejercicio11;

import practica3.GeneralTree;

public class Ejercicio11 {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();

        arbol.setData(2);
        arbol.addChild(new GeneralTree<>(2));
        arbol.addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(2));
        arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(2));

        System.out.println(ParcialArboles.resolver(arbol));
    }
}
