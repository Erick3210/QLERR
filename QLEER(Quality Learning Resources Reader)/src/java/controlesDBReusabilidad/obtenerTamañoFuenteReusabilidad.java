/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efcas
 */
public class obtenerTamañoFuenteReusabilidad {
    
        List<Integer> listaCaracteristicas= new ArrayList<>();
        List<Double> listaCaracteristicas2= new ArrayList<>();
  
      
    public List<Integer> ObtenerDatosColorFuente() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM tamañofuente");
           while(r.next()){
               listaCaracteristicas.add( r.getInt("Rango1"));
               listaCaracteristicas.add( r.getInt("Rango2"));
               listaCaracteristicas.add( r.getInt("Rango3"));
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
           r=st.executeQuery("SELECT * FROM tamañofuente");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentajeTM"));
 
    
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       obtenerTamañoFuenteReusabilidad oa = new obtenerTamañoFuenteReusabilidad();
        System.out.println(oa.ObtenerDatosColorFuente2().get(oa.ObtenerDatosColorFuente2().size()-1));
        
    }
}
