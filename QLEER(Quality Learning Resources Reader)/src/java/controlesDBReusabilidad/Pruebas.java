/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;


/**
 *
 * @author efcas
 */
public class Pruebas {
    

    
    
    public double ObtenerValorUsabilidad(String m1,String m2){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.usability(m1, m2);
    }
    
    public double ObtenerValorLegibilidad(String m1,String m2){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.redeability(m1, m2);
    }
    
    
    
    
//    public List<String> ObtenerAlineacion(String m1){
//     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
//     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
//     return port.alineacion(m1);
//    }
//    
//    public List<String> TipoDeLetra(String m1){
//     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
//     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
//     return port.tipoDeLetra(m1);
//    }
//    
//    public List<String> ColorDeLaFuente(String m1){
//     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
//     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
//     return port.colorDeLaFuente(m1);
//    }
//    
//    public List<String> TamañoDeLaFuente(String m1){
//     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
//     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
//     return port.tamañoDeLaFuente(m1);
//    }
//    
//     public List<String> ColorDeFondo(String m1){
//     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
//     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
//     return port.colorDeFondo(m1);
//    }
    
     
    public String ObtenerValorReusabilidadFinal(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.lwsProcess(m1);
    }
    
      public double ObtenerValorAccesibilidad(String m1,String m2){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.accesibility(m1, m2);
    }
      
      
     public double ObtenerValorCompletitud(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.completitud(m1);
    }
    
    public double ObtenerValorDisponibilidad(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.aviabilidad(m1);
    }
    
    
    
    
    public double ObtenerNivelDeEscolaridad(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.defecto1(m1);
    }
     
    public double ObtenerNivelDeDominio(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.defecto2(m1);
    }
         
    public double ObtenerTema(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.defecto3(m1);
    }  
    
    public double ObtenerTipoDeContenido(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.defecto4(m1);
    } 
    
    public double ObtenerEficienciaDelServicio(String m1){
     webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
     webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
     return port.defecto5(m1);
    } 
      
      

    
    
    
      public static void main (String [] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{
          
//          guardarUsabilidad gu = new guardarUsabilidad();
//          guardarLegibilidad gl =  new guardarLegibilidad();
          
          Pruebas p = new Pruebas();
   
          
          
          
//        p.ObtenerTipoDeContenido("http://localhost:8080/ServiciosWebDeAprendizaje/SWA2DOCX?wsdl");

    
          
          
          
//          System.out.println(p.ObtenerValorReusabilidadContenido("http://localhost/LWSEvaluate/lwsdocWSDL.xml"));
//          String dir = p.ObtenerDireccion("http://localhost/LWSEvaluate/lwsdocWSDL.xml");
//          "http://localhost:8080/ServiciosWebDeAprendizaje/SWA2DOCX?wsdl"
//          System.out.println(p.ObtenerValorUsabilidad("docx","C:/Users/efcas/OneDrive/ESCRITORIO 2/Pruebas/recursosDocx/recurso3.docx"));
//          System.out.println(p.ObtenerValorLegibilidad("docx","C:/Users/efcas/OneDrive/ESCRITORIO 2/Pruebas/recursosDocx/recurso3.docx"));
//          
//          System.out.println(dir);
//       
//          
//        
//          System.out.println(p.ObtenerAlineacion("C:/Users/efcas/OneDrive/ESCRITORIO 2/Pruebas/recursosDocx/recurso3.docx").get(p.ObtenerAlineacion("C:/Users/efcas/OneDrive/ESCRITORIO 2/Pruebas/recursosDocx/recurso3.docx").size()-1));
//          
//          gu.guardar(p.ObtenerValorUsabilidad("docx",dir));
//          gl.guardar(p.ObtenerValorLegibilidad("docx",dir));

// 
//        String Reus = oR.ObtenerDatosReusabilidad1().get(oR.ObtenerDatosReusabilidad1().size()-1);
//          
//         double i = Double.parseDouble(Reus);
//         System.out.println("Cadena real:" + i); 
          
        }
    
}
