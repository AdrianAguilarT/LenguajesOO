/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
/**
 *
 * @author T-102
 */
public class ProbarConexion {
    public static void main(String [] args){
        Connection con = null;
        try{
        con = Conexion.Conectarse("root", "");
        }catch(ClassNotFoundException e){
            
        }catch(SQLException e){
            
        }finally{
            con.close();
        }
    }
}
