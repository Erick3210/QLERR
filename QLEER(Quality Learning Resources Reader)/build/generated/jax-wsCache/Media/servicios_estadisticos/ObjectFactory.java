
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

    private final static QName _Media_QNAME = new QName("http://Servicios_Estadisticos/", "Media");
    private final static QName _MediaResponse_QNAME = new QName("http://Servicios_Estadisticos/", "MediaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios_estadisticos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Media_Type }
     * 
     */
    public Media_Type createMedia_Type() {
        return new Media_Type();
    }

    /**
     * Create an instance of {@link MediaResponse }
     * 
     */
    public MediaResponse createMediaResponse() {
        return new MediaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Media_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Media_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "Media")
    public JAXBElement<Media_Type> createMedia(Media_Type value) {
        return new JAXBElement<Media_Type>(_Media_QNAME, Media_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Servicios_Estadisticos/", name = "MediaResponse")
    public JAXBElement<MediaResponse> createMediaResponse(MediaResponse value) {
        return new JAXBElement<MediaResponse>(_MediaResponse_QNAME, MediaResponse.class, null, value);
    }

}
