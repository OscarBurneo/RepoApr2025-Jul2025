import java.util.Random;
import java.util.Scanner;

public class Ejem9 {
    public static int n=0,m=0;
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\nBienvenido al sistema de reserva de asientos.");
        System.out.println("Por favor, ingrese los siguientes datos del avión:");

        System.out.println("Numero de filas: ");
        n=sc.nextInt();
        System.out.println("Numero de asientos por fila: ");
        m=sc.nextInt();
        String[][] asientos=new String[n][m];

        rellenarAsientos(asientos);

        estadoAsientos(asientos);

        elegirAsiento(asientos);

        System.out.println("¿Desea reservar otro asiento? [S/N]");
        String respuesta=sc.next().toUpperCase();
        while (respuesta.equals("S")) {
            elegirAsiento(asientos);
            System.out.println("¿Desea reservar otro asiento? [S/N]");
            respuesta=sc.next().toUpperCase();
        }
        System.out.println("Gracias por usar el sistema.");

    }

    public static void rellenarAsientos(String[][] asientos){
        Random random=new Random();
        int x;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                x=random.nextInt(0,2);
                if (x==1) {
                    asientos[i][j]="X";
                }else {
                    asientos[i][j]="-";
                }
            }
        }
    }

    public static void estadoAsientos(String[][]asientos){
        System.out.println("El estado de los asientos: ");
        
        System.out.printf("%7d",1);
        for (int i = 2; i <=asientos[n-1].length; i++) {
            if (i%3==0) {
                System.out.printf(" %6d",i);
            }else{
                System.out.printf(" %3d",i);
            }
        }
        System.out.println();
        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("%3d",i+1);
            for (int j = 1; j <= asientos[i].length; j++) {
                if (j%3==0) {
                    System.out.printf(" %6s",asientos[i][j-1]);
                }else{
                    System.out.printf(" %3s",asientos[i][j-1]);
                }
                
            }
            System.out.println();
        }
    }

    public static void elegirAsiento(String[][]asientos){
        int fila,columna;
        boolean correcto=false;
        System.out.println("Elija el asiento que desea: ");
        while (!correcto) {
            System.out.print("Fila: ");
            fila=sc.nextInt();
            System.out.print("Columna: ");
            columna=sc.nextInt();
            if (asientos[fila-1][columna-1]=="X") {
                System.out.println("El asiento ya esta ocupado.");
                System.out.println("¿Es su asiento?[S/N]");
                String respuesta=sc.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("¿Desea liberar el asiento?[S/N]");
                    String respuesta2=sc.next().toUpperCase();
                    if (respuesta2.equals("S")) {
                        correcto=true;
                        asientos[fila-1][columna-1]="-";
                        System.out.println("El asiento ha sido liberado.");
                    }
                }else if (respuesta.equals("N")) {
                    correcto=false;
                    System.out.println("\nElija otro asiento:");
                }
            }else{
                correcto=true;
                asientos[fila-1][columna-1]="X";
            }
        }
        System.out.println("El asiento ha sido reservado.");
        estadoAsientos(asientos);
    }
}
