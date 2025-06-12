package Librerias.All.Nodos;
import Librerias.All.Obj.Persona;

public class NodoAlum extends Persona{
    public float promedio;
    public NodoAlum sig;
    public NodoAlum(int id, String nombre, char sexo,float promedio) {
        super(id, nombre, sexo);
        this.promedio = promedio;
        sig = null;
    }
}
