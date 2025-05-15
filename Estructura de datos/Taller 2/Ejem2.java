import java.util.Scanner;

//Escriba un programa que me permita almacenar en un arreglo unidimensional B, el factorial
//(usar recursividad) de 10 números almacenados previamente en un arreglo A.

public class Ejem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A=new int[10];
        int[] B=new int[10];
        int aux;

        System.out.println("\nIngreso de numero: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nº "+(i+1)+": ");
            A[i]=sc.nextInt();
            aux=A[i];
            B[i]=fact(aux);
        }

        System.out.println("\nArreglo normal: ");
        Out(A);
        System.out.println("\nArreglo factorial: ");
        Out(B);
        
        sc.close();
    }


    public static int fact(int a){
        if (a==0) {
            return 1;
        }else{
            return a*fact(a-1);
        }
    }

    public static void Out(int[] X){
        System.out.print("[ ");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]); 
            if (i<=8) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");
    }
}
