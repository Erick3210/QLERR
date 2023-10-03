
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

    private final static QName _CalcularCorrelacion_QNAME = new QName("http://Servicios_Estadisticos/", "CalcularCorrelacion");
    private final static QName _CalcularCorrelacionResponse_QNAME = new QName("http://Servicios_Estadisticos/", "CalcularCorrelacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularCorrelacion }
     * 
     */
    public CalcularCorrelacion createCalcularCorrelacion() {
        return new CalcularCorrelacion();
    }

    /**
     * Create an instance of {@link CalcularCorrelacionResponse }
     * 
     */
    public CalcularCorrelacionResponse createCalcularCorrelacionResponse() {
        return new CalcularCorrelacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCorrelacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularCorrelacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "CalcularCorrelacion")
    public JAXBElement<CalcularCorrelacion> createCalcularCorrelacion(CalcularCorrelacion value) {
        return new JAXBElement<CalcularCorrelacion>(_CalcularCorrelacion_QNAME, CalcularCorrelacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCorrelacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularCorrelacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "CalcularCorrelacionResponse")
    public JAXBElement<CalcularCorrelacionResponse> createCalcularCorrelacionResponse(CalcularCorrelacionResponse value) {
        return new JAXBElement<CalcularCorrelacionResponse>(_CalcularCorrelacionResponse_QNAME, CalcularCorrelacionResponse.class, null, value);
    }

}
