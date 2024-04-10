package practica2;

public class RedBinariaLlena {

    BinaryTree<Integer> arbol;

    RedBinariaLlena(Integer num) {
        arbol = new BinaryTree<>(num);
    }

    int retardoReenvio() {
        int max = -1;

        if (!arbol.isEmpty()) {
            max = retardoReenvioPrivado(arbol);
        }

        return max;
    }

    private int retardoReenvioPrivado(BinaryTree<Integer> a) {
        if (!a.isLeaf()) {

            return Math.max(a.getData()+retardoReenvioPrivado(a.getLeftChild()),
                            a.getData()+retardoReenvioPrivado(a.getRightChild()));

        } else {
            return a.getData();
        }
    }


}
