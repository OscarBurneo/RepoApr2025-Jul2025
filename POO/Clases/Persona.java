package POO.Clases;


public class Persona  {
    private String nombre;
    private int edad;
    private int dni;
    private String correo;
    
    //constructor 1
    public Persona(){}
    
    //constructor 2
    public Persona(String nombre, int edad, int dni){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }
    //constructor 3
    public Persona(String nombre, int edad, int dni, String correo){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        this.correo=correo;
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
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni +'}';
    }
    
}