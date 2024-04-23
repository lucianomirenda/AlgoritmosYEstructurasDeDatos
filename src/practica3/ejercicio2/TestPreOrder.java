package practica3.ejercicio2;

import practica2.TreeTool;
import practica3.GeneralTree;
import practica3.GeneralTreeTool;

public class TestPreOrder {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();
        GeneralTreeTool<Integer> treeTool = new GeneralTreeTool<>();
/*
        arbol.setData(2);
        arbol.addChild(new GeneralTree<>(3));
        arbol.addChild(new GeneralTree<>(4));
        arbol.addChild(new GeneralTree<>(5));

        arbol.getChildren().get(2).addChild(new GeneralTree<>(7));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(8));
        arbol.getChildren().get(2).addChild(new GeneralTree<>(9));
*/




        arbol.setData(1);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(8));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));


        System.out.println("por nivel");
        treeTool.printPorNivelSinMarca(arbol);














        /*
        for(GeneralTree<Integer> child : arbol.getChildren()){
            System.out.print("["+child.getData()+"]");
        }

        System.out.println("");

        for (int i = 0; i < arbol.getChildren().size(); i++) {
            for (GeneralTree<Integer> child : arbol.getChildren().get(i).getChildren()) {
                System.out.print("["+child.getData()+"]");
            }

        }

        */

      //  System.out.println(treeTool.listaPorNivel(arbol));

    }
}
