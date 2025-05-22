import java.util.Scanner;

public class Ejem11y12 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Total de estudiantes: ");
        int n=sc.nextInt();
        System.out.print("Total de asignaturas: ");
        int m=sc.nextInt();

        int[][] notas=new int[n][m];
        String[] nombres=new String[n];
        String[] asig=new String[m];

        sc.nextLine();
        System.out.println("---------------------------------------------------");
        System.out.println("Nombres de estudiantes: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Estudiante Nº "+(i+1)+": ");
            nombres[i]=sc.nextLine();
        }

        
        System.out.println("---------------------------------------------------");
        System.out.println("Nombres de asignaturas: ");
        for (int i = 0; i < asig.length; i++) {
            System.out.print("Asignatura Nº "+(i+1)+": ");
            asig[i]=sc.nextLine();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Ingreso de notas: ");
        for (int i = 0; i < m; i++) {
            System.out.println("\nAsignatura: "+asig[i]);
            for (int j = 0; j < n; j++) {
                System.out.print("Nota de "+nombres[j]+": ");
                notas[j][i]=sc.nextInt();
            }
            System.out.println("_________________________");
        }
        
        System.out.println("Lsa matriz de notas queda de la siguiente manera:");
        System.out.println("Las filas son los estudiantes y las columnas las asignaturas.\n");
        mostMatriz(n, m, notas);

        System.out.println("---------------------------------------------------");
        System.out.println("Desea ver la nota de un estudiante? [S/N]");
        String respuesta=sc.next().toUpperCase();
        while (respuesta.equals("S")) {
            sc.nextLine();
            System.out.print("Nombre del estudiante: ");
            String nombre=sc.nextLine();
            System.out.println("Asigatura: ");
            String asignatura=sc.nextLine();
            System.out.println();
            boolean correct=false;
            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].equals(nombre)) {
                    for (int j = 0; j < m; j++) {
                        if (asig[j].equals(asignatura)) {
                            System.out.println(nombres[i]+" tiene "+notas[i][j]+" en "+asig[j]+".");
                            correct=true;
                            break;
                        }    
                    }
                    
                }
            }
            if (!correct) {
                System.out.println("El estudiante no se encuentra registrado.");
            }
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ver la nota de otro estudiante? [S/N]");
            respuesta=sc.next().toUpperCase();
        }

    }

    public static void mostMatriz(int n,int m,int v[][]){
        int i;
        System.out.print("|-----|");

        String signo="-----|";
        for ( i = 0; i < m-1; i++) {
            System.out.print(signo);
        }
        System.out.println();
        for ( i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("|%4d ", v[i][j]);
            }
            System.out.println("|");
            System.out.print("|-----|");
            for ( int t = 0; t < m-1; t++) {
                System.out.print(signo);
            }
            System.out.println();

        }
    }

}
