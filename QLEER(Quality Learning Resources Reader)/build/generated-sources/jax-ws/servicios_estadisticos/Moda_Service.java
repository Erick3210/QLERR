
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
@WebServiceClient(name = "Moda", targetNamespace = "http://Servicios_Estadisticos/", wsdlLocation = "http://localhost:8080/Marco_De_Servicios_Estadisticos2/Moda?wsdl")
public class Moda_Service
    extends Service
{

    private final static URL MODA_WSDL_LOCATION;
    private final static WebServiceException MODA_EXCEPTION;
    private final static QName MODA_QNAME = new QName("http://Servicios_Estadisticos/", "Moda");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Marco_De_Servicios_Estadisticos2/Moda?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MODA_WSDL_LOCATION = url;
        MODA_EXCEPTION = e;
    }

    public Moda_Service() {
        super(__getWsdlLocation(), MODA_QNAME);
    }

    public Moda_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MODA_QNAME, features);
    }

    public Moda_Service(URL wsdlLocation) {
        super(wsdlLocation, MODA_QNAME);
    }

    public Moda_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MODA_QNAME, features);
    }

    public Moda_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Moda_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Moda
     */
    @WebEndpoint(name = "ModaPort")
    public Moda getModaPort() {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "ModaPort"), Moda.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Moda
     */
    @WebEndpoint(name = "ModaPort")
    public Moda getModaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "ModaPort"), Moda.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MODA_EXCEPTION!= null) {
            throw MODA_EXCEPTION;
        }
        return MODA_WSDL_LOCATION;
    }

}
