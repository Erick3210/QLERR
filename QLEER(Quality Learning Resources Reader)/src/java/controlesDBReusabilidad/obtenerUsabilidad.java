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
public class obtenerUsabilidad {
    List<Double> listaDisponibilidad= new ArrayList<>();
     
     public Double ObtenerDatosUsabilidad1(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM usabilidad");
           while(r.next()){
               listaDisponibilidad.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaDisponibilidad.get(listaDisponibilidad.size()-1);
    }
     
     
      public static void main (String [] args){
          
              
              obtenerUsabilidad  n = new obtenerUsabilidad();
                double i;
                i= n.ObtenerDatosUsabilidad1();
                System.out.println(i);
          
          
          
          
          }
}
