import java.util.Scanner;

public class Ejem6 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int sumPar=0, sumImpar=0;

        System.out.print("\nCantidad de valores?: ");
        int n=sc.nextInt();
        System.out.println();
        int v[]=new int[n];

        ingreso(n, v);
        parImp(v, n, sumPar,sumImpar);
    }
    public static void ingreso(int n, int v[]){
        for(int i=0;i<n;i++){
            System.out.print("Ingrese el "+(i+1)+"º valor: ");
            v[i]=sc.nextInt();
        }
    }
    public static void parImp(int v[],int n,int par, int impar){
        for(int i=0;i<n;i++){
            if(v[i]%2==0){
                par+=v[i];
            }else{
                impar+=v[i];
            }
        }
        System.out.println("\nLa suma de los numeros pares es: "+par);
        System.out.println("La suma de los numeros impares es: "+impar);
    }
    
}
