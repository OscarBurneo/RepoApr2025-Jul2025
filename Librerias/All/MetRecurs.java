package Librerias.All;

import java.util.Scanner;

public class MetRecurs {
    Scanner sc;

    public MetRecurs(){
        this.sc= new Scanner(System.in);
    }

    public int menu(){
        System.out.println();
        System.out.println("\nMenu principal:");
        System.out.println("1.Factrial de un numero");
        System.out.println("2.N Fibonacci");
        System.out.println("3.Potencia de un numero");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }

    public int fact(int n){
        if (n==0) {
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    
    public static int fibo(int n) {
        if(n<=0){
            return 0; 
        }else if(n==1){
            return 1; 
        }else{
            return fibo(n-2)+fibo(n-1);
        }
    }

    public int Poten(int B, int E){
        if (E==1) {
            return B;
        }else{
            return B*Poten(B,E-1);
        }
    }
}
