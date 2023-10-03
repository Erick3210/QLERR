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
public class obtenerColorDeFondoReusabilidad {
       List<String> listaDisponibilidad= new ArrayList<>();
       List<Double> listaDisponibilidad2= new ArrayList<>();
     
     public String ObtenerDatosAccesibilidad1(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefondo");
           while(r.next()){
               listaDisponibilidad.add( r.getString("colorDeFondo"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaDisponibilidad.get(listaDisponibilidad.size()-1);
    }
     
     public double ObtenerDatosAccesibilidad2(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM colordefondo");
           while(r.next()){
               listaDisponibilidad2.add( r.getDouble("porcentajeCF"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaDisponibilidad2.get(listaDisponibilidad2.size()-1);
    }
     
     
     public static void main(String[] args) {
        
         obtenerColorDeFondoReusabilidad o = new obtenerColorDeFondoReusabilidad();
         
         System.out.println(o.ObtenerDatosAccesibilidad2());
      
         
         
    }
}
