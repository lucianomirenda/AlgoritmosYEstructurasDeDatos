package practica1.ejercicio5;

public class Valores {
	double promedio;
	int maximo;
	int minimo;
	
	public Valores() {};
	
	public Valores(double promedio, int maximo, int minimo) {
		this.promedio = promedio;
		this.maximo = maximo;
		this.minimo = minimo;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	

}
