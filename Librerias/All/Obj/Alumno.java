package Librerias.All.Obj;

public class Alumno extends Persona{
    public float[] nota;
    public Alumno(int id, String nombre, char sexo, float[] nota) {
        super(id, nombre, sexo);
        this.nota = nota;
    }
    public float getPromedio(){
        float suma = 0;
        for (float n : nota) {
            suma += n;
        }
        return suma / nota.length;
    }
    

}

