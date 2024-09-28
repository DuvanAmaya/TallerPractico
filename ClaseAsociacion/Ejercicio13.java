package ClaseAsociacion;

import java.util.ArrayList;
import java.util.List;

// Clase Empleado
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Proyecto
class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Asignacion para modelar la relación muchos a muchos entre Empleado y Proyecto
class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado, Proyecto proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    // Método para mostrar la asignación
    public void mostrarAsignacion() {
        System.out.println(empleado.getNombre() + " está asignado al proyecto " + proyecto.getNombre());
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
        //Instancias
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("María");
        
        Proyecto proyecto1 = new Proyecto("Desarrollo Web");
        Proyecto proyecto2 = new Proyecto("Aplicación Móvil");
        
        //Lista
        List<Asignacion> asignaciones = new ArrayList<>();
        
        asignaciones.add(new Asignacion(empleado1, proyecto1));
        asignaciones.add(new Asignacion(empleado1, proyecto2));
        asignaciones.add(new Asignacion(empleado2, proyecto1));
        
        for (Asignacion asignacion : asignaciones) {
            asignacion.mostrarAsignacion();
        }
    }
}

