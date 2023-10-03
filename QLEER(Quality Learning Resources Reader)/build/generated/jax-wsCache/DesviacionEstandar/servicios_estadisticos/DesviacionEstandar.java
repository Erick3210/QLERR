
package servicios_estadisticos;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DesviacionEstandar", targetNamespace = "http://Servicios_Estadisticos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DesviacionEstandar {


    /**
     * 
     * @param arreglo
     * @return
     *     returns double
     */
    @WebMethod(operationName = "DesviacionEstandar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DesviacionEstandar", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.DesviacionEstandar_Type")
    @ResponseWrapper(localName = "DesviacionEstandarResponse", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.DesviacionEstandarResponse")
    @Action(input = "http://Servicios_Estadisticos/DesviacionEstandar/DesviacionEstandarRequest", output = "http://Servicios_Estadisticos/DesviacionEstandar/DesviacionEstandarResponse")
    public double desviacionEstandar(
        @WebParam(name = "arreglo", targetNamespace = "")
        List<Double> arreglo);

}