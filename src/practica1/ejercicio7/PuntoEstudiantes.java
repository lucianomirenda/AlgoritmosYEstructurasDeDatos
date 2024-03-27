package practica1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class PuntoEstudiantes {

    public static void main(String[]args){

        List<Estudiantes> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(new Estudiantes("Pepe",9090,"Analista"));
        listaEstudiantes.add(new Estudiantes("Coco",123,"Lic en Info"));
        listaEstudiantes.add(new Estudiantes("Manuel",999,"Lic en Sistemas"));

        ArrayList<Estudiantes> listaEstudiantesCopia = new ArrayList<>(listaEstudiantes);

        System.out.println("Lista estudiantes");
        for(Estudiantes e : listaEstudiantes){
            System.out.println(e.getNombreApellido() + " " + e.getCarrera());
        }
        System.out.println();
        System.out.println("Lista estudiantes Copia");
        for(Estudiantes e : listaEstudiantesCopia){
            System.out.println(e.getNombreApellido() + " " + e.getCarrera());
        }

        for(Estudiantes e : listaEstudiantes){
            e.setCarrera("Lic. en Informatica");
        }

        System.out.println("Lista estudiantes");
        for(Estudiantes e : listaEstudiantes){
            System.out.println(e.getNombreApellido() + " " + e.getCarrera());
        }
        System.out.println();
        System.out.println("Lista estudiantes Copia");
        for(Estudiantes e : listaEstudiantesCopia){
            System.out.println(e.getNombreApellido() + " " + e.getCarrera());
        }

        Estudiantes estudiante = new Estudiantes("Pepe",9090,"Lic. en Informatica");

        if(listaEstudiantes.contains(estudiante)){
            System.out.println("No agregar");
        }


    }

}
