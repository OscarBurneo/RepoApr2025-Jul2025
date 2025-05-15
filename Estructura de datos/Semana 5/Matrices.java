import Librerias.All.MetMatrices;

public class Matrices {
    public static void main(String[] args) {
        MetMatrices met =new MetMatrices();
        byte op=0;
        System.out.println("Ingrese numero de filas: ");
        int f=met.sc.nextInt();
        System.out.println("Ingrese numero de colunas: ");
        int c=met.sc.nextInt();
        int [][] matriz=new int [f][c];
        met.ingresarMatriz(f, c, matriz);

        System.out.println("Matriz Ingresada: ");
        met.mostrarMatriz(matriz);

        System.out.println("Elija una opcion: "+
                "\n1. Transpuesta de la matriz original."+
                "\n2. Transpuesta de la matriz en otra matriz.");
        op=met.sc.nextByte();
        switch (op){
            case 1:
                met.transpuestaOri(matriz);
                System.out.println("Matriz transpuesta: ");
                met.mostrarMatriz(matriz);
                break;
            case 2:
                met.transpuestaOther(matriz,f,c);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
