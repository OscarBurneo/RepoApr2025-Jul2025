import java.util.ArrayList;
import java.util.List;


import POO.Clases.Persona;
import POO.Clases.Estudiante;
import POO.Clases.Administrativo;
import POO.Clases.Docente;

public class Proyect03 {
    public static void main(String[] args) {
        System.out.println("Proyecto 03: Herencia y Polimorfismo en Java");

        Persona estudiante1 = new Estudiante("Juan Perez", 20, 12345678, 23);
        Persona estudiante2 = new Estudiante("Maria Lopez", 22, 87654321, 30);

        Persona docente1 = new Docente("Carlos Gomez", 35, 12345678, 20);
        Persona docente2 = new Docente("Ana Torres", 40, 87654321, 25);

        Persona administrativo1 = new Administrativo("Luis Ramirez", 30, 12345678, 1);
        Persona administrativo2 = new Administrativo("Elena Martinez", 28, 87654321, 3);

        ((Administrativo)administrativo2).setNombre("Juanita");
        ((Administrativo)administrativo2).setUniforme(2);

        List <Persona> lista=new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(docente1);
        lista.add(docente2);
        lista.add(administrativo1);
        lista.add(administrativo2);

        ((Docente)docente2).setHorasClase(10);
        ((Administrativo)administrativo1).setUniforme(4);

        

        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    }
}
