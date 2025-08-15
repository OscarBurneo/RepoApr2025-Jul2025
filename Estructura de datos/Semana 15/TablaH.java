import java.util.Scanner;

public class TablaH {
    
}

class Nodo{
    int id;
    String nombre;
    Nodo siguiente;

    public Nodo(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
        siguiente=null;
    }
}
class Metodos {
    public Scanner sc=new Scanner(System.in);
    Nodo[] aula;

    public Metodos(int lim){
        this.aula=new Nodo[lim];
        for (int i = 0; i < lim; i++) {
            aula[i]=null;
        }
    }
    public void insertar(){
        int id, key;
        String nombre;
        System.out.println("Digite el id: ");
        id=sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre=sc.nextLine();
        key =fHash(nombre);
        insertarHash(id, nombre, key);
    }
    public int fHash(String nombre){
        int sum=0;
        for (int i = 0; i < nombre.length(); i++) 
            sum+=(int)nombre.charAt(i);
        return sum%aula.length;
    }

    public void insertarHash(int id, String nombre,int key){
        Nodo nuevo=new Nodo(id,nombre);
        if (aula[key]==null) {
            aula[key]=nuevo;
        } else {
            Nodo actual=aula[key];
            while (actual.siguiente!=null) 
                actual=actual.siguiente;
            actual.siguiente=nuevo;
        }
    }
    public void recorrer(){
        for (int i = 0; i < aula.length; i++) {
            if (aula[i]!=null) {
                Nodo actual=aula[i];
                while (actual!=null) {
                    System.out.println(actual.nombre+" - ");
                    actual=actual.siguiente;
                }
                System.out.println("null");
            }else{
                System.out.println("Posicion "+i+": null");
            }
        }
    }
    
}
