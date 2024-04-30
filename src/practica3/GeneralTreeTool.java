package practica3;
import practica1.ejercicio8.Queue;
import practica2.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class GeneralTreeTool <T> {




    public void printInOrder(GeneralTree<T> arbol) {
        if (arbol.hasChildren()) {
            printInOrder(arbol.getChildren().get(0));
        }
        System.out.print("[" + arbol.getData() + "]");
        for (int i = 1; i < arbol.getChildren().size(); i++) {
            printInOrder(arbol.getChildren().get(i));
        }
    }


    public List<T> listInOrden(GeneralTree<T> arbol) {
        List<T> lista = new LinkedList<>();
        listInOrden(arbol, lista);
        return lista;
    }

    private void listInOrden(GeneralTree<T> arbol, List<T> lista) {
        if (arbol.hasChildren()) {
            listInOrden(arbol.getChildren().get(0),lista);
        }
        lista.add(arbol.getData());
        for (int i = 1; i < arbol.getChildren().size(); i++) {
            listInOrden(arbol.getChildren().get(i),lista);
        }
    }


    public void preOrder(GeneralTree<T> arbol) {
        System.out.println(arbol.getData());
        for (GeneralTree<T> child : arbol.getChildren()) {
            preOrder(child);
        }
    }

    public void postOrden(GeneralTree<T> arbol) {
        for (GeneralTree<T> child : arbol.getChildren()) {
            postOrden(child);
        }
        System.out.println(arbol.getData());
    }

    public List<T> listPostOrden(GeneralTree<T> arbol) {
        List<T> list = new LinkedList<>();
        listPostOrden(arbol,list);
        return list;
    }

    private void listPostOrden(GeneralTree<T> arbol, List<T> list) {
        for (GeneralTree<T> child : arbol.getChildren()) {
            listPostOrden(child,list);
        }
        list.add(arbol.getData());
    }

    public List<T> preOrderList(GeneralTree<T> arbol) {
        List<T> list = new LinkedList<>();
        this.preOrderList(arbol, list);
        return list;
    }

    private void preOrderList(GeneralTree<T> arbol, List<T> list) {
        list.add(arbol.getData());
        for (GeneralTree<T> child : arbol.getChildren()) {
            preOrderList(child, list);
        }
    }

    public void printPorNivelConMarca(GeneralTree<T> arbol) {

        GeneralTree<T> aux = new GeneralTree<>();
        Queue<GeneralTree<T>> cola = new Queue<>();
        int nivel = 0;

        cola.enqueque(arbol);
        cola.enqueque(null);

        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            if (aux != null) {
                System.out.println("Dato: "+ aux.getData()+". Nivel: "+nivel);
                for (GeneralTree<T> child : aux.getChildren()) {
                    cola.enqueque(child);
                }
            } else {
                nivel++;
                if (!cola.isEmpty()) {
                    cola.enqueque(null);
                }
            }
        }
    }

    public void printPorNivelSinMarca(GeneralTree<T> arbol) {
        GeneralTree<T> aux = new GeneralTree<>();
        Queue<GeneralTree<T>> cola = new Queue<>();
        cola.enqueque(arbol);
        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            System.out.print("["+aux.getData()+"]");
            for (GeneralTree<T> child : aux.getChildren()) {
                cola.enqueque(child);
            }
        }
    }

    public List<T> listaPorNivel(GeneralTree<T> arbol) {

        GeneralTree<T> aux = new GeneralTree<>();
        List<T> lista = new LinkedList<>();
        Queue<GeneralTree<T>> cola = new Queue<>();

        cola.enqueque(arbol);

        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            lista.add(aux.getData());
            for (GeneralTree<T> child : aux.getChildren()) {
                cola.enqueque(child);
            }
        }

        return lista;
    }


}



















