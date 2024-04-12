package practica2;

public class TestEj9 {


    public static void main(String[] args) {
        ParcialArbolEj9 parcialArbolEj9 = new ParcialArbolEj9();
        BinaryTree<Integer> arbol = new BinaryTree<>();

        arbol.setData(20);
        arbol.addLeftChild(new BinaryTree<>(5));
        arbol.addRightChild(new BinaryTree<>(30));
        arbol.getLeftChild().addLeftChild(new BinaryTree<>(-5));
        arbol.getLeftChild().addRightChild(new BinaryTree<>(10));
        arbol.getRightChild().addLeftChild(new BinaryTree<>(50));
        arbol.getRightChild().addRightChild(new BinaryTree<>(-9));


        BinaryTree<Valores> arbolNuevo = parcialArbolEj9.sumAndDif(arbol);

        System.out.println("nivel 0. raiz: \nsuma:"+ arbolNuevo.getData().getSuma()+"\ndif: "+ arbolNuevo.getData().getDif());
        System.out.println();
        System.out.println("nivel 1. hijo izquierdo: \nsuma:"+ arbolNuevo.getLeftChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getLeftChild().getData().getDif());
        System.out.println("nivel 1. hijo derecho: \nsuma:"+ arbolNuevo.getRightChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getRightChild().getData().getDif());
        System.out.println();
        System.out.println("nivel 2. hijo izquierdo-izquierdo: \nsuma:"+ arbolNuevo.getLeftChild().getLeftChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getLeftChild().getLeftChild().getData().getDif());
        System.out.println("nivel 2. hijo izquierdo-derecho: \nsuma:"+ arbolNuevo.getLeftChild().getRightChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getLeftChild().getRightChild().getData().getDif());
        System.out.println("nivel 2. hijo derecho-izquierdo: \nsuma:"+ arbolNuevo.getRightChild().getLeftChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getRightChild().getLeftChild().getData().getDif());
        System.out.println("nivel 2. hijo derecho-derecho: \nsuma:"+ arbolNuevo.getRightChild().getRightChild().getData().getSuma()+"\ndif: "+ arbolNuevo.getRightChild().getRightChild().getData().getDif());

    }


}
