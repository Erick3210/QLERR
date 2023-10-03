/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

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
public class obtenerCaracteristicasC {
    HttpSession Sesion;
    Connection con;
    
    List<String> listaCaracteristicas= new ArrayList<>();
    
      public List<String> ObtenerDatosCaracteristicasC() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

           
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM caracteristicascompletitud");
           while(r.next()){
               listaCaracteristicas.add( r.getString("Escolaridad"));
               listaCaracteristicas.add( r.getString("Dominio"));
               listaCaracteristicas.add( r.getString("Tema"));
               listaCaracteristicas.add( r.getString("TipoDeContenido"));
               listaCaracteristicas.add( r.getString("Service"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
      
      
      
    public List<String> ObtenerDatosCaracteristicasC2() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

           
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM caracteristicascompletitud2");
           while(r.next()){
               listaCaracteristicas.add( r.getString("Escolaridad"));
               listaCaracteristicas.add( r.getString("Dominio"));
               listaCaracteristicas.add( r.getString("Tema"));
               listaCaracteristicas.add( r.getString("TipoDeContenido"));
               listaCaracteristicas.add( r.getString("Service"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
      
            public static void main (String [] args) throws ClassNotFoundException, SQLException{
          
              
              obtenerCaracteristicasC n = new obtenerCaracteristicasC();
                String i, i2, i3, i4, i5;
                i= n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size()-1);
                i2= n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size()-2);
                i3= n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size()-3);
                i4= n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size()-4);
                i5= n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size()-5);
                System.out.println(i+"  "+i2+"  "+ i3+"  "+ i4+"  "+i5);
          
          
          
          
          }
      
}
