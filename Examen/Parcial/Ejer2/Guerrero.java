package Examen.Parcial.Ejer2;

public class Guerrero extends Personaje {
    
    public Guerrero(String nombre, String arma, String habilidad) {
        this.nombre = nombre;
        this.arma = arma;
        this.habilidad = habilidad;
        
    }

    @Override
    public void atacar() {
        System.out.print("El guerrero esta atacando con "+(arma));
    }
}
