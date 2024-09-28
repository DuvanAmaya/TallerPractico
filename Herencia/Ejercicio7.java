package Herencia;

class Animal {
    // Método de la clase Animal
    public void hacerSonido() {
        System.out.println("El animal está haciendo un sonido.");
    }
}

// Clase derivada Perro que hereda de Animal
class Perro extends Animal {
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        
        miPerro.hacerSonido();
        miPerro.moverCola();
    }
}
