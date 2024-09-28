package Composicion2;

// Clase Parte: Puerta
class Puerta {
    private String material;

    public Puerta(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

// Clase Todo: Casa que se compone de una Puerta
class Casa {
    private Puerta puerta;

    // Constructor que recibe una Puerta
    public Casa(Puerta puerta) {
        if (puerta == null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
        }
        this.puerta = puerta;
    }

    // Método para cambiar la puerta
    public void cambiarPuerta(Puerta nuevaPuerta) {
        if (nuevaPuerta == null) {
            throw new IllegalArgumentException("La puerta no puede ser nula.");
        }
        this.puerta = nuevaPuerta;
    }

    // Método para obtener la puerta actual
    public Puerta obtenerPuerta() {
        return this.puerta;
    }

    // Método para eliminar la puerta (lanzar excepción si se intenta eliminar)
    public void eliminarPuerta() {
        throw new UnsupportedOperationException("No se puede eliminar la puerta, TONTOOOOO! ");
    }
}

