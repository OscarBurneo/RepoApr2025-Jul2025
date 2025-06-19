package POO.Clases.Pro04;

public class Revista extends Recurso {
    private int nEdicion;
    private String URL;

    public Revista(String autor, String titulo, int publicacion, int nEdicion, String URL) {
        super(autor, titulo, publicacion);
        this.nEdicion = nEdicion;
        this.URL = URL;
    }

    @Override
    public String mostrarFicha() {
        return "Revista: " + super.mostrarFicha() + "\nNumero de Edicion: " + nEdicion + ",\nURL: " + URL;
    }
}
