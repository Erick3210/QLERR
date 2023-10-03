
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

    private final static QName _Varianza_QNAME = new QName("http://Servicios_Estadisticos/", "Varianza");
    private final static QName _VarianzaResponse_QNAME = new QName("http://Servicios_Estadisticos/", "VarianzaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Varianza_Type }
     * 
     */
    public Varianza_Type createVarianza_Type() {
        return new Varianza_Type();
    }

    /**
     * Create an instance of {@link VarianzaResponse }
     * 
     */
    public VarianzaResponse createVarianzaResponse() {
        return new VarianzaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Varianza_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Varianza_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Varianza")
    public JAXBElement<Varianza_Type> createVarianza(Varianza_Type value) {
        return new JAXBElement<Varianza_Type>(_Varianza_QNAME, Varianza_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarianzaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VarianzaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "VarianzaResponse")
    public JAXBElement<VarianzaResponse> createVarianzaResponse(VarianzaResponse value) {
        return new JAXBElement<VarianzaResponse>(_VarianzaResponse_QNAME, VarianzaResponse.class, null, value);
    }

}
