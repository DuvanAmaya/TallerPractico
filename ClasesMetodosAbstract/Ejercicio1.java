package ClasesMetodosAbstract;
// Clase abstracta Animal
abstract class Animal {
        // Método abstracto
    public abstract void hacerSonido();
}

// Clase Perro que extiende de Animal
class Perro extends Animal {
    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}

//Clase Principal
public class Ejercicio1 {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido();
    }
}