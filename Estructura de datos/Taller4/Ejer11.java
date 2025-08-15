import java.util.Random;
import java.util.Scanner;
import Thing.Lista;

public class Ejer11{
    public static void main(String[] args) {
        Lista list1 = new Lista();
        Scanner sc =new Scanner(System.in);
        Random rnd= new Random();
        int tot=0,n,x;
        for (int i = 0; i < 10; i++) {
            list1.insertar(rnd.nextInt(100));
            tot++;
        }
        System.out.print("Cantidad de nodos que desea eliminar: ");
        n=sc.nextInt();
        System.out.println("Total de nodos: "+tot);
        System.out.print("Posicion desde la cual quiere comenzar a eliminar: ");
        x=sc.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println("Lista 1 de numeros generados: ");
        list1.impr();
        System.out.println("-------------------------------------------------");
        list1.eliminarDesdePosicion(x, n);
        System.out.println("Lista resultante: ");
        list1.impr();
        
        sc.close();
    }
}