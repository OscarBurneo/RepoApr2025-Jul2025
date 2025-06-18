package Librerias.All;

import java.util.Scanner;

import Librerias.All.Nodos.Nodo;

public class MetPilaCola {
    Scanner sc;
    Nodo pila;
    Nodo cima;

    public void Metodos() {
        sc = new Scanner(System.in);
        this.pila = null;
        this.cima = null;
    }

    public int menu() {
        System.out.println("\nMenu Principal");
        System.out.println("[1] Push");
        System.out.println("[2] Pop");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }

    public int leerDato() {
        System.out.println("Ingrese valor a insertar: ");
        return sc.nextInt();
    }
    public boolean pilaVacia() {

        return pila == null;
    }
    public void pushPila(){
        Nodo nuevo= new Nodo(leerDato());
        if (pilaVacia()) {
            pila=nuevo;
            cima=nuevo;
        }else{
            cima.siguiente=nuevo;
            cima=nuevo;
        }
    }
    public void popPila(){
        if (pilaVacia()) {
            System.out.println("La pila esta vacía.");
        }else {
            System.out.println(cima.valor);
            if (pila==cima) {
                pila=null;
                cima=null;
            }else{
                Nodo actual = pila;
                while (actual.siguiente!=cima) 
                    actual=actual.siguiente;
                
                actual.siguiente=null;
                cima=actual;
            }
        }
    }
}
