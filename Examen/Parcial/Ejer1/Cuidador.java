package Examen.Parcial.Ejer1;

public class Cuidador {
    public String nombre, especialidad;
    public int Nhabitats=0;
    
    public Cuidador(String nombre,String especialidad){
        this.nombre=nombre;
        this.especialidad=especialidad;

    }
    public void setHabitats() {
        this.Nhabitats = Nhabitats++;
    }
    public int getHabitats() {
        return Nhabitats;
    }
}
