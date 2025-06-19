package POO.Clases.Pro04;

public class Recurso {
    private String autor, titulo;
    private int publicacion;

    public Recurso(String autor, String titulo, int publicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.publicacion = publicacion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;  
    }
    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
    public int getPublicacion() {
        return publicacion;
    }
    public String mostrarFicha() {
        return "\nAutor: " + autor + "\nTitulo: " + titulo + "\nPublicacion: " + publicacion;
    }
}
