
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

    private final static QName _Moda_QNAME = new QName("http://Servicios_Estadisticos/", "Moda");
    private final static QName _ModaResponse_QNAME = new QName("http://Servicios_Estadisticos/", "ModaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Moda_Type }
     * 
     */
    public Moda_Type createModa_Type() {
        return new Moda_Type();
    }

    /**
     * Create an instance of {@link ModaResponse }
     * 
     */
    public ModaResponse createModaResponse() {
        return new ModaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Moda_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Moda_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Moda")
    public JAXBElement<Moda_Type> createModa(Moda_Type value) {
        return new JAXBElement<Moda_Type>(_Moda_QNAME, Moda_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "ModaResponse")
    public JAXBElement<ModaResponse> createModaResponse(ModaResponse value) {
        return new JAXBElement<ModaResponse>(_ModaResponse_QNAME, ModaResponse.class, null, value);
    }

}
