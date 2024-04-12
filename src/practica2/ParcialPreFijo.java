package practica2;

public class ParcialPreFijo {

    public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
        if (a2 == null) {
            return a1 == null;
        } else {
            if (a1 == null) {
                return true;
            } else {
                if (a2.getData() == a1.getData()) {
                    return esPrefijo(a1.getLeftChild(), a2.getLeftChild())
                            && esPrefijo(a1.getRightChild(), a2.getRightChild());
                } else {
                    return false;
                }
            }
        }
    }
}
