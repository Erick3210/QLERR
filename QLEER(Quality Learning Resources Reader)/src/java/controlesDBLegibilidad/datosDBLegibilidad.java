/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBLegibilidad;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author efcas
 */
public class datosDBLegibilidad {
    
//    String nameDB = "reusabilidad";
//    String user= "isoftware";
//    String password= "Software!23";
//    String port = "3306";
//    String iP ="172.16.10.210";
//    String tipo = "MYSQL";

  
   private static final String driver = "com.mysql.jdbc.Driver";
    private static final String direccion = "jdbc:mysql://localhost/legibilidad";
    private static final String usuario = "root";
//        Connection conn;
//        private static final String driver = "com.mysql.jdbc.Driver";
//        public static final String direccion = "jdbc:mysql://172.16.10.210:3306/legibilidad?user=isoftware&password=iSoftware!23&serverTimezone=UTC";
//        public static final String usuario = "isoftware";
//        public static final String clave = "iSoftware!23";

    
    
    
    public static String getDriver() {
        return driver;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static String getUsuario() {
        return usuario;
    }

//    public static String getClave() {
//        return clave;
//    }

    
    
 
    public static void main(String[] args) {
       
        datosDBLegibilidad p = new datosDBLegibilidad();

        
    }
    
}
