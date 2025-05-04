import Librerias.All.MetPoll;

public class SistPoll {
    public static void main(String[] args) {
        MetPoll met= new MetPoll();
        int op=0,ev=0;
        
        System.out.println("\nBienvenido al sistema de encuestas.");
        System.out.println("¿Cuantos estudiantes va a encuentar?");
        ev=met.sc.nextInt();

        do {
            op=met.menu();
            switch (op) {
                case 1:
                    met.encuestas(ev);
                    break;
                case 2:
                    met.ShowFile();
                    break;
                case 3:
                    met.ShowArray();
                    break;
                case 0:
                    met.Errase();
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (op != 0);
    System.out.println("Gracias por participar en la encuesta.");

    }
}
