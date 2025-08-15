import java.util.Scanner;

import Librerias.All.Taller4.*;
public class Ejer7{
    public static void main(String[] args) {
        Lista met = new Lista();
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) 
            met.insertar(sc.nextInt());
            
        System.out.println("------------------------------------------------");
        System.out.println("Numeros en la lista: ");
        met.impr();
        
        System.out.println("------------------------------------------------");
        num=met.verificarOrden();
        switch (num) {
            case 1:
                System.out.println("La lista esta ordenada de manera ascendente");
                break;
            case 2:
                System.out.println("La lista esta ordenada de manera descendente");
                break;
            case 0:
                System.out.println("La lista NO esta ordenada ");
                break;
            case -1:
                System.out.println("La lista esta vacía.");
                break;
            default:
                break;
        }
        System.out.println("------------------------------------------------");

        
        sc.close();
    }
}

