import java.util.Random;
import java.util.Scanner;

import Librerias.All.Taller4.*;
public class Ejer6 {
    public static void main(String[] args) {
        Lista list1 = new Lista();
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
        System.out.println("Impresion inversa: ");
        System.out.print("null");
        list1.imprInverso(list1.tail.siguiente);
        System.out.println("\n");
        sc.close();
    }
    public static void combinar(Lista lista1,Lista lista2,Lista combi){
        Nodo actual=lista1.head;
        mezclar(actual, combi);
        actual=lista2.head;
        mezclar(actual, combi);

    }
    public static void mezclar(Nodo actual,Lista combi){
        while (actual!=null) {
            combi.insertar(actual.valor);
            actual=actual.siguiente;
        }
    }
}


