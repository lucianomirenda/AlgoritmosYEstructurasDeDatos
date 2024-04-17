package practica3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class RecorridosAGTest {

    public static void main(String[] args) {

        GeneralTree<Integer> arbol = new GeneralTree<>();
        RecorridosAG recorridosAG = new RecorridosAG();

        arbol.setData(1);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(8));
        arbol.addChild(new GeneralTree<>(27));

        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));

        System.out.println("Pre Orden");
        System.out.println(recorridosAG.numerosImparesMayoresQuePreOrden(arbol,2));

        System.out.println("In Orden");
        System.out.println(recorridosAG.numerosImparesMayoresQueInOrden(arbol,2));

        System.out.println("Post Orden");
        System.out.println(recorridosAG.numerosImparesMayoresQuePostOrden(arbol,2));

        System.out.println("Por Nivel");
        System.out.println(recorridosAG.numerosImparesMayoresQuePorNivel(arbol,5));




    }
}
