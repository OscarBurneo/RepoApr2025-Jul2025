import Librerias.All.MetArray;
import Librerias.All.MetRecurs;

public class Recurs {
    public static void main(String[] args) {
        MetRecurs met= new MetRecurs();
        MetArray metA= new MetArray();
        int op=0,num,res;
        do {
            op=met.menu();
            switch (op) {
                case 1:
                    System.out.println("\nIntroduzca un numero: ");
                    num=metA.LeerDato();
                    System.out.println(met.fact(num));
                    break;
                case 2:
                    System.out.print("\n: ");
                    num=metA.LeerDato();
                    System.out.println(MetRecurs.fibo(num-1));
                break;
                case 3:
                    System.out.println("\nIntroduzca un numero: ");
                    num=metA.LeerDato();
                    System.out.println("\nIntroduzca la potencia: ");
                    res=metA.LeerDato();
                    System.out.println(met.Poten(num,res));
                break;

                default:
                    break;
            }
        } while (op!=0);
    }
}
