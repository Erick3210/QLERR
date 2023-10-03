/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlesDBReusabilidad;


//import serviciosprincipal.ServiciosReusabilidad;
//import serviciosprincipal.ServiciosReusabilidad_Service;





/**
 *
 * @author Erick F. Castillo
 */
public class mediaReusabilidad {
     

     
    
//   public double ObtenerValorUsabilidad(double n1,double n2,double n3,double n4, double n5,double n6,double n7,double n8){
//       ServiciosReusabilidad_Service service =  new serviciosprincipal.ServiciosReusabilidad_Service();
//       ServiciosReusabilidad port = service.getServiciosReusabilidadPort();
//     return port.reusabilidadMedia(n1, n2, n3, n4, n5, n6, n7, n8);
//    }
//    
//    public double ObtenerValorLegibilidad(String m1,String m2){
//     webservice.WebServiceSOAP2_Service service = new webservice.WebServiceSOAP2_Service();
//     webservice.WebServiceSOAP2 port = service.getWebServiceSOAP2Port();
//     return port.redeability(m1, m2);
//    }
    
    
     

    
    public static void main (String [] args) {
   
        obtenerCompletitud oC =new obtenerCompletitud();
        obtenerDisponibilidad oD = new obtenerDisponibilidad();
        obtenerLegibilidad oL = new obtenerLegibilidad();
        obtenerUsabilidad oU = new obtenerUsabilidad();

        double n1 = oC.ObtenerDatosCompletitud1();
        double n2 = oD.ObtenerDatosDisponibilidad1();
        double n3 = oL.ObtenerDatosLegibilidad1();
        double n4 = oU.ObtenerDatosUsabilidad1();
        
        mediaReusabilidad mD =new mediaReusabilidad();
        
//        System.out.println(mD.ObtenerValorUsabilidad(n1, n2, n3, n4, 22.2, n, n7, n8));
    }
}
