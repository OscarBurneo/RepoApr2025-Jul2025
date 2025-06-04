package POO.Clases;

public class CntCorriente extends Cuenta {
    public int interes;
    public double saldo;
    public CntCorriente(String titular, int interes, double saldo) {
        super(titular);
        this.interes = interes;
        this.saldo = saldo;
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo de cuenta: Corriente");
        System.out.println("Interes: " + interes + "%");
        System.out.println("Saldo: " + saldo);
        calcularInteres();
        System.out.println("======================================");
    }
    public void calcularInteres() {
        double interesCalculado = (saldo * interes) / 100;
        System.out.println("Interes calculado: " + interesCalculado);
    }

}
