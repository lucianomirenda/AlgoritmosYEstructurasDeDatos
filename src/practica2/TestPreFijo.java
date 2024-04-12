package practica2;

import com.sun.source.tree.Tree;

public class TestPreFijo {

    public static void main(String[] args) {

        ParcialPreFijo parcialPreFijo = new ParcialPreFijo();
        TreeTool<Integer> treeTool = new TreeTool<>();
        BinaryTree<Integer> arbol1 = new BinaryTree<>();
        BinaryTree<Integer> arbol2 = new BinaryTree<>();

        arbol1.setData(2);
        arbol2.setData(2);
        arbol2.addRightChild(new BinaryTree<>(4));
        arbol1.addRightChild(new BinaryTree<>(4));

        System.out.println(parcialPreFijo.esPrefijo(arbol1,arbol2));




    }
}
