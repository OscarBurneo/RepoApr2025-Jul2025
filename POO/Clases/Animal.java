package POO.Clases;

public class Animal {
    public String tipo;
    public int edad;

    public Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }
    public void describir() {
        System.out.println("Tipo: "+tipo);
    }
    public String calcEdad(int edad){
        return (edad<=3)? "Cachorro" : "Adulto";
    }
}
