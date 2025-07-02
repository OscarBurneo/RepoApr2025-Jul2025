package Examen.Parcial.Ejer1;

public class Mamifero extends Animal {
    public String tipo;

    public Mamifero(String nombre, String Alim,String sonido,boolean enfermo, String tipo) {
        super(nombre, Alim,sonido,enfermo);
        this.tipo = tipo;
    }
    public void alimentar(){
        System.out.println("Alimentando al mamífero " + nombre + " con " + Alim);
    }
    public void hacersonido(){
        System.out.println("El mamífero " + nombre + " hace "+sonido);
    }
    @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        
    }
    
}
