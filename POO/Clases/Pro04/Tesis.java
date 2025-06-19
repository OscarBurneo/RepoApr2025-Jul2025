package POO.Clases.Pro04;

public class Tesis extends Recurso {
    private String universidad, FechaDefensa;

    public Tesis(String autor, String titulo, int publicacion, String universidad, String FechaDefensa) {
        super(autor, titulo, publicacion);
        this.universidad = universidad;
        this.FechaDefensa = FechaDefensa;
    }
    @Override
    public String mostrarFicha() {
        return "Tesis: " + super.mostrarFicha() + "\nUniversidad: " + universidad + "\nFecha de Defensa: " + FechaDefensa;
    }

}
