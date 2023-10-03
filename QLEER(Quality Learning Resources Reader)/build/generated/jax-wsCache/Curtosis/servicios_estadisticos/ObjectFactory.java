
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

    private final static QName _Curtosis_QNAME = new QName("http://Servicios_Estadisticos/", "Curtosis");
    private final static QName _CurtosisResponse_QNAME = new QName("http://Servicios_Estadisticos/", "CurtosisResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Curtosis_Type }
     * 
     */
    public Curtosis_Type createCurtosis_Type() {
        return new Curtosis_Type();
    }

    /**
     * Create an instance of {@link CurtosisResponse }
     * 
     */
    public CurtosisResponse createCurtosisResponse() {
        return new CurtosisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Curtosis_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Curtosis_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Curtosis")
    public JAXBElement<Curtosis_Type> createCurtosis(Curtosis_Type value) {
        return new JAXBElement<Curtosis_Type>(_Curtosis_QNAME, Curtosis_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurtosisResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurtosisResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "CurtosisResponse")
    public JAXBElement<CurtosisResponse> createCurtosisResponse(CurtosisResponse value) {
        return new JAXBElement<CurtosisResponse>(_CurtosisResponse_QNAME, CurtosisResponse.class, null, value);
    }

}
