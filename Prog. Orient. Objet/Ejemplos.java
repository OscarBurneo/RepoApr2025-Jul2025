import java.util.Scanner;

public class Ejemplos {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {Calif();}
    public static void Calif(){
        double[] calif=new double[10];
        double suma=0;
        System.out.print("Nombre del estudiante: ");
        String nombre= sc.nextLine();
        for (int i = 0; i < calif.length; i++) {
            System.out.print("Calificacion Nº "+(i+1)+": ");
            calif[i]=sc.nextDouble();
            suma+=calif[i];
        }
        double promedio=suma/calif.length;
        System.out.println("Promedo calificiones: "+promedio);
        System.out.print("Promeio cuantitativo: ");
        if (promedio>=0&&promedio<=3.09) {
            System.out.print("Regular");
        } else if (promedio>=3.10&&promedio<=5.09) {
            System.out.print("Insuficiente");
        } else if (promedio>=5.10&&promedio<=7.09) {
            System.out.print("Bueno");
        } else if(promedio>=7.10&&promedio<=9.09){
            System.out.print("Muy bueno");
        }else if(promedio>=9.10&&promedio<=10){
            System.out.print("Sobresliente");
        }
        System.out.println("\n");
        System.out.println(nombre);
    }
    public void  provincias(){
        String[] provincias = new String[9];
        provincias[0]="Pichincha";
        provincias[1]="Loja";
        provincias[2]="Azuay";
        provincias[3]="Cañar";
        provincias[4]="Bolivar";
        provincias[5]="Guayas";
        provincias[6]="Los Rios";
        provincias[7]="Manabi";
        provincias[8]="Esmeraldas";

        for (int i = 0; i < provincias.length; i++) {
            System.out.println(provincias[i]);
        }
        
    }
}
