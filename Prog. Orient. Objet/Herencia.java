import java.util.Scanner;

import POO.Clases.CntCorriente;
import POO.Clases.CntAhorro;
import POO.Clases.Perro;

public class Herencia {
    public static Scanner sc = new Scanner(System.in);

    public static void main1(String[] args) {
        System.out.println("Edad del perrito: ");
        int edad = sc.nextInt();
        Perro miPerro = new Perro("Mamifero", "Labrador", edad);
        miPerro.describir();
        miPerro.ladrar();
        System.out.println("Edad: "+miPerro.calcEdad(edad));
        miPerro.Vacunas(edad);
    sc.close();}

    public static void main(String[] args) {
        System.out.println("Nombre del titular: ");
        String titular = sc.nextLine();
        System.out.println("Saldo de la cuenta: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tipo de cuenta: Ahorro o Corriente");
        String tipoCuenta = sc.nextLine();
        if (tipoCuenta.equalsIgnoreCase("Ahorro")) {
            CntAhorro cuenta = new CntAhorro(titular, 5, saldo);
            cuenta.mostrar();
        } else if (tipoCuenta.equalsIgnoreCase("Corriente")) {
            CntCorriente cuenta = new CntCorriente(titular,7, saldo);
            cuenta.mostrar();
        } else {
            System.out.println("Tipo de cuenta no reconocido.");
        }

    }
}
