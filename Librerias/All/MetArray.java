package Librerias.All;

import java.util.Scanner;
public class MetArray {
    Scanner sc;
    int[] arreglo;
    int ev=0;

    public MetArray(){
        this.sc= new Scanner(System.in);
        this.arreglo= new int[10];
    }
    public byte menu(){
        System.out.println();
        System.out.println("\nMenu principal:");
        System.out.println("1.Insertar completo");
        System.out.println("2.Recorrer el arreglo");
        System.out.println("3.Buscar un numero en el arreglo");
        System.out.println("4.Comprobar repetido");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
        byte op= sc.nextByte();
        return op;
    }

    public int LeerDato() {
        System.out.println("Ingrese dato: ");
        return sc.nextInt();
    }

    public void LeerComplet(){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=LeerDato();
        }
        ev=arreglo.length;
    }
    public void Present(){
        for (int i = 0; i < ev; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }

    public int secuencial(int num){
        for (int i = 0; i < ev; i++) {
            if (num==arreglo[i]) {
                return i;
            }
        }
        return -1;
    }

    public void search(){
        int num, resp;
        num=LeerDato();
        resp=secuencial(num);
        if (resp!=-1) {
            System.out.println("El numero "+num+" se encuentra en la posicion: "+resp);
        }else{
            System.out.println("No existe el numero "+num);
        }
    }

    public void RecorrerDer(int pos){
        for (int i = ev; i >pos; i--) {
            arreglo[i]=arreglo[i-1];
        }
    }

    public void Insercion(){
        if (ev<arreglo.length) {
            RecorrerDer(0);
            arreglo[ev]=LeerDato();
            ev++;
        }else{
            System.out.println("No se puede insertar más datos");
        }
    }

    public void repetido(){
        int num = LeerDato();
        if (secuencial(num)==-1) {
            arreglo[ev]=num;
        }else{
            System.out.println("El numero ya existe en el arreglo");
        }
    }

    public void insOrden(){
        if (ev<arreglo.length) {
            int num=LeerDato();
            int pos=0;
            while (pos<ev && num>arreglo[pos]) {
                pos++;
                RecorrerDer(pos);
                arreglo[pos]=num;
                ev++;                
            }
        }else{
            System.out.println("No se puede insertar más datos");
        }
    }

    public int binaria (int num,int ini, int fin){
        if (ini<=fin){
            int medio=(ini+fin)/2;
            if (num==arreglo[medio]){
                return medio;
            }else if (num>arreglo[medio]){
                return binaria(num,ini,medio+1);
            }else{
                return binaria(num,medio-1,fin);
            }
        }
        return -1;
    }
    public void busBinaria(){
        int num=LeerDato();
        int resp=binaria(num,0,ev-1);
        if (resp!=-1) {
            System.out.println("El numero "+num+" se encuentra en la posicion: "+resp);
        }else{
            System.out.println("No existe el numero "+num);
        }
    }

    
}
