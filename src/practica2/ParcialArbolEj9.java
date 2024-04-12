package practica2;

public class ParcialArbolEj9 {

    public BinaryTree<Valores> sumAndDif(BinaryTree<Integer> arbol) {

        int padre = 0;
        int suma = 0;

        if (arbol != null) {
            return sumAndDif(arbol, suma, padre);
        } else {
            return null;
        }

    }

    private BinaryTree<Valores> sumAndDif(BinaryTree<Integer> arbol, int suma, int padre) {
        BinaryTree<Valores> nuevoArbol;
        Valores val = new Valores();
        int data;

        if(!arbol.isEmpty()){
            data = arbol.getData();
        } else {
            data = 0;
        }

        val.setSuma(suma+data);
        val.setDif(data - padre);
        nuevoArbol = new BinaryTree<>(val);

        if (arbol.hasLeftChild()) {
            nuevoArbol.addLeftChild(sumAndDif(arbol.getLeftChild(),suma+data,data));
        }

        if (arbol.hasRightChild()) {
            nuevoArbol.addRightChild(sumAndDif(arbol.getRightChild(),suma+data,data));
        }

        return nuevoArbol;
    }

}
