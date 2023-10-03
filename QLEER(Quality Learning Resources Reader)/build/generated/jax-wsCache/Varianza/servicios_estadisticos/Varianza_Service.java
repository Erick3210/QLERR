
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
@WebServiceClient(name = "Varianza", targetNamespace = "http://Servicios_Estadisticos/", wsdlLocation = "http://localhost:8080/Marco_De_Servicios_Estadisticos2/Varianza?wsdl")
public class Varianza_Service
    extends Service
{

    private final static URL VARIANZA_WSDL_LOCATION;
    private final static WebServiceException VARIANZA_EXCEPTION;
    private final static QName VARIANZA_QNAME = new QName("http://Servicios_Estadisticos/", "Varianza");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Marco_De_Servicios_Estadisticos2/Varianza?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VARIANZA_WSDL_LOCATION = url;
        VARIANZA_EXCEPTION = e;
    }

    public Varianza_Service() {
        super(__getWsdlLocation(), VARIANZA_QNAME);
    }

    public Varianza_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VARIANZA_QNAME, features);
    }

    public Varianza_Service(URL wsdlLocation) {
        super(wsdlLocation, VARIANZA_QNAME);
    }

    public Varianza_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VARIANZA_QNAME, features);
    }

    public Varianza_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Varianza_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Varianza
     */
    @WebEndpoint(name = "VarianzaPort")
    public Varianza getVarianzaPort() {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "VarianzaPort"), Varianza.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Varianza
     */
    @WebEndpoint(name = "VarianzaPort")
    public Varianza getVarianzaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "VarianzaPort"), Varianza.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VARIANZA_EXCEPTION!= null) {
            throw VARIANZA_EXCEPTION;
        }
        return VARIANZA_WSDL_LOCATION;
    }

}