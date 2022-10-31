/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author dell
 */
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
