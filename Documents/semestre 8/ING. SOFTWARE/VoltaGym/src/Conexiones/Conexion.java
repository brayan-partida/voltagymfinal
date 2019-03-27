package Conexiones;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
import javax.swing.JOptionPane;
 
import Clases_BD.PRODUCTOS;
import Conexiones.Conexion;
 
public class Conexion {
 Connection cn;

    public Connection Conexion() {
        try{
          Class.forName("com.mysql.jdbc.Driver");
          cn=DriverManager.getConnection("jdbc:mysql://localhost/edus_gym","root","");
            System.err.println("se conecto exitosamente");
            
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            
        }
     return cn;
       
    }
    Statement CreateStatament(){
        
        throw new UnsupportedOperationException("NO SOPORTADO");
    }
 
}
