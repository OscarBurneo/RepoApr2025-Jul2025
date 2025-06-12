import Librerias.All.MetNodos;

public class ListaEnlazada {

    public static void main(String[] args) {
        int opc;
        MetNodos metodos = new MetNodos();
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.recorrer();
                case 3 ->
                    metodos.buscar();
                case 0 ->
                    System.out.println("Saliendo del programa...");
            }
        } while (opc != 0);

    }

}
