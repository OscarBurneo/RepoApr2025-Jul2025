package Examen.Parcial.Ejer2;

public class Enemigo {
    public String nombre,ataque;
    public String vulnerable,resistente;

    public Enemigo(String nombre, String ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
        if (nombre.equalsIgnoreCase("dragon")) {
            this.vulnerable = "espada"+" y hechizo";
            this.resistente = "arco";
        } else if (nombre.equalsIgnoreCase("esqueleto")) {
            this.vulnerable = "arco"+" y hechizo";
            this.resistente = "espada";
        } else {
            this.vulnerable = "desconocido";
            this.resistente = "desconocido";
        }
    }
}
