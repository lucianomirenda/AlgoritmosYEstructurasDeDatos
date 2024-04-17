package practica3;

import practica1.ejercicio8.Queue;

import java.util.LinkedList;
import java.util.List;

public class RecorridosAG {


    public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n) {

        List<Integer> list = new LinkedList<Integer>();
        numerosImparesMayoresQuePreOrden(a,n,list);
        return list;
    }

    private void numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n, List<Integer> list) {
        if((a.getData() > n)&&(a.getData()%2 == 1)){
            list.add(a.getData());
        }
        for (GeneralTree<Integer> child : a.getChildren()) {
            numerosImparesMayoresQuePreOrden(child,n,list);
        }
    }

    public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> arbol,Integer n) {
        List<Integer> lista = new LinkedList<>();

        numerosImparesMayoresQueInOrden(arbol, n, lista);

        return lista;
    }

    private void numerosImparesMayoresQueInOrden(GeneralTree<Integer> a,Integer n, List<Integer> lista) {
        if (a.hasChildren()) {
            numerosImparesMayoresQueInOrden(a.getChildren().get(0),n,lista);
        }

        if((a.getData() > n)&&(a.getData()%2 == 1)){
            lista.add(a.getData());
        }

        for (int i = 1; i < a.getChildren().size(); i++) {
            numerosImparesMayoresQueInOrden(a.getChildren().get(i),n,lista);
        }
    }

    public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a,Integer n) {
        List<Integer> list = new LinkedList<>();
        numerosImparesMayoresQuePostOrden(a,n,list);
        return list;
    }

    private void numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a,Integer n, List<Integer> lista) {
        for (GeneralTree<Integer> child : a.getChildren()) {
            numerosImparesMayoresQuePostOrden(child,n,lista);
        }
        if((a.getData() > n)&&(a.getData()%2 == 1)){
            lista.add(a.getData());
        }
    }

    public List<Integer> numerosImparesMayoresQuePorNivel(GeneralTree<Integer> arbol,Integer n) {

        GeneralTree<Integer> aux = new GeneralTree<>();
        List<Integer> lista = new LinkedList<>();
        Queue<GeneralTree<Integer>> cola = new Queue<>();

        cola.enqueque(arbol);

        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            if((aux.getData() > n)&&(aux.getData()%2 == 1)){
                lista.add(aux.getData());
            }
            for (GeneralTree<Integer> child : aux.getChildren()) {
                cola.enqueque(child);
            }
        }

        return lista;
    }

}
