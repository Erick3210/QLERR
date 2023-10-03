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
public class obtenerCaracteristicasU {
    HttpSession Sesion;
    Connection con;
    
    List<String> listaCaracteristicas= new ArrayList<>();
   
      
      
    public List<String> ObtenerDatosCaracteristicasU() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reusabilidad","root","");
        

           
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM caracteristicasusabilidad");
           while(r.next()){
               listaCaracteristicas.add( r.getString("Alineacion"));
               listaCaracteristicas.add( r.getString("TipoDeLetra"));
               listaCaracteristicas.add( r.getString("ColorFuente"));
               listaCaracteristicas.add( r.getString("TamañoFuente"));
               listaCaracteristicas.add( r.getString("ColorFondo"));
        
//               System.out.println(r.getInt("Valor_Final"));
           }
            con.close();
         }catch(SQLException e){
         
         }
      
         return  listaCaracteristicas;
    }
    
    
      public static void main (String [] args) throws ClassNotFoundException, SQLException{
          
              
              obtenerCaracteristicasU n = new obtenerCaracteristicasU();
                String i, i2, i3, i4, i5;
                i= n.ObtenerDatosCaracteristicasU().get(n.ObtenerDatosCaracteristicasU().size()-1);
                i2= n.ObtenerDatosCaracteristicasU().get(n.ObtenerDatosCaracteristicasU().size()-2);
                i3= n.ObtenerDatosCaracteristicasU().get(n.ObtenerDatosCaracteristicasU().size()-3);
                i4= n.ObtenerDatosCaracteristicasU().get(n.ObtenerDatosCaracteristicasU().size()-4);
                i5= n.ObtenerDatosCaracteristicasU().get(n.ObtenerDatosCaracteristicasU().size()-5);
                System.out.println(i+" "+i2+" "+ i3+" "+ i4+" "+i5);
          
          
          
          
          }
}
