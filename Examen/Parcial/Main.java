package Examen.Parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Bienvenido a sistema: ");
        System.out.println("Tamaño de la lista: ");
        int tam=sc.nextInt();
        Lista lista=new Lista(tam);
        lista.llenar();
        int opcion=0;
        do{
            System.out.println("\nOpciones:");
            System.out.println("1. Ordenar arreglo.");
            System.out.println("2.Mostrar arreglo.");
            System.out.println("0. Salir.");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1-> lista.ordenar();
                case 2-> lista.mostrar();
                case 0-> System.out.println("Saliendo del sistema.");
                default->System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion!=0);
        
        sc.close();
    }
}
