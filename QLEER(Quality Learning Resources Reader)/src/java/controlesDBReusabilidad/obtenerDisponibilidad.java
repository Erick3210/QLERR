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
 * @author Erick F. Castillo
 */
public class obtenerDisponibilidad {
    
    List<Double> listaDisponibilidad= new ArrayList<>();
    
    
     
     public Double ObtenerDatosDisponibilidad1(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM disponibilidad");
           while(r.next()){
               listaDisponibilidad.add( r.getDouble("valor_final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaDisponibilidad.get(listaDisponibilidad.size()-1);
    }
     
        public Double ObtenerDatosDisponibilidad2(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM disponibilidad2");
           while(r.next()){
               listaDisponibilidad.add( r.getDouble("valor_final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaDisponibilidad.get(listaDisponibilidad.size()-1);
    }
     
     
      public static void main (String [] args){
          
              
              obtenerDisponibilidad  n = new obtenerDisponibilidad();
                double i;
                i= n.ObtenerDatosDisponibilidad2();
                System.out.println(i);
          
          
          
          
          }
}
