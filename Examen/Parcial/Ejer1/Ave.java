package Examen.Parcial.Ejer1;

public class Ave extends Animal {
    public String tipo;

    public Ave(String nombre, String Alim,String sonido,boolean enfermo, String tipo) {
        super(nombre, Alim,sonido,enfermo);
        this.tipo = tipo;
    }
    public void alimentar(){
        System.out.println("Alimentando al ave " + nombre + " con " + Alim);
    }
    public void hacersonido(){
        System.out.println("El ave " + nombre + " hace "+sonido);
    }
        @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        
    }

}
