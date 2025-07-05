import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Metodos met = new Metodos();
        ArbolBB arbolm = new ArbolBB(),arbolh= new ArbolBB();
        int opc=0;

        System.out.println("Bienvenido al sistema de gestión de estudiantes: ");
        System.out.println("Ingrese el total de estudiantes que desea ingresar: ");
        int nEstud=met.tcl.nextInt();

        Alumno[] aula = new Alumno[nEstud];
        met.tcl.nextLine(); 
        do {
            opc = met.menu();
             switch (opc){
                case 1: 
                    met.datosE(aula);
                    met.IngresoArbol(arbolm, arbolh, aula);
                    break;
                case 2:
                    met.Mostrar(aula);
                    break;
                case 3:
                    System.out.println("\nEstudiantes hombres aprobados:");
                    arbolh.Aprob(arbolh.raiz);
                    System.out.println("\nEstudiantes mujeres aprobados:");
                    arbolm.Aprob(arbolm.raiz);
                    break;
                case 4:
                    System.out.println("\nEstudiantes hombres reprobados:");
                    arbolh.Reprob(arbolh.raiz);
                    System.out.println("\nEstudiantes mujeres reprobados:");
                    arbolm.Reprob(arbolm.raiz);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
             }
        } while (opc!=0);
        System.out.println("Gracias por usar el sistema de gestión de estudiantes.");
    }
    
}
class Metodos {
    Scanner tcl = new Scanner(System.in);

    public int menu(){
        System.out.println("\nMenú");
        System.out.println("[1] Ingresar estudiante.");
        System.out.println("[2] Mostrar estudiantes.");
        System.out.println("[3] Mostrar estudiantes aprobados.");
        System.out.println("[4] Mostrar estudiantes reprobados.");
        System.out.println("[0] Salida");
        return tcl.nextInt();
    }    

    void datosE(Alumno[] aula) {
        double[] notas = new double[3];
        for (int j = 0; j < aula.length; j++) {
            System.out.println("\nIngrese los datos del estudiante nº " + (j + 1) + ":");
            tcl.nextLine();
            System.out.print("Nombre del estudiante: ");
            String nombre = tcl.nextLine();
            System.out.print("ID del estudiante: ");
            int id = tcl.nextInt();
            tcl.nextLine();
            System.out.print("Ingrese el sexo del estudiante(H/M): ");
            String sexo = tcl.nextLine().toUpperCase();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = tcl.nextDouble();
            }
        aula[j] = new Alumno(id, nombre, sexo, notas.clone());
        }

    }

    void IngresoArbol(ArbolBB arbolm, ArbolBB arbolh, Alumno[]alumno) {
        for (int i = 0; i < alumno.length; i++) {
            if (alumno != null) {
                if (alumno[i].sexo.equalsIgnoreCase("H")) {
                    arbolh.Ingreso(arbolh.raiz, alumno[i].id, alumno[i].promedio());
                } else if (alumno[i].sexo.equalsIgnoreCase("M")) {
                    arbolm.Ingreso(arbolm.raiz, alumno[i].id, alumno[i].promedio());
                }
            }
        }
    }
    void Mostrar(Alumno[] aula) {
        System.out.println("\nLista de estudiantes Hombres:");
        for (int i = 0; i < aula.length; i++) {
            Alumno alumno = aula[i];
            if (alumno != null) {
                if (alumno.sexo.equalsIgnoreCase("H")) {
                System.out.println("ID: " + alumno.id + ", Nombre: " + alumno.nombre + ", Promedio: " + alumno.promedio());
                }
            }
        }
        System.out.println("\nLista de estudiantes Mujeres:");
        for (int i = 0; i < aula.length; i++) {
            Alumno alumno = aula[i];
            if (alumno != null) {
                if (alumno.sexo.equalsIgnoreCase("M")) {
                System.out.println("ID: " + alumno.id + ", Nombre: " + alumno.nombre + ", Promedio: " + alumno.promedio());
                }
            }
        }
    }


}
class Alumno {
    public int id;
    public String nombre;
    public String sexo;
    public double[] notas;

    public Alumno(int id, String nombre, String sexo, double[]notas) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.notas = notas;
    }

    public double promedio() {
        double sum=0;
        for (double n : notas) {
            sum+=n;
        }
        return sum/ notas.length;
    }
}
class Nodo {
    int valor;
    Nodo izquierdo, derecho;
    double promedio;

    public Nodo(int valor, double promedio) {
        this.valor = valor;
        this.promedio = promedio;
        izquierdo = derecho = null;
    }
    
}
class ArbolBB {
    Nodo raiz;

    public void Aprob(Nodo nodo){
        if (nodo != null){
            Aprob(nodo.izquierdo);
            if (nodo.promedio >= 7.0) {
                System.out.println("Estudiante Id:"+nodo.valor+" Promedio: " + nodo.promedio);
            }
            Aprob(nodo.derecho);
        }
    }

    public void Reprob(Nodo nodo){
        if (nodo != null){
            Reprob(nodo.izquierdo);
            if (nodo.promedio < 7.0) 
                System.out.println("Estudiante Id:"+nodo.valor+" Promedio: " + nodo.promedio);
            Reprob(nodo.derecho);
        }
    }

    public void Ingreso(Nodo nodo, int valor, double promedio) {
        if (nodo == null) {
            raiz = new Nodo(valor, promedio);
        } else if (valor < nodo.valor) {
            if (nodo.izquierdo==null) {
                nodo.izquierdo=new Nodo(valor,promedio);
            } else {
                Ingreso(nodo.izquierdo, valor,promedio);
            }
        } else if (valor > nodo.valor) {
            if (nodo.derecho==null) {
                nodo.derecho=new Nodo(valor,promedio);
            } else {
                Ingreso(nodo.derecho, valor,promedio);
            }
        }
    }

}

