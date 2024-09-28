package RelacionesRestantes;

// Clase Persona
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Evento
class Evento {
    private String nombre;

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Matrimonio para modelar la relación muchos a muchos
class Matrimonio {
    private Persona persona;
    private Evento evento;

    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarMatrimonio() {
        System.out.println(persona.getNombre() + " está asociado al evento " + evento.getNombre());
    }

    // Getters
    public Persona getPersona() {
        return persona;
    }

    public Evento getEvento() {
        return evento;
    }
}

public class Ejercicio17 {
    public static void main(String[] args) {
        //instancias
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Maria");

        Evento evento1 = new Evento("Boda");
        Evento evento2 = new Evento("Cumpleaños");

        Matrimonio matrimonio1 = new Matrimonio(persona1, evento1);
        Matrimonio matrimonio2 = new Matrimonio(persona2, evento1);
        Matrimonio matrimonio3 = new Matrimonio(persona1, evento2);

        // Asociaciones
        matrimonio1.mostrarMatrimonio();
        matrimonio2.mostrarMatrimonio();
        matrimonio3.mostrarMatrimonio();
    }
}
