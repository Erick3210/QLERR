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
public class obtenerAlineacion {
    
    
   
    Connection con;
    
    List<Integer> listaCaracteristicas= new ArrayList<>();
    List<Double> listaCaracteristicas2= new ArrayList<>();
   
    datosDBLegibilidad dA = new datosDBLegibilidad();  
      
    public List<Integer> ObtenerDatosAlineacion() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM alineacion");
           while(r.next()){
               listaCaracteristicas.add( r.getInt("ParrafosAfuera"));
               listaCaracteristicas.add( r.getInt("ParrafosAdentro"));
               listaCaracteristicas.add( r.getInt("TotalDeParrafos"));
    
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
     public List<Double> ObtenerTotalAlineacion() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM alineacion");
           while(r.next()){
               listaCaracteristicas2.add( r.getDouble("porcentaje"));
            
    
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerAlineacion oa = new obtenerAlineacion();
        System.out.println(oa.ObtenerTotalAlineacion().get(oa.ObtenerTotalAlineacion().size()-1));
        
    }
}
