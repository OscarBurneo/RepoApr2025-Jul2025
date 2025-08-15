import java.util.Scanner;

public class Ejem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte encontrados;
        int num,c;
        boolean esPrimo;

        System.out.print("Tamaño del arreglo: ");
        int x=sc.nextInt();
        int[] A=new int[x];

        encontrados=0;
        num=1;
        while (encontrados<x) {
            esPrimo=true;
            c=num-1;
            while (c>=2) {
                if(num%c==0){
                    esPrimo=false;
                }
            c-=1;
            }
        if (esPrimo){
            A[encontrados]=num;
            encontrados+=1;
        }
        num+=1;
        }
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i<A.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]\n");
        sc.close();
    }
}
