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
            }
        } while (opc != 0);

    }

}
