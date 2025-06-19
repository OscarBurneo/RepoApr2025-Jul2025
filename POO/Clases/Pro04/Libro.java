package POO.Clases.Pro04;

public class Libro extends Recurso {
    private int nImpresiones;
    private long ISBN;


    public Libro(String autor, String titulo, int publicacion, long ISBN, int nImpresiones) {
        super(autor, titulo, publicacion);
        this.ISBN = ISBN;
        this.nImpresiones = nImpresiones;
    }

    @Override
    public String mostrarFicha() {
        return "Libro: "+super.mostrarFicha() + "\nISBN: " + ISBN + "\nNumero de Impresiones: " + nImpresiones;
    }
}
