package InterfacesImplements;
//Interfaz
interface Nadador {
    void nadar();
}

//Clase Pez que implementa Nadador
class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }
}

public class Ejercicio2 {
public static void main(String[] args) {
        Nadador miPez = new Pez();
        miPez.nadar();
    }
} 
