/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;


import controlesDBReusabilidad.getAndSetpdf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efcas
 */
public class obtenerArchivosPDF {
     Connection con;
     List<getAndSet> list2 = new ArrayList<>();
     datosDBLegibilidad dA = new datosDBLegibilidad();
     
    public List ObtenerLegibilidad2() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dA.getDireccion(),dA.getUsuario(),"");
   
            Statement st;
            ResultSet r;
            
         try{
           st=con.createStatement();
           r=st.executeQuery("SELECT * FROM archivospdf ");
       
           while(r.next()){
               getAndSet g2 = new getAndSet();
                g2.setNombre(r.getString("nombre"));
        

              
               list2.add(g2);
           }
            con.close();
         }catch(SQLException e){
         
         }
            
         return  list2;
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerArchivosPDF p = new obtenerArchivosPDF();
        
        System.out.println(p.ObtenerLegibilidad2());
    }
}
