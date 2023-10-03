
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
@WebService(name = "Media", targetNamespace = "http://Servicios_Estadisticos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Media {


    /**
     * 
     * @param arreglo
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Media")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Media", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.Media_Type")
    @ResponseWrapper(localName = "MediaResponse", targetNamespace = "http://Servicios_Estadisticos/", className = "servicios_estadisticos.MediaResponse")
    @Action(input = "http://Servicios_Estadisticos/Media/MediaRequest", output = "http://Servicios_Estadisticos/Media/MediaResponse")
    public double media(
        @WebParam(name = "arreglo", targetNamespace = "")
        List<Double> arreglo);

}
