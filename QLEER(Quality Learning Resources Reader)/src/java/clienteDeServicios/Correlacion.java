/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteDeServicios;

import java.util.ArrayList;
import servicios_estadisticos.Correlacion_Service;


/**
 *
 * @author efcas
 */
public class Correlacion {
    
    public double ObtenerCorrelacion(ArrayList <Double> list1,ArrayList <Double> list2){
       Correlacion_Service  service  =  new servicios_estadisticos.Correlacion_Service();
       servicios_estadisticos.Correlacion port = service.getCorrelacionPort();
       return port.calcularCorrelacion(list1, list2);
    }
}
