package Examen.Parcial.Ejer2;

public class Hechicero extends Personaje{
    public String eficHechizo;
    

    
    @Override
    public void atacar() {
        System.out.println("El hechicero esta atacando con " + arma);
    }
}
