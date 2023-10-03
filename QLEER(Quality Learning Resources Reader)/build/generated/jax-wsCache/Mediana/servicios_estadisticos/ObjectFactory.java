
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

    private final static QName _Mediana_QNAME = new QName("http://Servicios_Estadisticos/", "Mediana");
    private final static QName _MedianaResponse_QNAME = new QName("http://Servicios_Estadisticos/", "MedianaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mediana_Type }
     * 
     */
    public Mediana_Type createMediana_Type() {
        return new Mediana_Type();
    }

    /**
     * Create an instance of {@link MedianaResponse }
     * 
     */
    public MedianaResponse createMedianaResponse() {
        return new MedianaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mediana_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mediana_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Mediana")
    public JAXBElement<Mediana_Type> createMediana(Mediana_Type value) {
        return new JAXBElement<Mediana_Type>(_Mediana_QNAME, Mediana_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedianaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MedianaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "MedianaResponse")
    public JAXBElement<MedianaResponse> createMedianaResponse(MedianaResponse value) {
        return new JAXBElement<MedianaResponse>(_MedianaResponse_QNAME, MedianaResponse.class, null, value);
    }

}
