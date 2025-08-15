import java.util.Random;
import java.util.Scanner;
import Librerias.All.Taller4.*;

public class Ejer4 {
    public static void main(String[] args) {
        Lista list1 = new Lista();
        Lista list2 = new Lista();
        Lista combi= new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        
        for (int i = 0; i < 5; i++) {
            list1.insertar(rnd.nextInt(100));
            list2.insertar(rnd.nextInt(100));
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Lista 1 de numeros generados: ");
        list1.impr();
        System.out.println("Lista 2 de numeros generados: ");
        list2.impr();

        System.out.println("-------------------------------------------------");
        System.out.println("Lista 1 ordenada: ");
        list1.Ordenar(list1.head,list1.head.siguiente);
        list1.impr();
        System.out.println("Lista 2 ordenada: ");
        list2.Ordenar(list2.head,list2.head.siguiente);
        list2.impr();

        System.out.println("-------------------------------------------------");
        System.out.println("Lista combinada y ordenada: ");
        combi.combinar(list1,list2,combi);
        combi.Ordenar(combi.head, combi.head.siguiente);
        combi.repetido();
        combi.impr();
        System.out.println("-------------------------------------------------");

        sc.close();
    }
}