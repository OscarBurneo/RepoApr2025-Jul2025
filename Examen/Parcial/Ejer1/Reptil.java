package Examen.Parcial.Ejer1;

public class Reptil extends Animal {
    public String tipo;

    public Reptil(String nombre, String Alim,String sonido,boolean enfermo, String tipo) {
        super(nombre, Alim,sonido,enfermo);
        this.tipo = tipo;
    }

    public void alimentar() {
        System.out.println("Alimentando al reptil " + nombre + " con " + Alim);
    }
    public void hacersonido() {
        System.out.println("El reptil " + nombre + " hace "+sonido);
    }
        @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        
    }

}
