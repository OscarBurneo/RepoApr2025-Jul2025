import Librerias.All.MetObj;

public class Combinado {
    public static void main(String[] args) {
        MetObj met =new MetObj(0);
        int op=0;
        do {
            met.menu();
            op = met.sc.nextInt();
            switch (op) {
                case 1:
                    met.insertar();
                    break;
                case 2:
                    met.recorrer();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (op!=0);
    }
}
