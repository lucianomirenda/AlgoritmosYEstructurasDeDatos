package practica3.ejercicio7;

import practica3.GeneralTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Caminos {

    GeneralTree<Integer> arbol;

    public GeneralTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(GeneralTree<Integer> arbol) {
        this.arbol = arbol;
    }

    Caminos(Integer data){
        arbol = new GeneralTree<>(data);
    }

    public List<Integer> caminoAHojaMasLejana() {

        List<Integer> maxList = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();

        if (!(this.getArbol().isLeaf() && this.getArbol().isEmpty())) {
            maxLista(this.getArbol(), lista,maxList);
        }

        return maxList;
    }


    private void maxLista(GeneralTree<Integer> arbol, List<Integer> lista, List<Integer> listaMax) {

        if (arbol.isLeaf()) {
            lista.add(arbol.getData());
        } else {

            for (GeneralTree<Integer> child : arbol.getChildren()) {
                lista.add(arbol.getData());
                maxLista(child, lista,listaMax);
                if (lista.size() > listaMax.size()) {
                    listaMax.clear();
                    for (Integer num : lista) {
                        listaMax.add(num);
                    }
                }
                lista.clear();
            }

        }

    }

}
