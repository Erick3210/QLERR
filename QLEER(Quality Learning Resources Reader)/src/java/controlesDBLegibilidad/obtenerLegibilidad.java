/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;

import controlesDBReusabilidad.getAndSet2;
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
 * @author efcas
 */
public class obtenerLegibilidad {
    
 List<getAndSet> list3 = new ArrayList<>();
    Connection con;
    
    ArrayList<Double> list2 = new ArrayList<>();
    
    List<Double> list = new ArrayList<>();
   
    datosDBLegibilidad dA = new datosDBLegibilidad();
      
      
    public double ObtenerLegibilidad1() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final");
       
           while(r.next()){
               list.add( r.getDouble("Valor_Final"));
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
            
         return  list.get(list.size()-1);
    }
    
    
     public ArrayList<Double> ObtenerLegibilidad2() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final");
       
           while(r.next()){
               list2.add( r.getDouble("Valor_Final"));
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
            
         return  list2;
    }
     
     
   public List ObtenerDatosLegibilidad3()throws ClassNotFoundException, SQLException{
           
           
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;

         try{

           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM valor_final WHERE fecha > '0000-00-00 00:00:00'");
           while(r.next()){
               
               getAndSet g2 = new getAndSet();
               
               g2.setValorf(r.getDouble("Valor_Final"));
               g2.setId(r.getInt("id"));
               g2.setTime(r.getTimestamp("fecha"));
               g2.setFormato(r.getString("formato"));

              
               list3.add(g2);

           }
           con.close();
         }catch(SQLException e){
         
         }
      
         return  list3;
    }
    
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerLegibilidad  g = new obtenerLegibilidad ();
        
           System.out.println(g.ObtenerDatosLegibilidad3());
        
        
    }
}
