
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
@WebServiceClient(name = "Media", targetNamespace = "http://Servicios_Estadisticos/", wsdlLocation = "http://localhost:8080/Marco_De_Servicios_Estadisticos2/Media?wsdl")
public class Media_Service
    extends Service
{

    private final static URL MEDIA_WSDL_LOCATION;
    private final static WebServiceException MEDIA_EXCEPTION;
    private final static QName MEDIA_QNAME = new QName("http://Servicios_Estadisticos/", "Media");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Marco_De_Servicios_Estadisticos2/Media?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDIA_WSDL_LOCATION = url;
        MEDIA_EXCEPTION = e;
    }

    public Media_Service() {
        super(__getWsdlLocation(), MEDIA_QNAME);
    }

    public Media_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDIA_QNAME, features);
    }

    public Media_Service(URL wsdlLocation) {
        super(wsdlLocation, MEDIA_QNAME);
    }

    public Media_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDIA_QNAME, features);
    }

    public Media_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Media_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Media
     */
    @WebEndpoint(name = "MediaPort")
    public Media getMediaPort() {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "MediaPort"), Media.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Media
     */
    @WebEndpoint(name = "MediaPort")
    public Media getMediaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios_Estadisticos/", "MediaPort"), Media.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDIA_EXCEPTION!= null) {
            throw MEDIA_EXCEPTION;
        }
        return MEDIA_WSDL_LOCATION;
    }

}
