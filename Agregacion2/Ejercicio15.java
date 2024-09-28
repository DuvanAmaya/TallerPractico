import java.util.List;
import java.util.ArrayList;

// Clase Parte: Jugador
class Jugador {
    private String nombre;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}

// Clase Todo: Equipo que tiene Jugadores (agregación)
class Equipo {
    private List<Jugador> jugadores;
    
    // Constructor por defecto
    public Equipo() {
        this.jugadores = new ArrayList<>();
    }
    
    // Constructor con Jugadores
    public Equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    // Método para agregar un jugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    // Método para buscar un jugador por nombre
    public Jugador buscarJugador(String nombre) {
        return jugadores.stream()
            .filter(jugador -> jugador.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }
    
    // Método para eliminar un jugador
    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }
    
    // Método para eliminar todos los jugadores
    public void eliminarTodosLosJugadores() {
        jugadores.clear();
    }
}
