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
 * @author Erick F. Castillo
 */
public class guardarCaracteristicasC {
    HttpSession Sesion;
    Connection con;
    
    public void guardar(double n1, double n2, double n3, double n4, double n5) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO caracteristicascompletitud (Escolaridad, Dominio, Tema, TipoDeContenido, Service) VALUES(?,?,?,?,?)");
        
        pst.setDouble(1, n1);
        pst.setDouble(2, n2);
        pst.setDouble(3, n3);
        pst.setDouble(4, n4);
        pst.setDouble(5, n5);
       
        
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
    
    
    public void guardar2(double n1, double n2, double n3, double n4, double n5) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO caracteristicascompletitud2 (Escolaridad, Dominio, Tema, TipoDeContenido, Service) VALUES(?,?,?,?,?)");
        
        pst.setDouble(1, n1);
        pst.setDouble(2, n2);
        pst.setDouble(3, n3);
        pst.setDouble(4, n4);
        pst.setDouble(5, n5);
       
        
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
    
}
