package practica3;

import practica1.ejercicio8.Queue;
import practica2.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {
		GeneralTree<T> aux = new GeneralTree<>();
		Queue<GeneralTree<T>> cola = new Queue<>();
		int nivel = 0;
		cola.enqueque(this);
		cola.enqueque(null);

		while (!cola.isEmpty()) {
			aux = cola.dequeque();
			if (aux != null) {
				if (aux.hasChildren()) {
					for (GeneralTree<T> child : aux.getChildren()) {
						cola.enqueque(child);
					}
				}
			} else {
				if(!cola.isEmpty()){
					nivel++;
					cola.enqueque(null);
				}
			}
		}

		return nivel;
	}
	
	public int nivel(T dato){

		GeneralTree<T> aux = new GeneralTree<>();
		Queue<GeneralTree<T>> cola = new Queue<>();
		int nivel = 0;
		boolean encontrado = false;

		cola.enqueque(this);
		cola.enqueque(null);

		while(!cola.isEmpty()&&!encontrado){
			aux = cola.dequeque();
			if (aux != null) {
				encontrado = dato == aux.getData();
				if (aux.hasChildren()&&!encontrado) {
					for (GeneralTree<T> child : aux.getChildren()) {
						cola.enqueque(child);
					}
				}
			} else {
				if (!cola.isEmpty()) {
					nivel++;
					cola.enqueque(null);
				}
			}
		}

		if (!encontrado) {
			nivel = -1;
		}

		return nivel;
	  }

	public int ancho(){
		GeneralTree<T> aux = new GeneralTree<>();
		Queue<GeneralTree<T>> cola = new Queue<>();
		int cantNodos = 0;
		int ancho = -1;

		cola.enqueque(this);
		cola.enqueque(null);

		while (!cola.isEmpty()) {
			aux = cola.dequeque();
			if (aux != null) {
				cantNodos++;
				for (GeneralTree<T> child : aux.getChildren()) {
					cola.enqueque(child);
				}
			} else {
				ancho = Math.max(ancho,cantNodos);
				if (!cola.isEmpty()) {
					cantNodos = 0;
					cola.enqueque(null);
				}
			}
		}
		
		return ancho;
	}
	public boolean esAncestro(T a, T b){

		GeneralTree<T> childTree = buscarNodo(this,a);
		if (childTree != null) {
			childTree = buscarNodo(childTree, b);
		}

		return childTree != null;
	}

	//esta función busca un dato en el arbol,
	// si lo encuentra retorna el nodo en el cual se encuentra el dato,
	// sino retorna null
	private GeneralTree<T> buscarNodo(GeneralTree<T> a,T dato) {
		if (a.getData() == dato) {
			return a;
		} else {
			for (GeneralTree<T> child : a.getChildren()) {
				GeneralTree<T> resultado = buscarNodo(child, dato);
				if (resultado != null) {
					return resultado;
				}
			}
			return null;
		}
	}

}















