package Librerias.All;

import java.util.Scanner;
import Librerias.All.Nodos.NodoBi;

public class MetArboles {
    public NodoBi raiz;
    public Scanner sc= new Scanner(System.in);

    public int menu(){
        System.out.println();
        System.out.println("\nMenu principal:");
        System.out.println("1.Insertar ");
        System.out.println("2.Recorrer ");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }

    public int LeerDato() {
        System.out.println("Ingrese dato: ");
        return sc.nextInt();
    }
    public Boolean apuntaNulo(NodoBi actual) {
        return actual==null;
    }

    public NodoBi insertar(NodoBi actual, int valor) {
        if (apuntaNulo(actual)) {
            return new NodoBi(valor);
        }
        if (valor < actual.valor) {
            actual.izquierda = insertar(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = insertar(actual.derecha, valor);
        }
        return actual;        

    }
    public void insercon(){
        raiz=insertar(raiz, LeerDato());
    }
    public void recorridoPreorden(NodoBi nodo){
        if (apuntaNulo(nodo)){
            System.out.print(nodo.valor + " ");
            recorridoPreorden(nodo.izquierda);
            recorridoPreorden(nodo.derecha);
        }
    }
    public void recorridoInorden(NodoBi nodo){
        if (apuntaNulo(raiz)){
            recorridoInorden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecha);
        }
    }

    public void recorridoPostorden(NodoBi nodo){
        if (apuntaNulo(raiz)){
            recorridoPostorden(nodo.izquierda);
            recorridoPostorden(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }
}
