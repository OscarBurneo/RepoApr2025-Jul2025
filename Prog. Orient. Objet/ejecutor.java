import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import POO.Clases.Estudiante;

public class ejecutor {

    public static Scanner sc = new Scanner(System.in);
    public static int materias;
    

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        iniciar();

    }

    public static void iniciar() throws FileNotFoundException, IOException, ClassNotFoundException {
        Estudiante estudiante = new Estudiante(null, 0, 0);


        System.out.print("Ingrese su nombre: ");
        estudiante.setNombre(sc.nextLine());

        System.out.print("Ingrese su ciclo: ");
        estudiante.setCiclo(validarEntero());

        System.out.print("\nIngrese el número de materias que ingresará: ");
        materias = validarEntero();

        estudiante.setNumeroMaterias(materias);


        estudiante.agregarMateria();
        estudiante.agregarNotas();
        estudiante.setPromedio(estudiante.promedio());

        FileInputStream fileInputStream = new FileInputStream("estudiante.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("estudiante.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(estudiante);
        objectOutputStream.close();
        fileOutputStream.close();

        Estudiante estudianteL = (Estudiante) objectInputStream.readObject();
        System.out.println(estudianteL);
        objectInputStream.close();
        fileInputStream.close();

        System.out.println("El número de materias aprobadas es: " + estudiante.getNumAprob());
        System.out.println("El número de materias reprobadas es: " + estudiante.getNumReprob());

    }

    public static int validarEntero() {
        int respuesta;
        while(true) {
            if(!sc.hasNextInt()) {
                System.out.print("Ingrese solo valores de tipo entero: ");
                sc.next();
            } else {
                respuesta = sc.nextInt();
                if(respuesta < 0) {
                    System.out.print("\nIngrese elementos mayores a 0: ");
                } else {
                    break;
                }
            }
        }
        return respuesta;

    }

}