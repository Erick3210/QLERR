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
public class obtenerAlineacionReusabilidad {
    
    
    List<Integer> listaCaracteristicas= new ArrayList<>();
    List<Double> listaCaracteristicas2= new ArrayList<>();
 
      
    public List<Integer> ObtenerDatosAlineacion() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM alineacion");
           while(r.next()){
           
               listaCaracteristicas.add( r.getInt("ParrafosAfuera"));
               listaCaracteristicas.add( r.getInt("ParrafosAdentro"));
               listaCaracteristicas.add( r.getInt("TotalDeParrafos"));
               
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
     public List<Double> ObtenerDatosAlineacion2() throws ClassNotFoundException, SQLException{
       
        ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
            
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM alineacion");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentajeA"));
       
               
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerAlineacionReusabilidad oa = new obtenerAlineacionReusabilidad();
        System.out.println(oa.ObtenerDatosAlineacion());
        System.out.println(oa.ObtenerDatosAlineacion().get(oa.ObtenerDatosAlineacion().size()-1));
        System.out.println(oa.ObtenerDatosAlineacion().get(oa.ObtenerDatosAlineacion().size()-2));
        System.out.println(oa.ObtenerDatosAlineacion().get(oa.ObtenerDatosAlineacion().size()-3));
        System.out.println(oa.ObtenerDatosAlineacion2().get(oa.ObtenerDatosAlineacion2().size()-1));
    }
}
