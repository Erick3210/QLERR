/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author efcas
 */
public class guardarDirecciones {
    
    Connection con;
    
    datosDBLegibilidad dA = new datosDBLegibilidad();
    
    
    public void guardarD(String n1) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO direcciones(dir) VALUES(?)");
        
        pst.setString(1, n1);
      
//        pst.setInt(4, n4);
//        pst.setInt(5, n5);
//        pst.setInt(6, n6);
//        pst.setInt(7, n7);
//        pst.setInt(8, n8);
//        pst.setInt(9, n9);
        
        if (pst.executeUpdate()==1){
        
             System.out.println("Registro Existoso");
             
        } else{
             System.out.println("Error al Registrar");
        }
      
        
        
        }catch(Exception e){
             System.out.println(e);

             System.out.println("Error al Registrar");
        }
    
    
    
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        guardarDirecciones g = new guardarDirecciones();
         g.guardarD("C://Users//efcas//OneDrive//ESCRITORIO 2//Pruebas//prueba1.pdf");
    }
}
