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

        List<Integer> listaMax = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();

        if (!(this.getArbol().isLeaf() && this.getArbol().isEmpty())) {
            caminoAHojaMasLejana(this.getArbol(), lista,listaMax);
        }

        return listaMax;
    }

    private void caminoAHojaMasLejana(GeneralTree<Integer> arbol, List<Integer> lista, List<Integer> listaMax) {

        lista.add(arbol.getData());

        if (arbol.isLeaf()) {
            if (listaMax.size() < lista.size()) {
                listaMax.clear();
                listaMax.addAll(lista);
            }

        } else {
            for (GeneralTree<Integer> child : arbol.getChildren()) {
                caminoAHojaMasLejana(child, lista, listaMax);
            }
        }
        lista.remove(lista.size() - 1);
    }


}
