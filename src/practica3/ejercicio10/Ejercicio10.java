package practica3.ejercicio10;

import practica3.GeneralTree;

public class Ejercicio10 {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();

        arbol.setData(1);
        arbol.addChild(new GeneralTree<>(1));
        arbol.addChild(new GeneralTree<>(0));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(0));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(1));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(1));
        /*

        arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(1));

        arbol.getChildren().get(1).addChild(new GeneralTree<>(1));
        arbol.getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(1));
        arbol.getChildren().get(1).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<>(1));

        */

        System.out.println(ParcialArboles.resolver(arbol));
    }
}
