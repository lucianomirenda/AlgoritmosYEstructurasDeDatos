package practica2;

public class Transformacion {

    public BinaryTree<Integer> arbol;

    Transformacion(){
        arbol = new BinaryTree<>();
    }

    public BinaryTree<Integer> suma() {
        return suma(this.arbol);
    }

    private BinaryTree<Integer> suma(BinaryTree<Integer> arbol) {

        if (arbol.isLeaf()) {
            return new BinaryTree<Integer>(0);
        } else {

            int R = 0;
            int L = 0;

            BinaryTree<Integer> arbolT = new BinaryTree<>();

            if (arbol.hasLeftChild()) {
                L = arbol.getLeftChild().getData();
                arbolT.addLeftChild(suma(arbol.getLeftChild()));
                L+= arbolT.getLeftChild().getData();
            }

            if (arbol.hasRightChild()) {
                R = arbol.getRightChild().getData();
                arbolT.addRightChild(suma(arbol.getRightChild()));
                R+= arbolT.getRightChild().getData();
            }

            arbolT.setData(R+L);

            return arbolT;
        }
    }
}
