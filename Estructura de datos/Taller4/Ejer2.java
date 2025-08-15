import java.util.Random;
import java.util.Scanner;
import Librerias.All.Taller4.*;

public class Ejer2 {
    
    public static void main(String[] args) {
        Lista met = new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        

        for (int i = 0; i < 10; i++) 
            met.insertar(rnd.nextInt(100));

        System.out.println("-------------------------------------------------");
        System.out.println("Lista de numeros generados: ");
        met.imprPromedio();
        System.out.println("-------------------------------------------------");
        met.promedio();
        System.out.println("-------------------------------------------------");

        sc.close();
    }
}