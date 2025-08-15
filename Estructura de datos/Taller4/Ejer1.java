import java.util.Random;
import java.util.Scanner;

import Thing.Lista;
public class Ejer1{
    public static void main(String[] args) {
        Lista met = new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        int num, actual;

        for (int i = 0; i < 10; i++) 
            met.insertar(rnd.nextInt(100));

        System.out.println("Numero que desea ingresar: ");
        num= sc.nextInt();

        System.out.println("------------------------------------------------");
        System.out.println("Numeros en la lista: ");
        met.impr();
        System.out.println("¿Despues de que numero desea ingresar el elemento?");
        actual = sc.nextInt();

        met.insertarDespues(num, actual);
        System.out.println("------------------------------------------------");

        System.out.println("Lista despues de insertar el elemento: ");
        met.impr();
        System.out.println("------------------------------------------------");

        
        sc.close();
    }
}

