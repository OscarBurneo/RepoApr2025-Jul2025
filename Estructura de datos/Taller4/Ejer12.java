import java.util.Random;
import java.util.Scanner;
import Librerias.All.Taller4.*;

public class Ejer12{
    public static void main(String[] args) {
        Lista mainList = new Lista();
        Lista list1 = new Lista();
        Lista list2=new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        
        for (int i = 0; i < 10; i++) {
            mainList.insertar(rnd.nextInt(100));
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Lista de numeros generados: ");
        mainList.impr();
        System.out.println("-------------------------------------------------");
        
        mainList.patirIntercalado(list1, list2);
        System.out.println("Lista 1: ");
        list1.impr();
        System.out.println("Lista 2: ");
        list2.impr();
        
        sc.close();
    }
}