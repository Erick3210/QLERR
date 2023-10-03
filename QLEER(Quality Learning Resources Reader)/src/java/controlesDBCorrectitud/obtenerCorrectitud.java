/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBCorrectitud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author efcas
 */
public class obtenerCorrectitud {
    
    Connection con;
    
    ArrayList<Double> list2 = new ArrayList<>();
    
    
    public ArrayList<Double> ObtenerCorrectitudF() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/correctitud","root","");
   
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
    
    
      public ArrayList<Double> ObtenerCorrectitud2() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/correctitud","root","");
   
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
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        obtenerCorrectitud oC =new obtenerCorrectitud();
        
        System.out.println(oC.ObtenerCorrectitudF());
        
        
        
    }
    
    
}
