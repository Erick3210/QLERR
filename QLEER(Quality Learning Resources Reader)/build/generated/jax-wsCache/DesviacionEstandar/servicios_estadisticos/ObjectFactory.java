
package servicios_estadisticos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios_estadisticos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DesviacionEstandar_QNAME = new QName("http://Servicios_Estadisticos/", "DesviacionEstandar");
    private final static QName _DesviacionEstandarResponse_QNAME = new QName("http://Servicios_Estadisticos/", "DesviacionEstandarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DesviacionEstandar_Type }
     * 
     */
    public DesviacionEstandar_Type createDesviacionEstandar_Type() {
        return new DesviacionEstandar_Type();
    }

    /**
     * Create an instance of {@link DesviacionEstandarResponse }
     * 
     */
    public DesviacionEstandarResponse createDesviacionEstandarResponse() {
        return new DesviacionEstandarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesviacionEstandar_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesviacionEstandar_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "DesviacionEstandar")
    public JAXBElement<DesviacionEstandar_Type> createDesviacionEstandar(DesviacionEstandar_Type value) {
        return new JAXBElement<DesviacionEstandar_Type>(_DesviacionEstandar_QNAME, DesviacionEstandar_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesviacionEstandarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesviacionEstandarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "DesviacionEstandarResponse")
    public JAXBElement<DesviacionEstandarResponse> createDesviacionEstandarResponse(DesviacionEstandarResponse value) {
        return new JAXBElement<DesviacionEstandarResponse>(_DesviacionEstandarResponse_QNAME, DesviacionEstandarResponse.class, null, value);
    }

}
