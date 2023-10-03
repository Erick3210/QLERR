
package swapdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the swapdf package. 
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

    private final static QName _IOException_QNAME = new QName("http://SWAPDF/", "IOException");
    private final static QName _ConvertirPDFaBase64_QNAME = new QName("http://SWAPDF/", "convertirPDFaBase64");
    private final static QName _ConvertirPDFaBase64Response_QNAME = new QName("http://SWAPDF/", "convertirPDFaBase64Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: swapdf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link ConvertirPDFaBase64 }
     * 
     */
    public ConvertirPDFaBase64 createConvertirPDFaBase64() {
        return new ConvertirPDFaBase64();
    }

    /**
     * Create an instance of {@link ConvertirPDFaBase64Response }
     * 
     */
    public ConvertirPDFaBase64Response createConvertirPDFaBase64Response() {
        return new ConvertirPDFaBase64Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://SWAPDF/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPDFaBase64 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertirPDFaBase64 }{@code >}
     */
    @XmlElementDecl(namespace = "http://SWAPDF/", name = "convertirPDFaBase64")
    public JAXBElement<ConvertirPDFaBase64> createConvertirPDFaBase64(ConvertirPDFaBase64 value) {
        return new JAXBElement<ConvertirPDFaBase64>(_ConvertirPDFaBase64_QNAME, ConvertirPDFaBase64 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPDFaBase64Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertirPDFaBase64Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://SWAPDF/", name = "convertirPDFaBase64Response")
    public JAXBElement<ConvertirPDFaBase64Response> createConvertirPDFaBase64Response(ConvertirPDFaBase64Response value) {
        return new JAXBElement<ConvertirPDFaBase64Response>(_ConvertirPDFaBase64Response_QNAME, ConvertirPDFaBase64Response.class, null, value);
    }

}
