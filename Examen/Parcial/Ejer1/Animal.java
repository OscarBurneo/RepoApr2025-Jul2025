package Examen.Parcial.Ejer1;

public abstract class Animal {
    public String nombre,Alim, sonido;
    public boolean enfermo;

    public Animal(String nombre, String Alim, String sonido,boolean enfermo) {
        this.Alim = Alim;
        this.nombre = nombre;
        this.sonido = sonido;
        this.enfermo = enfermo;

    }
    public abstract void alimentar();
    public abstract void hacersonido();
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Alimentación: " + Alim);
        System.out.println("Sonido: " + sonido);
        System.out.println("Enfermo: " + (enfermo ? "Sí" : "No"));
    }

    
}
