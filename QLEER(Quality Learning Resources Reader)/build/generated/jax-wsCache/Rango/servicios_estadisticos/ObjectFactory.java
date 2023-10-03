
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

    private final static QName _Rango_QNAME = new QName("http://Servicios_Estadisticos/", "Rango");
    private final static QName _RangoResponse_QNAME = new QName("http://Servicios_Estadisticos/", "RangoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rango_Type }
     * 
     */
    public Rango_Type createRango_Type() {
        return new Rango_Type();
    }

    /**
     * Create an instance of {@link RangoResponse }
     * 
     */
    public RangoResponse createRangoResponse() {
        return new RangoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rango_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rango_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Rango")
    public JAXBElement<Rango_Type> createRango(Rango_Type value) {
        return new JAXBElement<Rango_Type>(_Rango_QNAME, Rango_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RangoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "RangoResponse")
    public JAXBElement<RangoResponse> createRangoResponse(RangoResponse value) {
        return new JAXBElement<RangoResponse>(_RangoResponse_QNAME, RangoResponse.class, null, value);
    }

}
