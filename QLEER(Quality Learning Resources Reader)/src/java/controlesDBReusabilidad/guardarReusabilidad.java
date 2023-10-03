/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Erick F. Castillo
 */
public class guardarReusabilidad {
    HttpSession Sesion;
    Connection con;
    
    public void guardar(double n1,String n2) throws ClassNotFoundException, SQLException{
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO valor_final (Valor_Final, Formato) VALUES(?,?)");
        
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
    
    
     public void guardar2(double n1,String n2) throws ClassNotFoundException, SQLException{
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO valor_final2 (Valor_Final, Formato) VALUES(?,?)");
        
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
          
                 guardarReusabilidad gr= new guardarReusabilidad();       
//                 String reusabilidad = gr.ObtenerValorReusabilidadFinal("http://localhost/LWSEvaluate/lwsdocWSDL2.xml");
//                  
//                   
                   gr.guardar(44,"DOCX");
          
          
          
          
          }

}
