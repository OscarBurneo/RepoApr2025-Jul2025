

import POO.Clases.Pro04.*;

public class Proyect04 {
    public static void main(String[] args) {
        
        // Creación de recursos
        Recurso libro = new Libro("Gabriel García Márquez", "Cien años de soledad", 1967, 307474728, 1000);
        Recurso revista = new Revista("National Geographic", "Explorando el mundo", 2023, 5, "https://www.nationalgeographic.com");
        Recurso tesis = new Tesis("Juan Pérez", "Impacto del cambio climático", 2022, "Universidad Nacional", "15/06/2022");

        // Mostrar fichas
        System.out.println(libro.mostrarFicha());
        System.out.println();
        System.out.println(revista.mostrarFicha());
        System.out.println();
        System.out.println(tesis.mostrarFicha());

    }
}
