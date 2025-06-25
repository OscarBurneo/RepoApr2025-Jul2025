package Librerias.All.Nodos;

public class NodoBi {
    public int valor;
    public NodoBi izquierda, derecha;

    public NodoBi(int valor){
        this.valor = valor;
        izquierda = derecha = null;
    }
}
