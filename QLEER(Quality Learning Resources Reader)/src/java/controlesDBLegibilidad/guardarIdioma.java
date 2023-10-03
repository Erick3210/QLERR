/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author efcas
 */
public class guardarIdioma {
    Connection con;
    
    datosDBLegibilidad dA = new datosDBLegibilidad();
    
    
    public void guardarIdioma(int n1, int n2, int n3, int n4, double nt) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
        
        try{
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO idioma(OtrosIdiomas, Español, Ingles, TotalDePalabras,porcentaje) VALUES(?,?,?,?,?)");
        
        pst.setInt(1, n1);
        pst.setInt(2, n2);
        pst.setInt(3, n3);
        pst.setInt(4, n4);
        pst.setDouble(5, nt);
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
        guardarIdioma g =new guardarIdioma();
        g.guardarIdioma(2, 3, 4, 5,99);
    }
}
