import Librerias.All.MetPilaCola;

public class ColaEnlazda {
    public static void main(String[] args) {
        MetPilaCola metPila = new MetPilaCola();
        metPila.Metodos();
        int opcion;
        do {
            opcion = metPila.menu();
            switch (opcion) {
                case 1:
                    metPila.pushPila();
                    break;
                case 2:
                    if (metPila.pilaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        metPila.popPila();
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);
    }

}
