package POO.Clases;

public class Cuenta {
    public String titular;

    public Cuenta(String titular) {
        this.titular = titular;
    }
    public void mostrar() {
        System.out.println("======================================");
        System.out.println("Titular: " + titular);
    }
}
