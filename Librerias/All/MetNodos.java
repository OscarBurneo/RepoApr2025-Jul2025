package Librerias.All;

import java.util.Scanner;
import Librerias.All.Nodos.Nodo;

public class MetNodos {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public void Metodos() {
        sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("\nMenu Principal");
        System.out.println("[1] Insetar");
        System.out.println("[2] Recorrer");
        System.out.println("[3] Buscar");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }

    public int leerDato() {
        System.out.println("Ingrese valor a insertar: ");
        return sc.nextInt();
    }

    public boolean listaVacia() {

        return head == null;
    }

    /*public void insertar() {
        Nodo nuevo = new Nodo(leerDato());
        if (listaVacia()) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }*/

    
     public void insertar() {
        Nodo nuevo = new Nodo(leerDato());
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
           tail.siguiente = nuevo;
           tail = nuevo;
        }
    }
    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.valor + " - ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    public boolean secuencial(int valor) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void buscar(){
        int valor= leerDato();
        if (secuencial(valor)) {
            
        }
    }
    public void eliminar() {
        int valor = leerDato();
        if (listaVacia()) {
            System.out.println("La lista esta vacia");
        } else if (valor == head.valor) {
            head = head.siguiente;
            System.out.println("Valor eliminado: " + valor);
        } else{
            Nodo actual = head;
            while (actual.siguiente != null&& actual.siguiente.valor != valor) {
                actual = actual.siguiente;
                
                    if (actual.siguiente == null) {
                System.out.println("Valor no encontrado");
                    } 
                    System.out.println("Valor eliminado: " + actual.valor);
                    return;
                }
                actual = actual.siguiente;
            
        }
    }
}
