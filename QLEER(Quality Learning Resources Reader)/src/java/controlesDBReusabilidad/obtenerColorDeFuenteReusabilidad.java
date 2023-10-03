/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import controlesDBLegibilidad.datosDBLegibilidad;
import controlesDBLegibilidad.obtenerAlineacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efcas
 */
public class obtenerColorDeFuenteReusabilidad {

    
    List<Integer> listaCaracteristicas= new ArrayList<>();
   List<Double> listaCaracteristicas2= new ArrayList<>();
  
      
    public List<Integer> ObtenerDatosColorFuente() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefuente");
           while(r.next()){
               listaCaracteristicas.add( r.getInt("OtrosColoresFuentes"));
               listaCaracteristicas.add( r.getInt("Negro"));
               listaCaracteristicas.add( r.getInt("TotalDeFuentes"));
    
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
      public List<Double> ObtenerDatosColorFuente2() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefuente");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentajeCFue"));

    
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerColorDeFuenteReusabilidad oa = new obtenerColorDeFuenteReusabilidad();
        System.out.println(oa.ObtenerDatosColorFuente2().get(oa.ObtenerDatosColorFuente2().size()-1));
        
    }
}
