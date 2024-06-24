package practica2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import practica1.ejercicio8.Queue;

public class BinaryTree<T> {

    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;


    public BinaryTree() {
        super();
    }

    public BinaryTree(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * Preguntar antes de invocar si hasLeftChild()
     *
     * @return
     */
    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }

    /**
     * Preguntar antes de invocar si hasRightChild()
     *
     * @return
     */
    public BinaryTree<T> getRightChild() {
        return this.rightChild;
    }

    public void addLeftChild(BinaryTree<T> child) {
        this.leftChild = child;
    }

    public void addRightChild(BinaryTree<T> child) {
        this.rightChild = child;
    }

    public void removeLeftChild() {
        this.leftChild = null;
    }

    public void removeRightChild() {
        this.rightChild = null;
    }

    public boolean isEmpty() {
        return (this.isLeaf() && this.getData() == null);
    }

    public boolean isLeaf() {
        return (!this.hasLeftChild() && !this.hasRightChild());

    }

    public boolean hasLeftChild() {
        return this.leftChild != null;
    }

    public boolean hasRightChild() {
        return this.rightChild != null;
    }

    @Override
    public String toString() {
        return this.getData().toString();
    }

    public int contarHojas() {

        if(this.isEmpty()) return 0;
        else {
            return contarHojasPrivado();
        }
    }

    private int contarHojasPrivado() {
        int childR = 0;
        int childL = 0;
        if(this.isLeaf()) return 1;
        else {
            if (this.hasLeftChild()) {
                childL = this.getLeftChild().contarHojasPrivado();
            }
            if (this.hasRightChild()) {
                childR = this.getRightChild().contarHojasPrivado();
            }
            return childR + childR;
        }
    }

    public BinaryTree<T> espejo() {

        BinaryTree<T> aux = new BinaryTree<T>(this.getData());

        if(this.hasLeftChild()){
            aux.addRightChild(this.getLeftChild().espejo());
        }

        if (this.hasRightChild()) {
            aux.addLeftChild(this.getRightChild().espejo());
        }

        return aux;
    }

    // 0<=n<=m
    public void entreNiveles(int n, int m) {
        BinaryTree<T> aux = null;
        Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
        cola.enqueque(this);
        cola.enqueque(null);
        int nivel = 0;
        while (!cola.isEmpty()) {
            aux = cola.dequeque();
            if (aux != null) { // es un arbol
                if(nivel >= n && nivel <= m)
                     System.out.println(aux.getData());
            if(aux.hasLeftChild())
                cola.enqueque(aux.getLeftChild());
            if(aux.hasRightChild())
                cola.enqueque(aux.getRightChild());
            } else{ // es una marca de fin de nivel
                System.out.println("----");
                nivel++;
                if(!cola.isEmpty())
                    cola.enqueque(null);
            }
        }
    }

    public List<T> listaPreOrden(){

        List<T> list = new ArrayList<>();

        listaPreOrdenPrivado(this,list);

        return list;

    }

    private void listaPreOrdenPrivado(BinaryTree<T> arbol,List<T> list) {

        if(!arbol.isEmpty()){
            list.add(arbol.getData());
        }

        if (arbol.hasLeftChild()) {
            listaPreOrdenPrivado(arbol.getLeftChild(),list);
        }

        if (arbol.hasRightChild()) {
            listaPreOrdenPrivado(arbol.getRightChild(),list);
        }

    }

    public List<T> listaInOrder(){

        List<T> list = new ArrayList<>();

        listInOrderPrivado(this, list);

        return list;

    }

    private void listInOrderPrivado(BinaryTree<T> arbol,List<T> list) {

        if (arbol.hasLeftChild()) {
            listInOrderPrivado(arbol.getLeftChild(), list);
        }

        list.add(arbol.getData());

        if (arbol.hasRightChild()) {
            listInOrderPrivado(arbol.getRightChild(),list);
        }

    }

    public List<T> listaPostOrden(){
        List<T> lista = new ArrayList<>();

        listaPostOrdenPrivate(this,lista);

        return lista;
    }

    private void listaPostOrdenPrivate(BinaryTree<T> arbol, List<T> lista) {
        if (arbol.hasLeftChild()) {
            listaPostOrdenPrivate(arbol.getLeftChild(), lista);
        }

        if (arbol.hasRightChild()) {
            listaPostOrdenPrivate(arbol.getRightChild(), lista);
        }

        lista.add(arbol.getData());

    }
}

