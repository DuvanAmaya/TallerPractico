package Asociacion;

// Clase Jugador
class Jugador {
    private String nombre;
    private Equipo equipo; // Asociación bidireccional

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}

// Clase Equipo
class Equipo {
    private String nombre;
    private Jugador jugador; // Asociación bidireccional

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador getJugador() {
        return jugador;
    }
}

public class Ejercicio12 {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Duvan Amaya");

        // Crear una instancia de Equipo
        Equipo equipo = new Equipo("Real Madrid ");

        // Establecer la relación bidireccional
        jugador.setEquipo(equipo);
        equipo.setJugador(jugador);

        // Mostrar el jugador y su equipo
        System.out.println(jugador.getNombre() + " juega en el equipo " + jugador.getEquipo().getNombre());
        System.out.println("El equipo " + equipo.getNombre() + " tiene como jugador a " + equipo.getJugador().getNombre());
    }
}

