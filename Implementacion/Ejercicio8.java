package Implementacion;

// Interfaz Nadador
interface Nadador {
    void nadar();
}

// Clase Delfin que implementa Nadador
class Delfin implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando.");
    }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        Delfin miDelfin = new Delfin();
        
        miDelfin.nadar();
    }
}

