/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteDeServicios;

//import serviciosprincipal.ServiciosLegibilidad;

import java.util.ArrayList;
import servicios_estadisticos.Curtosis;
import servicios_estadisticos.Curtosis_Service;
import servicios_estadisticos.DesviacionEstandar;
import servicios_estadisticos.DesviacionEstandar_Service;
import servicios_estadisticos.Media;
import servicios_estadisticos.Media_Service;
import servicios_estadisticos.Mediana;
import servicios_estadisticos.Mediana_Service;
import servicios_estadisticos.Moda;
import servicios_estadisticos.Moda_Service;
import servicios_estadisticos.Rango;
import servicios_estadisticos.Rango_Service;
import servicios_estadisticos.Varianza;
import servicios_estadisticos.Varianza_Service;


//import serviciosprincipal.ServiciosLegibilidad_Service;
//import serviciosprincipal.ServiciosReusabilidad;
//import serviciosprincipal.ServiciosReusabilidad_Service;

/**
 *
 * @author efcas
 */
public class serviciosEstadisticosClienteLegibilidad {
    
     public double ObtenerMediaLegibilidad(ArrayList <Double> list){
       Media_Service  service  =  new servicios_estadisticos.Media_Service();
       Media port = service.getMediaPort();
       return port.media(list);
    }
    
    public double ObtenerMedianaLegibilidad(ArrayList <Double> list){
       Mediana_Service  service  =  new servicios_estadisticos.Mediana_Service();
       Mediana port = service.getMedianaPort();
       return port.mediana(list);
    }
    
    public double ObtenerModaLegibilidad(ArrayList <Double> list){
       Moda_Service  service  =  new servicios_estadisticos.Moda_Service();
       Moda port = service.getModaPort();
       return port.moda(list);
    }
    
    public double ObtenerVarianzaLegibilidad(ArrayList <Double> list){
       Varianza_Service  service  =  new servicios_estadisticos.Varianza_Service();
       Varianza port = service.getVarianzaPort();
       return port.varianza(list);
    }
    
    public double ObtenerRangoLegibilidad(ArrayList <Double> list){
       Rango_Service  service  =  new servicios_estadisticos.Rango_Service();
       Rango port = service.getRangoPort();
       return port.rango(list);
    }
    
    
    public double ObtenerDesviacionEstandarLegibilidad(ArrayList <Double> list){
       DesviacionEstandar_Service  service  =  new servicios_estadisticos.DesviacionEstandar_Service();
       DesviacionEstandar port = service.getDesviacionEstandarPort();
       return port.desviacionEstandar(list);
    }
    
    public double ObtenerCurtosisLegibilidad(ArrayList <Double> list){
       Curtosis_Service  service  =  new servicios_estadisticos.Curtosis_Service();
       Curtosis port = service.getCurtosisPort();
       return port.curtosis(list);
    }
  
}
