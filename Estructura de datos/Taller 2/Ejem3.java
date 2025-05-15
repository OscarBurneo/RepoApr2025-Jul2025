import java.util.Scanner;

//Escriba un programa que me permita almacenar en un arreglo, el número de la serie fibonacci
//(usar recursividad) correspondiente a cada una de sus posiciones.

public class Ejem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Tamaño del arreglo: ");
        int x=sc.nextInt();
        int[] A=new int[x];

        for (int i = 0; i < A.length; i++) {
            A[i]=fibo(i);
        }

        System.out.println("Arreglo de secuencia Fibonacci: ");
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]); 
            if (i< A.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");
        sc.close();
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


}
