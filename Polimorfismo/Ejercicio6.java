package Polimorfismo;

// Clase Vehiculo
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}

//Clase Moto
class Moto extends Vehiculo {
    @Override
    public void mover() {
    System.out.println("La moto se mueve rápidamente.");
    }
    }

// Clase Avion
class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avion vuela.");
    }
}

//Clase Principal
public class Ejercicio6 {
    public static void main(String[] args) {
        Vehiculo a = new Avion();
        Vehiculo v = new Moto();
        v.mover();
        a.mover();
    }
}