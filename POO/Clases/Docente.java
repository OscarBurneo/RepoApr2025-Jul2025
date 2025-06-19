package POO.Clases;

public class Docente extends Persona {
    private Integer horasClase;

    public Docente(String nombre, int edad, int dni, Integer horasClase) {
        super(nombre, edad, dni);
        this.horasClase = horasClase;
    }

    public Integer getHorasClase() {
        return horasClase;
    }
    public void setHorasClase(Integer horasClase) {
        this.horasClase = horasClase;
    }
    
    @Override
    public String toString() {
        return "Docente{" +super.toString()+ ", horasClase=" + horasClase + '}';
    }

}
