package Examen.Parcial.Ejer1;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static Animal[] mamiferos,aves,reptiles;
    public static Cuidador[] cuidadores;
    public static Habitat[] habitats;

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema: ");
        int op=0;
        do {
            op=menu();
            switch (op) {
                case 1:
                    ingAnimal();
                    break;
                case 2:
                    ingCuidador();
                    break;
                case 3:
                    EstablecerHabitat();
                    break;
                case 4:
                    mostrarHabitat();
                    break;
                case 0:System.out.println("Saliendo...");
                default:
                    break;
            }
        } while (op!=0);
        System.out.println("Gracias por usar el sistema.");
    }
    public static int menu(){
        System.out.print( "\nMenu principal:\n"+
                            "1. Ingreso de animales\n"+
                            "2. Ingreso de cuidadores\n"+
                            "3. Establecer habitats\n"+
                            "4. Mostrar habitats\n"+
                            "0.Salir\n"+
                            "Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }
    public static void ingAnimal(){
        int M=0,A=0,R=0;
        String nombre, alim, sonido, tipo, enfermo;

        System.out.println("Cantidad de animales: ");
        int tot=sc.nextInt();
        
        System.out.println("Cuantos son mamíferos: ");
        mamiferos = new Animal[sc.nextInt()];
        System.out.println("Cuantos son aves: ");
        aves = new Animal[sc.nextInt()];
        System.out.println("Cuantos son reptiles: ");
        reptiles = new Animal[sc.nextInt()];
        System.out.println("Ingreso individual de animales:");
        for (int i = 1; i <=tot; i++) {
            System.out.print("\nEl animal Nº "+i+" es: "+
                                "\n1.Mamifero"+
                                "\n2.Ave"+
                                "\n3.Reptil"+
                                "\nElige una opcion: ");
            int op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    if (M >= mamiferos.length) {
                        System.out.println("No se pueden agregar más mamíferos.");
                        i--;
                        break;
                    }
                    System.out.println("Ingrese el nombre del mamífero: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su alimento: ");
                    alim = sc.nextLine();
                    System.out.println("Ingrese el sonido que emite: ");
                    sonido = sc.nextLine();
                    System.out.println("Peligroso? (S/N): ");
                    tipo = sc.nextLine().toUpperCase();
                    if (tipo.equals("S")) {
                        tipo = "Peligroso";
                    } else {
                        tipo = "No Peligroso";
                    }
                    System.out.println("¿Está enfermo? (S/N): ");
                    enfermo= sc.nextLine().toUpperCase();
                    if (enfermo.equals("S")) {
                        mamiferos[M] = new Mamifero(nombre, alim, sonido, true, tipo);
                    } else {
                        mamiferos[M] = new Mamifero(nombre, alim, sonido, false, tipo);
                    }
                    M++;
                    break;
                case 2:
                    if (A >= aves.length) {
                        System.out.println("No se pueden agregar más aves.");
                        i--;
                        break;
                    }
                    System.out.println("Ingrese el nombre del ave: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su alimento: ");
                    alim = sc.nextLine();
                    System.out.println("Ingrese el sonido que emite: ");
                    sonido = sc.nextLine();
                    System.out.println("Peligroso? (S/N): ");
                    tipo = sc.nextLine().toUpperCase();
                    if (tipo.equals("S")) {
                        tipo = "Peligroso";
                    } else {
                        tipo = "No Peligroso";
                    }
                    System.out.println("¿Está enfermo? (S/N): ");
                    enfermo= sc.nextLine().toUpperCase();
                    if (enfermo.equals("S")) {
                        aves[A] = new Ave(nombre, alim, sonido, true, tipo);
                    } else {
                        aves[A] = new Ave(nombre, alim, sonido, false, tipo);
                    }
                    A++;
                    break;
                case 3:
                    if (R >= reptiles.length) {
                        System.out.println("No se pueden agregar más reptiles.");
                        i--;
                        break;
                    }
                    System.out.println("Ingrese el nombre del ave: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su alimento: ");
                    alim = sc.nextLine();
                    System.out.println("Ingrese el sonido que emite: ");
                    sonido = sc.nextLine();
                    System.out.println("Peligroso? (S/N): ");
                    tipo = sc.nextLine().toUpperCase();
                    if (tipo.equals("S")) {
                        tipo = "Peligroso";
                    } else {
                        tipo = "No Peligroso";
                    }
                    System.out.println("¿Está enfermo? (S/N): ");
                    enfermo= sc.nextLine().toUpperCase();
                    if (enfermo.equals("S")) {
                        reptiles[R]=new Reptil(nombre, alim, sonido, true, tipo);
                    } else {
                        reptiles[R]=new Reptil(nombre, alim, sonido, false, tipo);
                    }
                    R++;
                    break;

                default:
                System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
    }
    public static void ingCuidador() {
        System.out.println("Ingreso de cuidadores:");
        System.out.println("Cuantos cuidadores desea ingresar: ");
        cuidadores = new Cuidador[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < cuidadores.length; i++) {
            System.out.print("Ingrese el nombre del cuidador: ");
            String nombre = sc.nextLine();
            System.out.print("El cuidador es "+
                                "1.Veterinario "+
                                "2.Entrenador "+
                                "\nElige una opción: ");
            int x = sc.nextInt();
            if (x == 1) {
                cuidadores[i] = new Cuidador(nombre,"Veterinario");
            } else if (x == 2) {
                cuidadores[i] = new Cuidador(nombre,"Entrenador");
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
                i--;
                continue;
            }
        }
        
    }
    public static void mostrarAnimales() {
        System.out.println("Animales registrados:");

        if (mamiferos == null ) {
            System.out.println("No hay mamíferos registrados.");
        } else {
            System.out.println("\nMamíferos:");
            for (Animal animal : mamiferos) {
                if (animal != null) {
                    animal.mostrarInformacion();
                }
            }
        }

        if (aves == null ) {
            System.out.println("No hay aves registradas.");
        } else {
            System.out.println("\nAves:");
        
            for (Animal animal : aves) {
                if (animal != null) {
                    animal.mostrarInformacion();
                }
            }
        }

        if (reptiles == null ) {
            System.out.println("No hay reptiles registrados.");
        } else {
            System.out.println("\nReptiles:");
            for (Animal animal : reptiles) {
                if (animal != null) {
                    animal.mostrarInformacion();
                }
            }
        }
    }
    public static void mostrarCuidador() {
        System.out.println("Cuidadores registrados:");
        if (cuidadores == null) {
            System.out.println("No hay cuidadores registrados.");
        } else {
            for (Cuidador cuidador : cuidadores) {
                if (cuidador != null) {
                    System.out.println("Nombre: " + cuidador.nombre);
                    System.out.println("Especialidad: " + cuidador.especialidad);
                }
            }
        }
    }
    public static void EstablecerHabitat() {
        System.out.println("Establecer hábitats para los animales:");
        System.out.println("Cuantos hábitats desea establecer: ");
        int cantidadHabitat = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidadHabitat; i++) {
            System.out.println("Ingrese el nombre del hábitat " + (i + 1) + ": ");
            String nombreHab= sc.nextLine();
            Animal[] animalesHab = new Animal[mamiferos.length + aves.length + reptiles.length];
            int n = 0;
            mostrarAnimales();
            System.out.println("Animales a ingresar en el habitat " + nombreHab + ":");
            int cant= sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < cant; j++) {
                System.out.println("Ingrese el nombre del animal " + (j + 1) + ": ");
                String nombre = sc.nextLine();
                boolean encontrado = false;

                for (Animal animal : mamiferos) {
                    if (animal != null && animal.nombre.equalsIgnoreCase(nombre)) {
                        animalesHab[n++] = animal;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    for (Animal animal : aves) {
                        if (animal != null && animal.nombre.equalsIgnoreCase(nombre)) {
                            animalesHab[n++] = animal;
                            encontrado = true;
                            break;
                        }
                    }
                }
                if (!encontrado) {
                    for (Animal animal : reptiles) {
                        if (animal != null && animal.nombre.equalsIgnoreCase(nombre)) {
                            animalesHab[n++] = animal;
                            encontrado = true;
                            break;
                        }
                    }
                }
                if (!encontrado) {
                    System.out.println("Animal no encontrado: " + nombre);
                }
            }
            mostrarCuidador();
            System.out.println("Ingrese el nombre del cuidador asignado al hábitat " + nombreHab + ": ");
            String nombreCuidador = sc.nextLine();
            Cuidador cuidadorAsig = null;
            for (Cuidador cuidador : cuidadores) {
                if (cuidador != null && cuidador.nombre.equalsIgnoreCase(nombreCuidador)) {
                    cuidadorAsig = cuidador;
                    cuidadorAsig.setHabitats();
                    break;
                }
            }
            if (cuidadorAsig == null) {
                System.out.println("Cuidador no encontrado: " + nombreCuidador);
                continue;
            }
            habitats[i] = new Habitat(nombreHab, animalesHab, cuidadorAsig);
            System.out.println("Hábitat " + nombreHab + " establecido con éxito.");
        }
    }

    public static void mostrarHabitat() {
        System.out.println("Hábitats registrados:");
        if (habitats == null) {
            System.out.println("No hay hábitats registrados.");
        } else {
            for (Habitat habitat : habitats) {
                if (habitat != null) {
                    System.out.println("Nombre del hábitat: " + habitat.nombre);
                    System.out.println("Cuidador asignado: " + habitat.cuidador.nombre);
                    System.out.println("Animales en el hábitat:");
                    for (Animal animal : habitat.animales) {
                        if (animal != null) {
                            animal.mostrarInformacion();
                        }
                    }
                }
            }
        }
    }
    public static void asignarVet(){
        System.out.println("Asignar veterinario a animal enfermo:");
        mostrarAnimales();
        System.out.print("Ingrese el nombre del animal enfermo: ");
        String nombreAnimal = sc.nextLine();
        Animal animalEnf = null;

        if (mamiferos != null) {
            for (Animal animal : mamiferos) {
                if (animal != null && animal.nombre.equalsIgnoreCase(nombreAnimal) && animal.enfermo) {
                    animalEnf = animal;
                    break;
                }
            }
        }
        if (animalEnf == null && aves != null) {
            for (Animal animal : aves) {
                if (animal != null && animal.nombre.equalsIgnoreCase(nombreAnimal) && animal.enfermo) {
                    animalEnf = animal;
                    break;
                }
            }
        }
        if (animalEnf == null && reptiles != null) {
            for (Animal animal : reptiles) {
                if (animal != null && animal.nombre.equalsIgnoreCase(nombreAnimal) && animal.enfermo) {
                    animalEnf = animal;
                    break;
                }
            }
        }

        if (animalEnf == null) {
            System.out.println("No se encontró un animal enfermo con ese nombre.");
            return;
        }else {
            System.out.println("Animal enfermo encontrado: " + animalEnf.nombre);
        }

        mostrarCuidador();
        System.out.print("Ingrese el nombre del veterinario asignado: ");
        String nombreVeterinario = sc.nextLine();
        Cuidador vet=null;
        if (cuidadores!=null) {
            for (Cuidador cuidador : cuidadores) {
                if (cuidador.nombre.equalsIgnoreCase(nombreVeterinario) && cuidador.especialidad.equals("Veterinario")) {
                    vet = cuidador;
                    break;
                }else if (cuidador.nombre.equalsIgnoreCase(nombreVeterinario) && !cuidador.especialidad.equals("Veterinario")) {
                    System.out.println("El cuidador " + cuidador.nombre + " no es veterinario.");
                    return;
                }
            }
        }else {
            System.out.println("No hay cuidadores registrados.");
            return;
        }


        System.out.println("Veterinario " + vet.nombre + " asignado al animal enfermo " + animalEnf.nombre + ".");
    }
}
