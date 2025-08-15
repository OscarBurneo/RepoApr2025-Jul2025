import java.text.DecimalFormat;
import java.util.Random;

public class Ejem7 {
    public static void main(String[] args) {
        Random random=new Random();
        DecimalFormat df=new DecimalFormat("#.##");
        double sum=0;
        double[][]clase=new double[4][20];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20; j++) {
                clase[i][j]=random.nextDouble(5,10);
            }
        }
        System.out.println("\nLa media de cada Alumno: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Alumno Nº "+(i+1)+": ");
            for (int j = 0; j < 4; j++) {
                sum+=clase[j][i];
            }
            System.out.println(df.format(sum/4));
            sum=0;
        }

        System.out.println("\nLa media de cada Asignatura: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Asignatura Nº "+(i+1)+": ");
            for (int j = 0; j < 20; j++) {
                sum+=clase[i][j];
            }
            System.out.println(df.format(sum/20));
            sum=0;
        }

        System.out.print("\nLa media de la clase: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20; j++) {
                sum+=clase[i][j];
            }
        }
        System.out.println(df.format(sum/80)+"\n");
    }
}
