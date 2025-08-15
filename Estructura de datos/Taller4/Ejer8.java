import java.util.Random;
import java.util.Scanner;
import Thing.Lista;

public class Ejer8 {
    public static void main(String[] args) {
        Lista list1 = new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        
        for (int i = 0; i < 10; i++) {
            list1.insertar(rnd.nextInt(100));
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Lista 1 de numeros generados: ");
        list1.impr();
        System.out.println("Ingrese el numero limite: ");
        int n=sc.nextInt();

        System.out.println("-------------------------------------------------");
        System.out.println("Lista con numeros dentro del limite: ");
        list1.eraseOverLim(n);
        list1.impr();
        
        sc.close();
    }
}