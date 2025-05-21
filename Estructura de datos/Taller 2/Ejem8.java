
import java.util.Scanner;

public class Ejem8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,m=1;
        String dia;
        boolean correct=false;        

        System.out.println("Total de clientes: ");
        n=sc.nextInt();
        sc.nextLine();
        String[] clientes=new String[n];
        String[][] registro=new String[n][6];

        for (int i = 0; i < clientes.length; i++) {
            correct=false;
            System.out.print("Nombre del "+(i+1)+"º cliente: ");
            clientes[i]=sc.nextLine();
            while (!correct) {
                System.out.print("Veces que asistió: ");
                m=sc.nextInt();
                if (m<=0||m>=7) {
                    System.out.println("Las veces que asistio son incoerentes(El valor debe ser entre 1 y 6).");
                }else{
                    correct=true;
                }
            }

            System.out.println("Día/s de la semana que asistio: ");
            sc.nextLine();
            for (int j = 0; j<m; j++) {
                correct=false;
                while (!correct) {
                System.out.print((j+1)+"º: ");
                dia=sc.nextLine().toLowerCase();
                    switch (dia) {
                        case "lunes":
                            registro[i][0]="X";
                            correct=true;
                            break;
                        case "martes":
                            registro[i][1]="X";
                            correct=true;
                            break;
                        case "miercoles":
                            registro[i][2]="X";
                            correct=true;
                            break;
                        case "jueves":
                            registro[i][3]="X";
                            correct=true;
                            break;
                        case "viernes":
                            registro[i][4]="X";
                            correct=true;
                            break;
                        case "sabado":
                            registro[i][5]="X";
                            correct=true;
                            break;
                    
                        default:
                        System.out.println("Dia no valido o mal escrito.");
                        System.out.println("Día/s de la semana que asistio: ");
                            break;
                }
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 6; k++) {
                if (registro[i][k]==null) {
                    registro[i][k]="-";
                }
                
            }
        }


        System.out.printf("%n %-10s %10s %12s %12s %12s %12s %12s %n","Cliente ","lunes","martes","miercoles","jueves","viernes","sábado");
        for (int i = 0; i < n; i++) {
            System.out.printf("%n %-10s %10s %12s %12s %12s %12s %12s %n",clientes[i],registro[i][0],registro[i][1],registro[i][2],registro[i][3],registro[i][4],registro[i][5]);
        }
        
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < registro.length; k++) {
                if (registro[i][k]!="-") {
                    
                }    
            }
            
        }
    sc.close();}
}
