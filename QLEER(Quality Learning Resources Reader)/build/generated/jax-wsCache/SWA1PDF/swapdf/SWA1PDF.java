
package swapdf;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SWA1PDF", targetNamespace = "http://SWAPDF/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SWA1PDF {


    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertirPDFaBase64", targetNamespace = "http://SWAPDF/", className = "swapdf.ConvertirPDFaBase64")
    @ResponseWrapper(localName = "convertirPDFaBase64Response", targetNamespace = "http://SWAPDF/", className = "swapdf.ConvertirPDFaBase64Response")
    @Action(input = "http://SWAPDF/SWA1PDF/convertirPDFaBase64Request", output = "http://SWAPDF/SWA1PDF/convertirPDFaBase64Response", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://SWAPDF/SWA1PDF/convertirPDFaBase64/Fault/IOException")
    })
    public String convertirPDFaBase64()
        throws IOException_Exception
    ;

}
