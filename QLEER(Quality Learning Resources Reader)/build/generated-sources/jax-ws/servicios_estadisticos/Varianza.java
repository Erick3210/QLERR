
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
@WebService(name = "Varianza", targetNamespace = "http://Servicios_Estadisticos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Varianza {


    /**
     * 
     * @param arreglo
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Varianza")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Varianza", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.Varianza_Type")
    @ResponseWrapper(localName = "VarianzaResponse", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.VarianzaResponse")
    @Action(input = "http://Servicios_Estadisticos/Varianza/VarianzaRequest", output = "http://Servicios_Estadisticos/Varianza/VarianzaResponse")
    public double varianza(
        @WebParam(name = "arreglo", targetNamespace = "")
        List<Double> arreglo);

}
