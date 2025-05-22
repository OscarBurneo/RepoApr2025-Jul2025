import java.util.Random;

public class Ejem10 {
    public static Random random=new Random();
    public static void main(String[] args) {
        int n=random.nextInt(2,5);
        System.out.println("\nTamaño de la matriz: "+n+"x"+n);
        int[][] matriz=new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=random.nextInt(1,100);
            }
        }
        System.out.println("\nMatriz original: ");
        mostMatriz(n, matriz);
        
        transpuestaSec(n, matriz);
        System.out.println("\nTranspuesta: ");

        mostMatriz(n, matriz);


    }
    public static void mostMatriz(int n,int v[][]){
        int i;
        System.out.print("|-----|");

        String signo="-----|";
        for ( i = 0; i < n-1; i++) {
            System.out.print(signo);
        }
        System.out.println();
        for ( i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("|%4d ", v[i][j]);
            }
            System.out.println("|");
            System.out.print("|-----|");
            for ( int t = 0; t < n-1; t++) {
                System.out.print(signo);
            }
            System.out.println();

        }
    }

    public static void transpuestaSec(int n, int[][] m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int aux = m[i][j];
                m[i][j] = m[n - j - 1][n - i - 1];
                m[n - j - 1][n - i - 1] = aux;
            }
        }
    }
}
