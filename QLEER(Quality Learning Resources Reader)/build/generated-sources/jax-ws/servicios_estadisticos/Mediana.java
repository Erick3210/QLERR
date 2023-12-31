
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
@WebService(name = "Mediana", targetNamespace = "http://Servicios_Estadisticos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Mediana {


    /**
     * 
     * @param arreglo
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Mediana")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Mediana", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.Mediana_Type")
    @ResponseWrapper(localName = "MedianaResponse", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.MedianaResponse")
    @Action(input = "http://Servicios_Estadisticos/Mediana/MedianaRequest", output = "http://Servicios_Estadisticos/Mediana/MedianaResponse")
    public double mediana(
        @WebParam(name = "arreglo", targetNamespace = "")
        List<Double> arreglo);

}
