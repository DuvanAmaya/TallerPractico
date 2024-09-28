package Agregacion;

import java.util.List;
import java.util.ArrayList;

// Clase Estudiante
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Aula que tiene una lista de Estudiantes
class Aula {
    private List<Estudiante> estudiantes;

    public Aula(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void iniciarClase() {
        System.out.println("Estudiantes en el aula:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Duvan");
        Estudiante estudiante2 = new Estudiante("Braian");
        Estudiante estudiante3 = new Estudiante("Jeremy");

        List<Estudiante> listaDeEstudiantes = new ArrayList<>();
        listaDeEstudiantes.add(estudiante1);
        listaDeEstudiantes.add(estudiante2);
        listaDeEstudiantes.add(estudiante3);

        Aula miAula = new Aula(listaDeEstudiantes);

        miAula.iniciarClase();
    }
}
