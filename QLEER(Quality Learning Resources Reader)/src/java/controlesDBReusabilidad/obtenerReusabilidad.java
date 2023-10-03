/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.
/**
 *
 * @author Erick F. Castillo
 */
public class obtenerReusabilidad {
    ArrayList<Double> listaCompletitud= new ArrayList<>();
    List<Double> list = new ArrayList<>();

   List<getAndSet2> list3 = new ArrayList<>();
      
    public double ObtenerDatosReusabilidad1(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final");
//           list.clear();
           while(r.next()){
                list.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
//         list.remove(list.size()-1);
         return   list.get(list.size()-1);
    }
    
        public ArrayList<Double> ObtenerDatosReusabilidad2(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final");
           while(r.next()){
               listaCompletitud.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCompletitud;
    }
    
     
     
        public double ObtenerDatosReusabilidad4(){
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;
         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final2");
//           list.clear();
           while(r.next()){
                list.add( r.getDouble("Valor_Final"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            c.con.close();
         }catch(SQLException e){
         
         }
//         list.remove(list.size()-1);
         return   list.get(list.size()-1);
    }
        
        
    public List ObtenerDatosReusabilidad5(){
           
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;

         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final WHERE fecha > '0000-00-00 00:00:00'");
           while(r.next()){
               
               getAndSet2 g2 = new getAndSet2();
               
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
    
    
    
     
          public static void main (String [] args){
          obtenerReusabilidad h= new obtenerReusabilidad();
          
              System.out.println( h.ObtenerDatosReusabilidad5());
     
          
              
//          Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/reusabilidad", "root", "");
//            stmt = conn.prepareStatement("SELECT fecha FROM valor_final WHERE id = ?");
//            stmt.setInt(1, 1);
//            rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                
//                Timestamp timestampValue = rs.getTimestamp("fecha");
//                System.out.println("Timestamp value: " + timestampValue);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (stmt != null) {
//                    stmt.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//              
//              
//          
//          
//          
          }
}
