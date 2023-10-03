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
public class obtenerCompletitud {
     List<Double> listaCompletitud= new ArrayList<>();
   
      
      
    public Double ObtenerDatosCompletitud1(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM completitud");
           while(r.next()){
               listaCompletitud.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCompletitud.get(listaCompletitud.size()-1);
    }
    
        public Double ObtenerDatosCompletitud2(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM completitud2");
           while(r.next()){
               listaCompletitud.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCompletitud.get(listaCompletitud.size()-1);
    }
    
    
     
     
     
          public static void main (String [] args){
          
              
              obtenerCompletitud n = new obtenerCompletitud();
                double i;
                i= n.ObtenerDatosCompletitud2();
                System.out.println(i);
          
          
          
          
          }
}
