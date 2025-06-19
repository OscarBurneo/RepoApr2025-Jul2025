package POO.Clases;

public class Administrativo extends Persona {
    private int uniforme;

    public Administrativo(String nombre, int edad, int dni, int uniforme) {
        super(nombre, edad, dni);
        this.uniforme = uniforme;
    }   
    public int getUniforme(){
        return uniforme;
    }
    public void setUniforme(int uniforme){
        this.uniforme=uniforme;
    }

    @Override
    public String toString() {
        return "Administrativo{" + super.toString() + ", uniforme=" + uniforme + '}';
    }
}
