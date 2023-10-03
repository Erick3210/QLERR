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
public class guardarLegibilidad {
    
    Connection con;
    
    datosDBLegibilidad dA = new datosDBLegibilidad();
    
    public void guardar(double n1, String n2) throws ClassNotFoundException, SQLException{
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO valor_final (Valor_Final, formato) VALUES(?,?)");
        
        pst.setDouble(1, n1);
        pst.setString(2, n2);
       
        
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
    
    
    public static void main (String [] args) throws ClassNotFoundException, SQLException{

      
        guardarLegibilidad gL = new guardarLegibilidad();
        
        gL.guardar(44.2,"pdf");



  }
    
    
    
    
    
}
