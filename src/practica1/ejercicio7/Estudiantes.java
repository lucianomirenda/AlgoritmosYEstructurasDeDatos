package practica1.ejercicio7;

public class Estudiantes {

    private String nombreApellido;
    private int numeroAlumno;
    private String carrera;

    public Estudiantes(String nombreApellido, int numeroAlumno, String carrera) {
        this.nombreApellido = nombreApellido;
        this.numeroAlumno = numeroAlumno;
        this.carrera = carrera;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public boolean equals(Object obj){
        boolean aux = false;
        if(obj != null){
            if(obj instanceof Estudiantes) {

                Estudiantes e = (Estudiantes) obj;

                aux = (this.getCarrera()  == e.getCarrera()) && (this.getNombreApellido() == e.getNombreApellido()) &&
                        (this.getNumeroAlumno() == e.getNumeroAlumno());

            }

        }

        return aux;
    }




}
