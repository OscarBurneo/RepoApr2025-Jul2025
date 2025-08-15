import java.util.Random;
import java.util.Scanner;

import Librerias.All.Taller4.*;
public class Ejer5 {
    public static void main(String[] args) {
        Lista list1 = new Lista();
        Lista list2 = new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        
        for (int i = 0; i < 10; i++) {
            list1.insertar(rnd.nextInt(6));
            //list1.insertar(sc.nextInt());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Lista 1 de numeros generados: ");
        list1.impr();

        System.out.println("-------------------------------------------------");
        System.out.println("Lista principal:");
        list1.impr();
        System.out.println("Lista de repetidos");
        list1.ingresoRepe(list2);
        if (list2.head==null) {
            System.out.println("No hay repetidos, lista vacía.");
        }else{
            list2.Ordenar(list2.head,list2.head.siguiente);
            list2.repetido();
            list2.impr();
        }
        sc.close();
    }
}