package practica2;

import com.sun.source.tree.Tree;

import java.util.List;

public class PreParcialTest {

    public static void main(String[] args) {

        BinaryTree<Integer> binario = new BinaryTree<>(1);
        TreeTool<Integer> treeTool = new TreeTool<>();

        binario.addRightChild(new BinaryTree<>(300));
        binario.addLeftChild(new BinaryTree<>(3));
        binario.getLeftChild().addLeftChild(new BinaryTree<>(8));

        binario.getRightChild().addRightChild(new BinaryTree<>(100));

        System.out.println(treeTool.retornarListaMaxima(binario));


    }

}
