import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import POO.Clases.Persona;

public class Proyect02 {
    public static void main(String[] args) throws IOException, SecurityException, ClassNotFoundException {
        Persona persona= new Persona();
        persona.setNombre("Juan Perez");
        persona.setEdad(30);
        persona.setDni(12345678);
        persona.setCorreo("pipipi");
        
        FileOutputStream fileOutputStream= new FileOutputStream("persona.txt");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("persona.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Persona personaLeida = (Persona) objectInputStream.readObject();

        System.out.println(personaLeida);

        objectInputStream.close();

        fileInputStream.close();

        
    }
}
