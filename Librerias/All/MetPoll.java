package Librerias.All;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class MetPoll {
    public Scanner sc= new Scanner(System.in);
    public File Fl =new File("miEncuesta.txt");
    public String docent, tema;
    public int cedula, nAsig;

    public int menu(){
        System.out.print( "\nMenu principal:\n"+
                            "1. Realizar encuesta\n"+
                            "2. Presentar resultados desde el archivo\n"+
                            "3. Presentar resultados desde el arreglo\n"+
                            "0.Salir\n"+
                            "Elige una opcion: ");
        int op= sc.nextInt();
        return op;
    }

    public void encuestas(int n){
        
        for (int i=0; i<n; i++) {
            try {
                if (!Fl.exists()) {Fl.createNewFile();}
                FileWriter fw= new FileWriter(Fl,true);
                PrintWriter pw=new PrintWriter(fw);

                    System.out.println("\nEncuesta Nº "+(i+1));
                    System.out.println("Ingrese su cédula:");
                    cedula=sc.nextInt();
                    sc.nextLine();

                    System.out.println("¿Cuál es nombre de su profesor?");
                    docent=sc.nextLine();

                    System.out.println("¿En cuántas asignaturas está matriculado actualmente?");
                    nAsig=sc.nextInt();
                    sc.nextLine();

                    System.out.println("¿Qué tema(s) tiene dificultad en la asignatura de estructuras de datos?");
                    tema=sc.nextLine();

                pw.println(cedula+"-"+docent+"-"+nAsig+"-"+tema);
                pw.close();

            } catch (Exception e) {
                System.err.println("Error: "+e.getMessage());
            }
        }
    }

    public void ShowFile(){
        try {Scanner sfl = new Scanner(Fl);
            byte n=0;
            if (Fl.exists()) {
                System.out.println("\n--------------------");
                while (sfl.hasNextLine()) {
                    String linea=sfl.nextLine();
                    String[] datos=linea.split("-");
                    System.out.println("Estudiante Nº "+(n+1)+"\n"+
                                        "Cedula: "+datos[0]+"\n"+
                                        "Docente: "+datos[1]+"\n"+
                                        "Asignaturas: "+datos[2]+"\n"+
                                        "Tema: "+datos[3]);
                    n++;
                    System.out.println("--------------------");
                }
            }
            else System.out.println("No hay encuestas registradas.");
            sfl.close();
        } catch (Exception e) {}
    }

    public record miEncuesta(int cedula, String docent, int nAsig, String tema){}
    public void ShowArray(){
        try {Scanner sfl = new Scanner(Fl);
            byte n=0;
            if (Fl.exists()) {
                System.out.println("\n--------------------");
                while (sfl.hasNextLine()) {
                    String linea=sfl.nextLine();
                    String[] datosFl=linea.split("-");
                    //cedula= Integer.parseInt(datosFl[0]);
                    //docent=datosFl[1];
                    //nAsig=Integer.parseInt(datosFl[2]);
                    //tema=datosFl[3];

                    //miEncuesta miEncuesta=new miEncuesta (cedula,docent,nAsig,tema);
                    miEncuesta miEncuesta= new miEncuesta(Integer.parseInt(datosFl[0]),datosFl[1],Integer.parseInt(datosFl[2]),datosFl[3]);
                    System.out.println("Estudiante Nº "+(n+1)+"\n"+
                                        "Cedula: "+miEncuesta.cedula+"\n"+
                                        "Docente: "+miEncuesta.docent+"\n"+
                                        "Asignaturas: "+miEncuesta.nAsig+"\n"+
                                        "Tema: "+miEncuesta.tema);
                    n++;
                    System.out.println("--------------------");
                }
            }
            else System.out.println("No hay encuestas registradas.");
            sfl.close();
        } catch (Exception e) {}
    }

    public void Errase(){
        boolean val=false;
        while (!val) {
            System.out.println("Desea borrar el archivo? (S/N)");
            char resp=sc.next().charAt(0);
            if (resp=='S'||resp=='s') {
                Fl.delete();
                System.out.println("Archivo borrado.");
                val=true;
            } else if(resp=='N'||resp=='n'){
                System.out.println("Archivo no borrado.");
                val=true;
            }else System.out.println("Opcion no valida.");
        }
    }
}
