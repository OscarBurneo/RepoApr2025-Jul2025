import java.util.Random;
import java.util.Scanner;
import Librerias.All.Taller4.*;

public class Ejer9 {
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
        System.out.println("-------------------------------------------------");
        System.out.println("Lista invertida: ");
        list1=list1.invertir(list1);
        list1.impr();
        
        sc.close();
    }
}