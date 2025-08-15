
import java.sql.*;

public class App 
{
    public static void main( String[] args ) {
    System.out.println("GESTION DE LA BASE DE DATOS CON SQLITE");
        //String url="jdbc:sqlite:bd/userdb.db";
        
        String url = "jdbc:sqlite:userdb.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión establecida a SQLite.");
                
                // Crear tabla
                String sqlCrear = "CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY, nombre TEXT, email TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCrear);

                // Insertar datos
                String sqlInsertar = "INSERT INTO usuarios(nombre, email) VALUES('Juan', 'juan@mail.com')";
                stmt.execute(sqlInsertar);    }
            }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}