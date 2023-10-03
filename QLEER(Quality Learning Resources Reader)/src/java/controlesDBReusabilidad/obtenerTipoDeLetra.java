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
public class obtenerTipoDeLetra {
       List<Integer> listaCaracteristicas= new ArrayList<>();
        List<Double> listaCaracteristicas2= new ArrayList<>();
  
      
    public List<Integer> ObtenerDatosFuente() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM tipodeletra");
           while(r.next()){
               listaCaracteristicas.add( r.getInt("OtrasFuentes"));
               listaCaracteristicas.add( r.getInt("TimesRoman"));
               listaCaracteristicas.add( r.getInt("Arial"));
               listaCaracteristicas.add( r.getInt("TotalDeFuentes"));
               listaCaracteristicas.add( r.getInt("Calibri"));
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
       public List<Double> ObtenerDatosFuente2() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM tipodeletra");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentajeTL"));
       
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       obtenerTipoDeLetra oa = new obtenerTipoDeLetra();
        System.out.println(oa.ObtenerDatosFuente2().get(oa.ObtenerDatosFuente2().size()-1));
        
    }
}
