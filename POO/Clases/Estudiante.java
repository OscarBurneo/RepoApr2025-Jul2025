package POO.Clases;


import java.util.Scanner;

public class Estudiante extends Persona {
    public static Scanner sc = new Scanner(System.in);
    private int expediente;
    
    private String nombre;
    private int ciclo;
    private String [] materias;
    private int numeroMaterias;
    private double[] notas;
    private double promedio;
    private int NumAprob;
    private int NumReprob;

    public Estudiante(String nombre, int ciclo, int dni, int expediente){
        super(nombre, ciclo, dni);
        this.expediente = expediente;
    }
    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + ", expediente=" + expediente + '}';
    }

    
    public Estudiante(String nombre, int ciclo, int materia) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.materias = new String[numeroMaterias];
        this.notas = new double[numeroMaterias];
        contarAprobReprob();
    }
    public double promedio() {
        double suma = 0,prom=0;
        for (double nota : notas) {
            suma += nota;
        }
        prom=suma/notas.length;
        return prom;
    }
    private void contarAprobReprob() {
        NumAprob = 0;
        NumReprob = 0;
        for (double nota : notas) {
            if (nota >= 7) {
                this.NumAprob++;
            } else {
                this.NumReprob++;
            }
        }
    }
    public void agregarMateria() {
        for (int i = 0; i < materias.length; i++) {
            System.out.print("Ingrese el nombre de la materia: ");
            materias[i]=sc.nextLine();
        }
        setMaterias(materias);
    }
    public void agregarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota de " + materias[i] + ": ");
            notas[i] = sc.nextDouble();
        }
        setNotas(notas);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCiclo() {
        return ciclo;
    }
    public double[] getNotas() {
        return notas;
    }
    public double getPromedio() {
        return promedio;
    }
    public int getNumAprob() {
        return NumAprob;
    }
    public int getNumReprob() {
        return NumReprob;
    }
    
    

}
