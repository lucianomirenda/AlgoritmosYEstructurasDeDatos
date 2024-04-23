package practica3.ejercicio4;

import practica3.GeneralTree;

public class TestAnalizadorArbol {

    public static void main(String[] args) {

        AnalizadorArbol analizadorArbol = new AnalizadorArbol();
        GeneralTree<AreaEmpresa> arbol = new GeneralTree<>(new AreaEmpresa(10,"ventas"));
        arbol.addChild(new GeneralTree<>(new AreaEmpresa(2,"Recursos Humanos")));
        arbol.addChild(new GeneralTree<>(new AreaEmpresa(4,"Recursos Humanos")));
        arbol.addChild(new GeneralTree<>(new AreaEmpresa(1,"Recursos Humanos")));
        arbol.addChild(new GeneralTree<>(new AreaEmpresa(90,"Recursos Humanos")));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(new AreaEmpresa(20,"Corrupción")));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(new AreaEmpresa(25,"Corrupción")));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(new AreaEmpresa(10,"Corrupción")));


        System.out.println(analizadorArbol.devolverMaximoPromedio(arbol));
    }
}
