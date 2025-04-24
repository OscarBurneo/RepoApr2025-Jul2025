import Librerias.All.Metodos;

public class EjemCadena {
    public static void main(String[] args) {
        Metodos obj= new Metodos();
        int op=0;
        do {
            op=obj.menu();
            switch (op) {
                case 1:
                    System.out.println("Ejercicio 1");
                    obj.charXchar();
                    break;
                case 2:
                    System.err.println("Ejercicio 2");
                    obj.charSearch();
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    obj.palindromo2();
                    break;
                case 4:
                    System.out.println("Ejercicio 4");
                    obj.vocales();
                    break;
                case 5:
                    System.out.println();
                    obj.reduc();
                    break;
                default:
                    System.out.println("Opcion no valida, por favor elige una opcion correcta.");
                    break;
            }
        } while (op!=0);
    }
}
