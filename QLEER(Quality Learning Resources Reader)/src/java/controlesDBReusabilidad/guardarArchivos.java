/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author efcas
 */
public class guardarArchivos {
    
  
    Connection con;
    
    public void guardarPDF(String n1) throws ClassNotFoundException, SQLException{
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO  archivospdf(nombre) VALUES(?)");
        
        pst.setString(1, n1); 
       
        
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
    
    
    public void guardarDOCX(String n1) throws ClassNotFoundException, SQLException{
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO  archivosdocx(nombre) VALUES(?)");
        
        pst.setString(1, n1); 
       
        
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
          
                 guardarArchivos gr= new guardarArchivos();       

   
//                   
                   gr.guardarPDF("fffffffffffff");
                    gr.guardarDOCX("fffffffffffff");
          
          
          
          
          }
    
    
    
    
}
