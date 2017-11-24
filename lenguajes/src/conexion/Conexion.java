
package conexion;
import java.sql.*;  //Paquete de Java, no del driver

public class Conexion {
    public static Connection Conectarse(String login, String password) throws SQLException, ClassNotFoundException{
        //Primero se escribe la URL del servidor de MySQL
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Cargar el driver de MySQL para que sepa que3 nos conectarenis a MySQL
        Class.forName("com.mysql.jdbc.Driver");
        //Cargado con códig odel driver
        Connection con = DriverManager.getConnection(url, login, password);
        return con;
    }
}
