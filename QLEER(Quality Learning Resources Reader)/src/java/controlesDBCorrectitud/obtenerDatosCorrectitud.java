/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBCorrectitud;


import controlesDBCorrectitud.getAndSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efcas
 */
public class obtenerDatosCorrectitud {
    
       List<getAndSet> list3 = new ArrayList<>();
       
        public List ObtenerDatosReusabilidad5(){
           
           
           ConexionDBL c = new ConexionDBL();
             Statement st;
            ResultSet r;

         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final WHERE fecha > '0000-00-00 00:00:00'");
           while(r.next()){
               
               getAndSet g2 = new getAndSet();
               
               g2.setValorf(r.getDouble("valor_final"));
               g2.setId(r.getInt("id"));
               g2.setTime(r.getTimestamp("fecha"));
               g2.setFormato(r.getString("formato"));

              
               list3.add(g2);

           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  list3;
    }
        
        
        public static void main(String[] args) {
        obtenerDatosCorrectitud oC =  new obtenerDatosCorrectitud();
        
            System.out.println(oC.ObtenerDatosReusabilidad5());
    }
}
