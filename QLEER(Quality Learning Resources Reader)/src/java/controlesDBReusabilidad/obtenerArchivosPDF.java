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
public class obtenerArchivosPDF {
    List<getAndSetpdf> list = new ArrayList<>();
    List<getAndSetdocx> list2 = new ArrayList<>();

    
    public List ObtenerDatosArchivoPDF1(){
           
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;

         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM archivospdf ");
           while(r.next()){
               
               getAndSetpdf g2 = new getAndSetpdf();
               
               g2.setNombre(r.getString("nombre"));
        

              
               list.add(g2);

           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  list;
    }
    
    
    
    public List ObtenerDatosArchivoDOCX1(){
           
           
           ConexionDBR c = new ConexionDBR();
            c.getConnection();
             Statement st;
            ResultSet r;

         try{
           st=c.con.createStatement();
           r=st.executeQuery("SELECT * FROM archivosdocx ");
           while(r.next()){
               
               getAndSetdocx g2 = new getAndSetdocx();
               
               g2.setNombre(r.getString("nombre"));
        

              
               list2.add(g2);

           }
            c.con.close();
         }catch(SQLException e){
         
         }
      
         return  list2;
    }
    


    
    
    
    public static void main(String[] args) {
        obtenerArchivosPDF p = new obtenerArchivosPDF();
        
        System.out.println(p.ObtenerDatosArchivoPDF1());
        System.out.println(p.ObtenerDatosArchivoDOCX1());
        
    }
    
    
}
