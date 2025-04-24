

import Librerias.All.Metodos;

public class FileEjem {
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int op = 0;
        do {
            op=obj.menu1();
            switch (op){
                case 1: 
                obj.escribirFile();
                break;
                case 2:
                obj.leerFile();
                break;
            }
        } while (op != 0);

    }
}
