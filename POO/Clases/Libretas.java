package POO.Clases;

import java.text.DecimalFormat;

public class Libretas {
    private String nombre;
    private int cedula;
    private String carrera;
    private double[] notas;
    public DecimalFormat df= new DecimalFormat("#.##");

    public Libretas(String nombre, int cedula, String carrera, double[] notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.notas = notas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public String toString() {
        return "Libretas{"+"nombre= "+nombre+", cedula= "+cedula+", carrera= "+ carrera+", notas= " + notas+'}';
    }
    public void mostrarInf() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Notas: ");
        for (double nota : notas) {
            System.out.println(df.format(nota));
        }
    }
    public double promedio() {
        double suma = 0,prom=0;
        for (double nota : notas) {
            suma += nota;
        }
        prom=suma/notas.length;
        return prom;
    }
    public void calif(double promedio) {
        System.out.print("Promedio cuantitativo: ");
        if (promedio>=0&&promedio<=4) {
            System.out.print("Regular");
        } else if (promedio>=4.10&&promedio<=7) {
            System.out.print("Malo");
        } else if(promedio>=7.10&&promedio<=9){
            System.out.print("Bueno");
        }else if(promedio>=9.10&&promedio<=10){
            System.out.print("Sobresaliente");
        }
        System.out.println("\n");

    }
    public void estado(double promedio){
        System.out.print("Estado: ");
        if (promedio>=7) {
            System.out.print("Aprobado");
        } else {
            System.out.print("Reprobado");
        }
        System.out.println("\n");
    }
    public void valCedula(){

    }
}
