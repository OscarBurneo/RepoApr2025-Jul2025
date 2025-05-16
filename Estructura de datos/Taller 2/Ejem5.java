import java.util.Scanner;

public class Ejem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("\nTamaño del arreglo: ");
        int n=sc.nextInt();

        int[] A=new int[n];
        
        System.out.println("\nIngreso de numero: ");

        for (int i = 0; i < A.length; i++) {
            System.out.print("Nº "+(i+1)+": ");
            A[i]=sc.nextInt();
        }
        boolean orden=true;

        for (int i = 0; i < A.length-1; i++) {
            if (A[i]>A[i+1]) {
                orden=false;
                break;
            }
        }
        if (!orden){
            System.out.println("\nEl arreglo no está ordenado ascendentemente");
        }else{
            System.out.println("\nEl arreglo está ordenado ascendentemente");
        }
        sc.close();
    }
}
