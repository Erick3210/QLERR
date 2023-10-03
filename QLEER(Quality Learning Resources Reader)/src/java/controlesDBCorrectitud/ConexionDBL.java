/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBCorrectitud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author efcas
 */
public class ConexionDBL {
    Connection con;
    
    public ConexionDBL() {
        
        try{
        
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/correctitud","root","");
        
        
        }  catch (SQLException ex) {
            System.out.print("Error en la conexión a la base de datos 2: " );
            con = null;
        } catch (ClassNotFoundException ex) {
            System.out.print( "Error en la conexión a la base de datos 3: ");
            con = null;
        } 
    }
}
