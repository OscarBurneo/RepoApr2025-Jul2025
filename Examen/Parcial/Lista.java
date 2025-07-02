package Examen.Parcial;

import java.util.Random;

public class Lista {
    int[]list;
    int tam;
    Random rd=new Random();

    public Lista(int tam){
        this.tam=tam;
        list=new int[tam];
    }
    public void llenar(){
        for (int i = 0; i < tam; i++) {
            list[i] = rd.nextInt(50); 
        }
    }
    public void ordenar(){
        int temp;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
    public void mostrar(){
        System.out.println("Lista ordenada: ");
        for (int i = 0; i < tam; i++) {
            System.out.println(list[i]);
        }
    }
}
