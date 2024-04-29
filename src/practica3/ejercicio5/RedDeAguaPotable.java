package practica3.ejercicio5;

import practica3.GeneralTree;

public class RedDeAguaPotable<Double> extends GeneralTree<Double> {

    public double minimoCaudal(double caudal){

        double minimo;

        if(this.isEmpty() && this.isLeaf()){
            minimo = -1;
        } else {
            minimo = minimoCaudal(caudal,this);
        }

        return minimo;
    }

    private double minimoCaudal(double caudal, GeneralTree<Double> nodo) {

        if (nodo.isLeaf()) {
            return caudal;
        } else {
            double min = caudal*2;

            for (GeneralTree<Double> child : nodo.getChildren()) {
                min = Math.min(min, minimoCaudal(caudal / nodo.getChildren().size(), child));
            }

            return min;
        }
    }
}









