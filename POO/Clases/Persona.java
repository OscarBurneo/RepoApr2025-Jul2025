package POO.Clases;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private transient int dni;
    private String correo;
    
    //constructor 1
    public Persona(){}
    
    //constructor 2
    public Persona(String nombre){
        this.nombre=nombre;
    }
    //constructor 3
    public Persona(String nombre1, int edad1, int dni1, String correo1){
        this.nombre=nombre1;
        this.dni=dni1;
        this.edad=edad1;
        this.correo=correo1;
    }
    
    public void MostrarDatos(){
        System.out.println(" Nombre: "+nombre);
        System.out.println(" Edad: "+edad);
        System.out.println(" DNI: "+dni);
        System.out.println(" Correo: "+correo);
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", correo=" + correo + '}';
    }
    
}