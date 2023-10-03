
package swapdf;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SWA12PDF", targetNamespace = "http://SWAPDF/", wsdlLocation = "http://localhost/LWSEvaluate/SWA12PDF.xml")
public class SWA12PDF_Service
    extends Service
{

    private final static URL SWA12PDF_WSDL_LOCATION;
    private final static WebServiceException SWA12PDF_EXCEPTION;
    private final static QName SWA12PDF_QNAME = new QName("http://SWAPDF/", "SWA12PDF");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/LWSEvaluate/SWA12PDF.xml");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SWA12PDF_WSDL_LOCATION = url;
        SWA12PDF_EXCEPTION = e;
    }

    public SWA12PDF_Service() {
        super(__getWsdlLocation(), SWA12PDF_QNAME);
    }

    public SWA12PDF_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SWA12PDF_QNAME, features);
    }

    public SWA12PDF_Service(URL wsdlLocation) {
        super(wsdlLocation, SWA12PDF_QNAME);
    }

    public SWA12PDF_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SWA12PDF_QNAME, features);
    }

    public SWA12PDF_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SWA12PDF_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SWA12PDF
     */
    @WebEndpoint(name = "SWA12PDFPort")
    public SWA12PDF getSWA12PDFPort() {
        return super.getPort(new QName("http://SWAPDF/", "SWA12PDFPort"), SWA12PDF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SWA12PDF
     */
    @WebEndpoint(name = "SWA12PDFPort")
    public SWA12PDF getSWA12PDFPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://SWAPDF/", "SWA12PDFPort"), SWA12PDF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SWA12PDF_EXCEPTION!= null) {
            throw SWA12PDF_EXCEPTION;
        }
        return SWA12PDF_WSDL_LOCATION;
    }

}
