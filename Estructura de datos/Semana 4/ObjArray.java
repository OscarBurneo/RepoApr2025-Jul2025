public class ObjArray{
    public static void main (String[] args){
        do {
            op=met.menu();
            switch (op) {
                case 1:
                    System.out.println("Insertar completo");
                    met.insOrden();
                    break;
                case 2:
                    System.out.println("Recorrer el arreglo");
                    met.Present();
                    break;
                case 3:
                    System.out.println("Buscar un numero en el arreglo");
                    met.search();
                    break;
                case 4:
                    System.out.println("Comprobar repetido");
                    met.repetido();
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op!=0);
    }
}