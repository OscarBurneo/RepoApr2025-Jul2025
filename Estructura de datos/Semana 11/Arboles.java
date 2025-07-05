import Librerias.All.MetArboles;

public class Arboles {
    public static void main(String[] args) {
        MetArboles met =new MetArboles();
        int op=0;
        do {
            op=met.menu();
            switch (op) {
                case 1:
                    //met.insertar();
                    break;
                case 2:
                    //met.recorrer();
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
