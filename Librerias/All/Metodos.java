package Librerias.All;

import java.util.Scanner;
import java.io.*;


public class Metodos {
    Scanner sc= new Scanner(System.in);
    File Fl =new File("Archivo.txt");
    

    public int menu(){
        System.out.println();
        System.out.println("\nMenu principal:");
        System.out.println("1. Impresion caracter por caracter");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }
    public String read(){
        sc.nextLine();
        System.out.print("Introduza la cadena: ");
        String cadena= sc.nextLine();
        return cadena;
    }
    public String suprBlank(String cadena){
        return cadena.replaceAll(" ", "");
    }
    public void charXchar(){
        String cadena=read();
        for (int i = 0; i<cadena.length(); i++) {
                System.out.print(cadena.charAt(i)+" ");
            }
            
    }
    public void charSearch(){
        String cadena=read();
        System.out.print("Caracter a buscar: ");
        char caracter=sc.next().charAt(0);
        int cant=0;
        for (int i = 0; i<cadena.length(); i++) {
                if (cadena.charAt(i)==caracter) {
                    cant++;
                }
            }
        System.out.println(caracter+" se repite "+cant);
    }
    public void palindromo1(){
        String cadena=read();
        int j=0;
        String cadena2=suprBlank(cadena);
        char[] letras= new char[cadena2.length()];
        boolean palin=true;
        
        for (int i = 0; i < cadena2.length(); i++) {
            letras[i]=cadena2.charAt(i);
        }
        
        for (int i=cadena2.length()-1;i>=0;i--){
            j+=1;
            if (letras[i]!=letras[j-1]) {
                palin=false;
                i=-1;
            }
            
        }
        if (palin) {
            System.out.println(cadena+" es un palindromo.");
        }else {
            System.out.println(cadena+" no es un palindromo.");
            
        }

        
    }
    public void palindromo2(){
        String cadena=read();
        boolean palin=true;
        cadena=suprBlank(cadena);
        for (int i = 0; i < cadena.length()/2; i++) {
            if (cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)) {
                palin=false;
                break;
            }
        }
        if (palin==true) {
            System.out.println("Es palindromo.");
        }else {
            System.out.println("No es palindromo.");
        }
    }

    public void vocales(){
        String cadena=read();
        int X =0;
        char letra;
        String cadena2=cadena.toLowerCase();
        for (int i = 0; i < cadena2.length(); i++) {
            letra=cadena2.charAt(i);
            if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
                X++;
            }
        }
        System.out.println("La cadena tiene "+X+" vocales.");
    }

    public void reduc (){

        String cadena=read();
        for (int i = 0; i <= cadena.length()/2; i++) {
            System.out.println(cadena.substring(i, cadena.length()-i));
        }
    }

    public int menu1(){
        System.out.println();
        System.out.println("\nMenu principal:");
        System.out.println("1.Escribir en el archivo");
        System.out.println("2.Leer el archivo");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }
    public void escribirFile(){
        try {
        sc.nextLine();
        FileWriter write=new FileWriter(Fl,true);
        PrintWriter print=new PrintWriter(write);
        String nombre,dir,correo;
            if (!Fl.exists()) {
                Fl.createNewFile();
            }

        System.out.print("Introduzca su nombre: ");
        nombre=sc.nextLine();
        System.out.print("Introduzca su direccion: ");
        dir=sc.nextLine();
        System.out.print("Introduzca su correo: ");
        correo=sc.nextLine();

            print.print(nombre+"; "+dir+"; "+correo+"\n");
            print.close();
        } catch (Exception e) {
        }
    }

    public void leerFile(){
        try {
            FileReader read=new FileReader(Fl);
            Scanner bffr=new Scanner(read);
            String nombre,dir,correo,cadena=bffr.nextLine().trim();
            String[] datos= cadena.split(";");
            while (bffr.hasNextLine()) {
                nombre=datos[0];
                dir=datos[1];
                correo=datos[2];
                
                System.out.println("Nombre: "+nombre);
                System.out.println("Direccion: "+dir);
                System.out.println("Correo: "+correo);
            }
            bffr.close();
        } catch (Exception e) {
        }
    }
}
