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
public class guardarAlineacionReusabilidad {
    
    Connection con;
    
    public void guardar(int n1, int n2, int n3, double n4) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO alineacion (TotalDeParrafos, ParrafosAdentro, ParrafosAfuera, porcentajeA) VALUES(?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setDouble(4, n4);
       
        
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
        
        guardarAlineacionReusabilidad l = new guardarAlineacionReusabilidad();
        
        l.guardar(2, 2, 2,3.3);
        
    }
    
    
}
