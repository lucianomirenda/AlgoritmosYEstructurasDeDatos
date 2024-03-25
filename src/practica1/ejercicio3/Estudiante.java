package practica1.ejercicio3;

public class Estudiante {

	String nombre;
	String apellido;
	int comision;
	String email;
	String dirección;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
	public String tusDatos() {
		String datos = "nombre: " + this.getNombre() +
						"\napellido: "+ this.getApellido() +
						"\ncomision: "+ this.getComision() +
						"\nemail: " + this.getEmail() +
						"\ndireccion: " + this.getDirección();
						
		return datos;
	}
	
	
}
