import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Calficaf {
    public static Random random=new Random();
    public static Scanner sc=new Scanner(System.in);
    public static DecimalFormat df=new DecimalFormat("#.##");
    public static double sum=0;
    public static int tot=0;
    public static void main(String[] args) {
        int op=0;
        System.out.print("Numero de estudiantes: ");
        int n=sc.nextInt();
        double[][]clase=new double[6][n];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < n; j++) {
                clase[i][j]=random.nextDouble(5,10);
            }
        }
        op=menu();
        while (op!=0) {
            switch (op) {
                case 1:
                    nPromedio(clase,n);
                    break;
                case 2:
                    nAprobados(clase,n);
                    break;
                case 3:
                    nReprobados(clase,n);
                    break;
                case 4:
                    nPromedioAsig(clase,n);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            op=menu();
        }
        System.out.println("\nFin del programa");
    }

    public static int menu(){
        System.out.println("\n===========================================");
        System.out.println("Menu principal:");
        System.out.println("1.Promedio de cada Alumno");
        System.out.println("2.Aprobados");
        System.out.println("3.Reprobados");
        System.out.println("4.Promedio de cada Asignatura");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }

    public static void nPromedio(double[][]clase,int n){
        System.out.println("\nPromedio de cada Alumno: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Alumno Nº "+(i+1)+": ");
            for (int j = 0; j < 6; j++) {
                sum+=clase[j][i];
            }
            System.out.println(df.format(sum/6));
            sum=0;
        }
    }
    public static void nAprobados(double[][]clase,int n){

        System.out.println("\nEstudiantes Aprobados: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("\nAsignatura Nº "+(i+1)+": ");
            for (int j = 0; j < n; j++) {
                if (clase[i][j]>=6.5) {
                    System.out.println(" Alumno Nº "+(j+1)+" Nota: "+df.format(clase[i][j]));
                    tot++;
                }
            }
            System.out.println("Aprobados Asignatura "+(i+1)+": "+tot);
            tot=0;
        }
    }
    public static void nReprobados(double[][]clase,int n){
        System.out.println("\nEstudiantes Reprobados: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("\nAsignatura Nº "+(i+1)+": ");
            for (int j = 0; j < n; j++) {
                if (clase[i][j]<6.5) {
                    System.out.println(" Alumno Nº "+(j+1)+" Nota: "+df.format(clase[i][j]));
                    tot++;
                }
            }
            System.out.println("Reprobados Asignatura "+(i+1)+": "+tot);
            tot=0;
        }
    }
    public static void nPromedioAsig(double[][]clase,int n){
        System.out.println("\nPromedio de cada Asignatura: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Asignatura Nº "+(i+1)+": ");
            for (int j = 0; j < n; j++) {
                sum+=clase[i][j];
            }
            System.out.println(df.format(sum/n));
            sum=0;
        }
    }
}

