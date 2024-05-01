package practica3.ejercicio9;

import practica3.GeneralTree;

public class TestSeleccion {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();

        arbol.setData(10);
        arbol.addChild(new GeneralTree<>(30));
        arbol.addChild(new GeneralTree<>(15));
        arbol.addChild(new GeneralTree<>(10));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(120));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(30));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(43));

        arbol.getChildren().get(2).addChild(new GeneralTree<>(13));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(10));

        arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<>(13));
        arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<>(13));
        arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<>(20));



        System.out.println(ParcialArboles.esDeSeleccion(arbol));
    }

}
