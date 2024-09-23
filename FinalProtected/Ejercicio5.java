package FinalProtected;

final class Constante {
    public final int valor = 42; 

    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

/*class SubConstante extends Constante {
    Esto generará un error de compilación
    No se puede heredar de una clase final
}

public class Ejercicio5 {
    public static void main(String[] args) {
        SubConstante subConstante = new SubConstante();
        subConstante.mostrarValor();
    }   
} */