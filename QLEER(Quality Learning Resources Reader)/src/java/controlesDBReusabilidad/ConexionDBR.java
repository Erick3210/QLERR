/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick F. Castillo
 */
public class ConexionDBR {
Connection con;
    
    public ConexionDBR() {
        
        try{
        
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        
        }  catch (SQLException ex) {
            System.out.print("Error en la conexión a la base de datos 2: " );
            con = null;
        } catch (ClassNotFoundException ex) {
            System.out.print( "Error en la conexión a la base de datos 3: ");
            con = null;
        } 
    }
    
    
    public Connection getConnection(){
    
          return con;
    }
}