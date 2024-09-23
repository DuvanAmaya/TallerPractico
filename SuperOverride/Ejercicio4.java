package SuperOverride;

class Animal {
    protected String sonido = "Sonido de animal";

    public void hacerSonido() {
        System.out.println(sonido);
    }
}

class Gato extends Animal {
    public Gato() {
        super.sonido = "Guau";

    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato maúlla.");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.hacerSonido();
    }
}
