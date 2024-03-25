package tp1.ejercicio3;

public class Test {
	
	public static void main(String[] args) {
		
		Estudiante[] estudiantesArray = {new Estudiante(),new Estudiante()};
		
		Profesor[] profesoresArray = {new Profesor(), new Profesor(), new Profesor()};
		
		estudiantesArray[0].setNombre("Pepe");
		estudiantesArray[0].setApellido("Lopez");
		estudiantesArray[0].setComision(2);
		estudiantesArray[0].setEmail("pepe.lopez@gmail.com");
		estudiantesArray[0].setDirección("Calle 12 nro 33");
		
		estudiantesArray[1].setNombre("Jorge");
		estudiantesArray[1].setApellido("Libra");
		estudiantesArray[1].setComision(3);
		estudiantesArray[1].setEmail("jorge.libra@gmail.com");
		estudiantesArray[1].setDirección("calle 1 nro 23");
		
		profesoresArray[0].setNombre("Ricardo");
		profesoresArray[0].setApellido("Juarez");
		profesoresArray[0].setEmail("ricardo.juarez@gmail.com");
		profesoresArray[0].setCatedra("Cumbias I");
		profesoresArray[0].setFacultad("Facultad de Artes");
		
		profesoresArray[1].setNombre("Juan");
		profesoresArray[1].setApellido("Simba");
		profesoresArray[1].setEmail("juan.simba@gmail.com");
		profesoresArray[1].setCatedra("Caldo de Pollo III");
		profesoresArray[1].setFacultad("Facultad de Gastronomia");
			
		profesoresArray[2].setNombre("Pepito");
		profesoresArray[2].setApellido("Mendez");
		profesoresArray[2].setEmail("pepito.mendez@hotmail.com");
		profesoresArray[2].setCatedra("Moto 1");
		profesoresArray[2].setFacultad("Pedidos Ya Academy");
		
		for(Estudiante e : estudiantesArray){
			System.out.println(e.tusDatos());
		}
		           
		for(Profesor p : profesoresArray) {
			System.out.println(p.tusDatos());
		}
		
		
		
	}
}
