package Librerias.All;

import java.util.Scanner;

public class MetMatrices {
    public Scanner sc=new Scanner(System.in); 

    public void ingresarMatriz(int f, int c, int [][] m){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.println("Ingrese el valor de la posicion ["+i+"]["+j+"]");
                m[i][j]=sc.nextInt();
            }
        }   
    }

    public void mostrarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.print("]\n");
        }
    }

    public void transpuestaOri(int[][] m){
        int aux;
        for (int i = 0; i < m.length-1; i++) {
            for (int j = i+1; j < m.length; j++) {
                aux=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=aux;
            }
        }
    }

    public void transpuestaOther(int[][] m,int f,int c){
        int matriz2[][]=new int [c][f];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                matriz2[j][i]=m[i][j];
            }
        }
        System.out.println("Desea mostrar la matriz original y la matriz transpuesta? (1=si, 0=no)");
        int op= sc.nextInt();
        if (op==1){
            System.out.println("Matriz original:");
            mostrarMatriz(m);
            System.out.println("Matriz transpuesta:");
            mostrarMatriz(matriz2);
        }

    }
}
