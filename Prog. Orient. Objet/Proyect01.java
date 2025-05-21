import java.util.Random;
import java.util.Scanner;

import POO.Clases.Libretas;

public class Proyect01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        String nombre, carrera;
        int cedula;
        int[] cedula1=new int[10];
        double prom;
        
        System.out.print("Nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.print("Cedula del estudiante: ");
        cedula = sc.nextInt();
        System.out.print("Carrera del estudiante: ");
        carrera = sc.nextLine();
        System.out.println("Número de notas: ");
        int n=sc.nextInt();
        double[] notas =new double[n];

        for (int i = 0; i < notas.length; i++) {
            notas[i]=random.nextDouble(5,10);
        }
        Libretas libreta = new Libretas(nombre, cedula, carrera,notas);
        libreta.mostrarInf();

        prom=libreta.promedio();
        System.out.println("Promedio: "+libreta.df.format(prom));

        libreta.calif(prom);

        libreta.estado(prom);

    sc.close();}
}
