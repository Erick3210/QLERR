
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
@WebService(name = "Curtosis", targetNamespace = "http://Servicios_Estadisticos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Curtosis {


    /**
     * 
     * @param arreglo
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Curtosis")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Curtosis", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.Curtosis_Type")
    @ResponseWrapper(localName = "CurtosisResponse", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.CurtosisResponse")
    @Action(input = "http://Servicios_Estadisticos/Curtosis/CurtosisRequest", output = "http://Servicios_Estadisticos/Curtosis/CurtosisResponse")
    public double curtosis(
        @WebParam(name = "arreglo", targetNamespace = "")
        List<Double> arreglo);

}
