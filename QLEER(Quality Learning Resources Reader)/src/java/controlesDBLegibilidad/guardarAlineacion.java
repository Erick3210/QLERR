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
 * @author Erick F. Castillo
 */
public class guardarAlineacion {
  
    Connection con;
    
    datosDBLegibilidad dA = new datosDBLegibilidad();
    
    
    
    public void guardarA(int n1, int n2, int n3, double nt) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/legibilidad","root","");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO alineacion(ParrafosAfuera, ParrafosAdentro, TotalDeParrafos,porcentaje) VALUES(?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setDouble(4, nt);
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
       guardarAlineacion gA = new guardarAlineacion();
      
       
       
       gA.guardarA(2, 3 ,5,10);
    }
}
