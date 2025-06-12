package Librerias.All;

import java.util.Scanner;

import Librerias.All.Nodos.NodoAlum;
import Librerias.All.Obj.Alumno;

public class MetObj {
    public Scanner sc=new Scanner(System.in);
    public int ev;
    Alumno[] aula;
    NodoAlum head, tail;
    public MetObj(int lim) {
        this.aula = new Alumno[lim];
        this.ev = 0;
        this.head = null;
        this.tail = null;
    }


    public void menu() {
        System.out.println("1. Insertar en arreglo");
        System.out.println("2. Recorrer arreglo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    public Alumno leerDatos() {
        System.out.print("Ingrese ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        float[] notas = new float[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
        }
        return new Alumno(id, nombre, sexo, notas);
    }
    public void insertar(){
        if (ev<aula.length) {
            aula[ev] =leerDatos();
            ev++;
        } else {
            System.out.println("Aula llena, no se pueden agregar mas alumnos.");
            
        }
    }
    
    public void recorrer() {
        if (ev == 0) {
            System.out.println("No hay alumnos en el aula.");
            return;
        }
        for (int i = 0; i < ev; i++) {
            Alumno a = aula[i];
            System.out.println("ID: " + a.id + ", Nombre: " + a.nombre + ", Sexo: " + a.sexo);
        }
    }
    public boolean isEmpty(NodoAlum actual) {
        return actual == null;
    }
    public void Insertar(int id,String nombre, char sexo, float promedio){
        NodoAlum nuevo = new NodoAlum(id, nombre, sexo, promedio);
        if (head == null) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }
    public void GenerarLista() {
        if (ev != 0) {
            for (int i = 0; i < ev; i++) {
                Alumno a = aula[i];
                Insertar(a.id,a.nombre,a.sexo,a.getPromedio());
               
            }
        }else{
            System.out.println("No hay datos...");
        }
    }
    public void reporte(char sex){
        if(!isEmpty(head)){
            NodoAlum actual=head;
            while (!isEmpty(actual)) {
                if (actual.sexo==sex && actual.promedio>=7) {
                    System.out.println("ID: " + actual.id + ", Nombre: " + actual.nombre + ", Sexo: " + actual.sexo + ", Promedio: " + actual.promedio);
                    actual = actual.sig;
                } else {
                    actual = actual.sig;
                }
            }

        }
    }

}
