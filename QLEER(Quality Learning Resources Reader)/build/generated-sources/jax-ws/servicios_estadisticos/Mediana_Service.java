
package servicios_estadisticos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Mediana", targetNamespace = "http://Servicios_Estadisticos/", wsdlLocation = "http://localhost:8080/Marco_De_Servicios_Estadisticos2/Mediana?wsdl")
public class Mediana_Service
    extends Service
{

    private final static URL MEDIANA_WSDL_LOCATION;
    private final static WebServiceException MEDIANA_EXCEPTION;
    private final static QName MEDIANA_QNAME = new QName("http://Servicios_Estadisticos/", "Mediana");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Marco_De_Servicios_Estadisticos2/Mediana?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDIANA_WSDL_LOCATION = url;
        MEDIANA_EXCEPTION = e;
    }

    public Mediana_Service() {
        super(__getWsdlLocation(), MEDIANA_QNAME);
    }

    public Mediana_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDIANA_QNAME, features);
    }

    public Mediana_Service(URL wsdlLocation) {
        super(wsdlLocation, MEDIANA_QNAME);
    }

    public Mediana_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDIANA_QNAME, features);
    }

    public Mediana_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Mediana_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Mediana
     */
    @WebEndpoint(name = "MedianaPort")
    public Mediana getMedianaPort() {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "MedianaPort"), Mediana.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Mediana
     */
    @WebEndpoint(name = "MedianaPort")
    public Mediana getMedianaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "MedianaPort"), Mediana.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDIANA_EXCEPTION!= null) {
            throw MEDIANA_EXCEPTION;
        }
        return MEDIANA_WSDL_LOCATION;
    }

}
