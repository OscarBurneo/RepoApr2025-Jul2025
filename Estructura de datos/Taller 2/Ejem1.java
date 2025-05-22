import java.io.*;

public class Ejem1 {
    public static void main(String[] args) {
        File archive= new File("Deudas.txt");
        File archiveUpdate= new File("DeudasActualizado.txt");
        String line;
        try {
            FileReader fr= new FileReader(archive);
            FileWriter fw= new FileWriter(archiveUpdate);
            BufferedReader br= new BufferedReader(fr);
            PrintWriter pw= new PrintWriter(fw);
            
            while((line=br.readLine())!=null){
                    String lineUpdate = line.replace("Central de Riesgo", "Liberado");
                   
                    pw.print(lineUpdate+"\n");
                    pw.flush();
                     
                }
                System.out.println("\nArchivo actualizado creado como: DeudasActualizado.txt\n");
                br.close();
                pw.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar los archivos.");
        }
    }
}