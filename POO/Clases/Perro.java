package POO.Clases;

public class Perro extends Animal {
    public String raza;
    public String Nvacunas;
    public Perro(String tipo, String raza, int edad) {
        super(tipo, edad);
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println("Guau Guau - Soy un "+raza);
    }
    public void Vacunas(int edad){
        if (edad <= 3) {
            System.out.println("Cachorro - 3 vacunas");
        } else if (edad > 3) {
            System.out.println("Adulto - 7 vacunas");
        }
    }

}
