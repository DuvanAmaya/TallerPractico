package ExtendsImplements;

abstract class Instrumento {
    public abstract void tocar();
}

interface Afinable {
    void afinar();
}

class Guitarra extends Instrumento implements Afinable {
    @Override
    public void tocar() {
        System.out.println("Do,Re,Mi,Do");
    }

    public void afinar() {
        System.out.println("*Afinando*");
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Instrumento instrumento = new Guitarra();
        Afinable afin = new Guitarra();

        instrumento.tocar();
        afin.afinar();
    }
}