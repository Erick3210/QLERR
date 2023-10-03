/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author efcas
 */
public class guardarTamañoDeLetraReusabilidad {
    
    Connection con;
    
    public void guardar(int n1, int n2, int n3, int n4, double n5) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO tamañofuente (TotalDeFuentes, Rango1, Rango2, Rango3,porcentajeTM) VALUES(?,?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setInt(4, n4);
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
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        guardarTamañoDeLetraReusabilidad g = new guardarTamañoDeLetraReusabilidad();
        
       g.guardar(3, 3, 3, 3,40.4);
    }
    
    
}
