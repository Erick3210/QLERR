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
public class guardarTiposDeLetraReusabilidad {
    //"INSERT INTO tipodeletra (TotalDeFuentes, Arial, TimesRoman) VALUES(?,?,?)"
    
    Connection con;
    
    public void guardar(int n1, int n2, int n3, int n4, int n5, double n6) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO tipodeletra (TotalDeFuentes, Arial, TimesRoman, OtrasFuentes,Calibri,porcentajeTL) VALUES(?,?,?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setInt(4, n4);
        pst.setInt(5, n5);
        pst.setDouble(6, n6);
        
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
        guardarTiposDeLetraReusabilidad u = new guardarTiposDeLetraReusabilidad();
        
       u.guardar(2, 2, 2,2,9,99.9);
    }
}
