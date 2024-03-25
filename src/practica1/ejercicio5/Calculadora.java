package tp1.ejercicio5;

public class Calculadora {
	

	static Valores val3 = new Valores();
	
	public static void main(String[] args) {
		
		int[] numeros = {2,40,3,55,77,31,12,28,13,4};
		
		Calculadora cal = new Calculadora();
		Valores val1, val2 = new Valores();
		
		
		val1 = valoresPorReturn(numeros);
		
		valoresPorParametro(numeros,val2);
		
		cal.valoresPorVariableGlobal(numeros);
		
		
		System.out.println("Por retorno\nmax: "+val1.getMaximo()+
				"\nmin: "+val1.getMinimo()+
				"\npromedio: "+val1.getPromedio());
		
		System.out.println("Por parametro\nmax: "+val2.getMaximo()+
				"\nmin: "+val2.getMinimo()+
				"\npromedio: "+val2.getPromedio());
		
		System.out.println("Por variables globales\nmax: "+ val3.getMaximo()+
				"\nmin: "+val3.getMinimo()+
				"\npromedio: "+val3.getPromedio());
		
	}
	
	public static Valores valoresPorReturn(int[] numArray){	
		int min= 10000;
		int max = -10000;
		int suma = 0;
		
		for(int num : numArray) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			suma = suma + num;
		}
		
		return new Valores(suma / numArray.length,max,min);			
	}
	
	public static void valoresPorParametro(int[] numArray, Valores val) {
		int min= 10000;
		int max = -10000;
		int suma = 0;
		
		for(int num : numArray) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			suma = suma + num;
		}
		
		val.setMaximo(max);
		val.setMinimo(min);
		val.setPromedio(suma / numArray.length);
		
	}
	
	public void valoresPorVariableGlobal(int[] numArray) {
		
		int min= 10000;
		int max = -10000;
		int suma = 0;
		
		for(int num : numArray) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			suma = suma + num;
		}
		
		val3.setMaximo(max);
		val3.setMinimo(min);
		val3.setPromedio(suma / numArray.length);
		
	}
	
}

