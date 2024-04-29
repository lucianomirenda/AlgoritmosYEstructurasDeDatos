package practica3.ejercicio5;

import practica3.GeneralTree;

public class TestRedAguaPotable {

    public static void main(String[] args) {

        RedDeAguaPotable<Double> red = new RedDeAguaPotable<>();

        red.addChild(new GeneralTree<>());
        red.addChild(new GeneralTree<>());
        red.addChild(new GeneralTree<>());
        red.addChild(new GeneralTree<>());

        red.getChildren().get(3).addChild(new GeneralTree<>());
        red.getChildren().get(3).addChild(new GeneralTree<>());

        System.out.println(red.minimoCaudal(1000));

    }
}
