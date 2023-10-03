/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Erick F. Castillo
 */
public class obtenerColorFuente {
    
    Connection con;
    
    List<Integer> listaCaracteristicas= new ArrayList<>();
    List<Double> listaCaracteristicas2= new ArrayList<>();
    
    datosDBLegibilidad dA = new datosDBLegibilidad();
      
      
    public List<Integer> ObtenerDatosColorFuentes() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefuente");
           while(r.next()){
               listaCaracteristicas.add( r.getInt("Negro"));
               listaCaracteristicas.add( r.getInt("Azul"));
               listaCaracteristicas.add( r.getInt("Rojo"));
               listaCaracteristicas.add( r.getInt("Verde"));
               listaCaracteristicas.add( r.getInt("OtroColor"));
               listaCaracteristicas.add( r.getInt("TotalDePalabras"));
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
        public List<Double> ObtenerTotalColorFuentes() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefuente");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentaje"));
       
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
}
