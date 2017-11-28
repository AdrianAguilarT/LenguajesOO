
package conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarConexion {
    public static void main(String [] args){
        Connection con = null;
        try{
            con = Conexion.Conectarse("root", "");
            System.out.println("Conexión Realizada");
        }catch(ClassNotFoundException e){
            System.out.println("No se cargó bien el driver");
        }catch(SQLException e){
            System.out.println("Un error de SQL "+e.getMessage());
        }finally{
            try {
                if(con != null)
                    con.close();
                    System.out.println("Cerrado");
            } catch (SQLException ex) {
                
            }
        }
    }
}
