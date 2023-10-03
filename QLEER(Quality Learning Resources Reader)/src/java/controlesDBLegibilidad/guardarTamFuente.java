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
public class guardarTamFuente {
          
    Connection con;
    datosDBLegibilidad dA = new datosDBLegibilidad();
    
   public void guardarCF(int n1, int n2,int n3, int n4, int n5, int n6, double nt) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO tamfuente( Rango1, Rango2, Rango3, Rango4, Rango5, Rango6, porcentaje) VALUES(?,?,?,?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setInt(4, n4);
        pst.setInt(5, n5);
        pst.setInt(6, n6);
        pst.setDouble(7, nt);

        
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
        guardarTamFuente g = new guardarTamFuente();
        
        g.guardarCF(22, 22, 22, 22, 22, 22,44);
        
        
    }
   
}
