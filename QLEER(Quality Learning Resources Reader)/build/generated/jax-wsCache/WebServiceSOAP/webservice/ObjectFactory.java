
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _Accesibility_QNAME = new QName("http://WebService/", "Accesibility");
    private final static QName _AccesibilityResponse_QNAME = new QName("http://WebService/", "AccesibilityResponse");
    private final static QName _AlineacionDocX_QNAME = new QName("http://WebService/", "AlineacionDocX");
    private final static QName _AlineacionDocXResponse_QNAME = new QName("http://WebService/", "AlineacionDocXResponse");
    private final static QName _AlineacionPDF_QNAME = new QName("http://WebService/", "AlineacionPDF");
    private final static QName _AlineacionPDFResponse_QNAME = new QName("http://WebService/", "AlineacionPDFResponse");
    private final static QName _Aviabilidad_QNAME = new QName("http://WebService/", "Aviabilidad");
    private final static QName _AviabilidadResponse_QNAME = new QName("http://WebService/", "AviabilidadResponse");
    private final static QName _ColorDeFondoDocX_QNAME = new QName("http://WebService/", "ColorDeFondoDocX");
    private final static QName _ColorDeFondoDocXResponse_QNAME = new QName("http://WebService/", "ColorDeFondoDocXResponse");
    private final static QName _ColorDeFondoPDF_QNAME = new QName("http://WebService/", "ColorDeFondoPDF");
    private final static QName _ColorDeFondoPDFResponse_QNAME = new QName("http://WebService/", "ColorDeFondoPDFResponse");
    private final static QName _ColorDeLaFuenteDocX_QNAME = new QName("http://WebService/", "ColorDeLaFuenteDocX");
    private final static QName _ColorDeLaFuenteDocXResponse_QNAME = new QName("http://WebService/", "ColorDeLaFuenteDocXResponse");
    private final static QName _ColorDeLaFuentePDF_QNAME = new QName("http://WebService/", "ColorDeLaFuentePDF");
    private final static QName _ColorDeLaFuentePDFResponse_QNAME = new QName("http://WebService/", "ColorDeLaFuentePDFResponse");
    private final static QName _Completitud_QNAME = new QName("http://WebService/", "Completitud");
    private final static QName _CompletitudResponse_QNAME = new QName("http://WebService/", "CompletitudResponse");
    private final static QName _Defecto1_QNAME = new QName("http://WebService/", "Defecto1");
    private final static QName _Defecto1Response_QNAME = new QName("http://WebService/", "Defecto1Response");
    private final static QName _Defecto2_QNAME = new QName("http://WebService/", "Defecto2");
    private final static QName _Defecto2Response_QNAME = new QName("http://WebService/", "Defecto2Response");
    private final static QName _Defecto3_QNAME = new QName("http://WebService/", "Defecto3");
    private final static QName _Defecto3Response_QNAME = new QName("http://WebService/", "Defecto3Response");
    private final static QName _Defecto4_QNAME = new QName("http://WebService/", "Defecto4");
    private final static QName _Defecto4Response_QNAME = new QName("http://WebService/", "Defecto4Response");
    private final static QName _Defecto5_QNAME = new QName("http://WebService/", "Defecto5");
    private final static QName _Defecto5Response_QNAME = new QName("http://WebService/", "Defecto5Response");
    private final static QName _LWSProcess_QNAME = new QName("http://WebService/", "LWSProcess");
    private final static QName _LWSProcessResponse_QNAME = new QName("http://WebService/", "LWSProcessResponse");
    private final static QName _TamañoDeLaFuenteDocX_QNAME = new QName("http://WebService/", "Tama\u00f1oDeLaFuenteDocX");
    private final static QName _TamañoDeLaFuenteDocXResponse_QNAME = new QName("http://WebService/", "Tama\u00f1oDeLaFuenteDocXResponse");
    private final static QName _TamañoDeLaFuentePDF_QNAME = new QName("http://WebService/", "Tama\u00f1oDeLaFuentePDF");
    private final static QName _TamañoDeLaFuentePDFResponse_QNAME = new QName("http://WebService/", "Tama\u00f1oDeLaFuentePDFResponse");
    private final static QName _TipoDeLetraDocX_QNAME = new QName("http://WebService/", "TipoDeLetraDocX");
    private final static QName _TipoDeLetraDocXResponse_QNAME = new QName("http://WebService/", "TipoDeLetraDocXResponse");
    private final static QName _TipoDeLetraPDF_QNAME = new QName("http://WebService/", "TipoDeLetraPDF");
    private final static QName _TipoDeLetraPDFResponse_QNAME = new QName("http://WebService/", "TipoDeLetraPDFResponse");
    private final static QName _Redeability_QNAME = new QName("http://WebService/", "redeability");
    private final static QName _RedeabilityResponse_QNAME = new QName("http://WebService/", "redeabilityResponse");
    private final static QName _Usability_QNAME = new QName("http://WebService/", "usability");
    private final static QName _UsabilityResponse_QNAME = new QName("http://WebService/", "usabilityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Accesibility }
     * 
     */
    public Accesibility createAccesibility() {
        return new Accesibility();
    }

    /**
     * Create an instance of {@link AccesibilityResponse }
     * 
     */
    public AccesibilityResponse createAccesibilityResponse() {
        return new AccesibilityResponse();
    }

    /**
     * Create an instance of {@link AlineacionDocX }
     * 
     */
    public AlineacionDocX createAlineacionDocX() {
        return new AlineacionDocX();
    }

    /**
     * Create an instance of {@link AlineacionDocXResponse }
     * 
     */
    public AlineacionDocXResponse createAlineacionDocXResponse() {
        return new AlineacionDocXResponse();
    }

    /**
     * Create an instance of {@link AlineacionPDF }
     * 
     */
    public AlineacionPDF createAlineacionPDF() {
        return new AlineacionPDF();
    }

    /**
     * Create an instance of {@link AlineacionPDFResponse }
     * 
     */
    public AlineacionPDFResponse createAlineacionPDFResponse() {
        return new AlineacionPDFResponse();
    }

    /**
     * Create an instance of {@link Aviabilidad }
     * 
     */
    public Aviabilidad createAviabilidad() {
        return new Aviabilidad();
    }

    /**
     * Create an instance of {@link AviabilidadResponse }
     * 
     */
    public AviabilidadResponse createAviabilidadResponse() {
        return new AviabilidadResponse();
    }

    /**
     * Create an instance of {@link ColorDeFondoDocX }
     * 
     */
    public ColorDeFondoDocX createColorDeFondoDocX() {
        return new ColorDeFondoDocX();
    }

    /**
     * Create an instance of {@link ColorDeFondoDocXResponse }
     * 
     */
    public ColorDeFondoDocXResponse createColorDeFondoDocXResponse() {
        return new ColorDeFondoDocXResponse();
    }

    /**
     * Create an instance of {@link ColorDeFondoPDF }
     * 
     */
    public ColorDeFondoPDF createColorDeFondoPDF() {
        return new ColorDeFondoPDF();
    }

    /**
     * Create an instance of {@link ColorDeFondoPDFResponse }
     * 
     */
    public ColorDeFondoPDFResponse createColorDeFondoPDFResponse() {
        return new ColorDeFondoPDFResponse();
    }

    /**
     * Create an instance of {@link ColorDeLaFuenteDocX }
     * 
     */
    public ColorDeLaFuenteDocX createColorDeLaFuenteDocX() {
        return new ColorDeLaFuenteDocX();
    }

    /**
     * Create an instance of {@link ColorDeLaFuenteDocXResponse }
     * 
     */
    public ColorDeLaFuenteDocXResponse createColorDeLaFuenteDocXResponse() {
        return new ColorDeLaFuenteDocXResponse();
    }

    /**
     * Create an instance of {@link ColorDeLaFuentePDF }
     * 
     */
    public ColorDeLaFuentePDF createColorDeLaFuentePDF() {
        return new ColorDeLaFuentePDF();
    }

    /**
     * Create an instance of {@link ColorDeLaFuentePDFResponse }
     * 
     */
    public ColorDeLaFuentePDFResponse createColorDeLaFuentePDFResponse() {
        return new ColorDeLaFuentePDFResponse();
    }

    /**
     * Create an instance of {@link Completitud }
     * 
     */
    public Completitud createCompletitud() {
        return new Completitud();
    }

    /**
     * Create an instance of {@link CompletitudResponse }
     * 
     */
    public CompletitudResponse createCompletitudResponse() {
        return new CompletitudResponse();
    }

    /**
     * Create an instance of {@link Defecto1 }
     * 
     */
    public Defecto1 createDefecto1() {
        return new Defecto1();
    }

    /**
     * Create an instance of {@link Defecto1Response }
     * 
     */
    public Defecto1Response createDefecto1Response() {
        return new Defecto1Response();
    }

    /**
     * Create an instance of {@link Defecto2 }
     * 
     */
    public Defecto2 createDefecto2() {
        return new Defecto2();
    }

    /**
     * Create an instance of {@link Defecto2Response }
     * 
     */
    public Defecto2Response createDefecto2Response() {
        return new Defecto2Response();
    }

    /**
     * Create an instance of {@link Defecto3 }
     * 
     */
    public Defecto3 createDefecto3() {
        return new Defecto3();
    }

    /**
     * Create an instance of {@link Defecto3Response }
     * 
     */
    public Defecto3Response createDefecto3Response() {
        return new Defecto3Response();
    }

    /**
     * Create an instance of {@link Defecto4 }
     * 
     */
    public Defecto4 createDefecto4() {
        return new Defecto4();
    }

    /**
     * Create an instance of {@link Defecto4Response }
     * 
     */
    public Defecto4Response createDefecto4Response() {
        return new Defecto4Response();
    }

    /**
     * Create an instance of {@link Defecto5 }
     * 
     */
    public Defecto5 createDefecto5() {
        return new Defecto5();
    }

    /**
     * Create an instance of {@link Defecto5Response }
     * 
     */
    public Defecto5Response createDefecto5Response() {
        return new Defecto5Response();
    }

    /**
     * Create an instance of {@link LWSProcess }
     * 
     */
    public LWSProcess createLWSProcess() {
        return new LWSProcess();
    }

    /**
     * Create an instance of {@link LWSProcessResponse }
     * 
     */
    public LWSProcessResponse createLWSProcessResponse() {
        return new LWSProcessResponse();
    }

    /**
     * Create an instance of {@link TamañoDeLaFuenteDocX }
     * 
     */
    public TamañoDeLaFuenteDocX createTamañoDeLaFuenteDocX() {
        return new TamañoDeLaFuenteDocX();
    }

    /**
     * Create an instance of {@link TamañoDeLaFuenteDocXResponse }
     * 
     */
    public TamañoDeLaFuenteDocXResponse createTamañoDeLaFuenteDocXResponse() {
        return new TamañoDeLaFuenteDocXResponse();
    }

    /**
     * Create an instance of {@link TamañoDeLaFuentePDF }
     * 
     */
    public TamañoDeLaFuentePDF createTamañoDeLaFuentePDF() {
        return new TamañoDeLaFuentePDF();
    }

    /**
     * Create an instance of {@link TamañoDeLaFuentePDFResponse }
     * 
     */
    public TamañoDeLaFuentePDFResponse createTamañoDeLaFuentePDFResponse() {
        return new TamañoDeLaFuentePDFResponse();
    }

    /**
     * Create an instance of {@link TipoDeLetraDocX }
     * 
     */
    public TipoDeLetraDocX createTipoDeLetraDocX() {
        return new TipoDeLetraDocX();
    }

    /**
     * Create an instance of {@link TipoDeLetraDocXResponse }
     * 
     */
    public TipoDeLetraDocXResponse createTipoDeLetraDocXResponse() {
        return new TipoDeLetraDocXResponse();
    }

    /**
     * Create an instance of {@link TipoDeLetraPDF }
     * 
     */
    public TipoDeLetraPDF createTipoDeLetraPDF() {
        return new TipoDeLetraPDF();
    }

    /**
     * Create an instance of {@link TipoDeLetraPDFResponse }
     * 
     */
    public TipoDeLetraPDFResponse createTipoDeLetraPDFResponse() {
        return new TipoDeLetraPDFResponse();
    }

    /**
     * Create an instance of {@link Redeability }
     * 
     */
    public Redeability createRedeability() {
        return new Redeability();
    }

    /**
     * Create an instance of {@link RedeabilityResponse }
     * 
     */
    public RedeabilityResponse createRedeabilityResponse() {
        return new RedeabilityResponse();
    }

    /**
     * Create an instance of {@link Usability }
     * 
     */
    public Usability createUsability() {
        return new Usability();
    }

    /**
     * Create an instance of {@link UsabilityResponse }
     * 
     */
    public UsabilityResponse createUsabilityResponse() {
        return new UsabilityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Accesibility }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Accesibility }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Accesibility")
    public JAXBElement<Accesibility> createAccesibility(Accesibility value) {
        return new JAXBElement<Accesibility>(_Accesibility_QNAME, Accesibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccesibilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccesibilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AccesibilityResponse")
    public JAXBElement<AccesibilityResponse> createAccesibilityResponse(AccesibilityResponse value) {
        return new JAXBElement<AccesibilityResponse>(_AccesibilityResponse_QNAME, AccesibilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlineacionDocX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlineacionDocX }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AlineacionDocX")
    public JAXBElement<AlineacionDocX> createAlineacionDocX(AlineacionDocX value) {
        return new JAXBElement<AlineacionDocX>(_AlineacionDocX_QNAME, AlineacionDocX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlineacionDocXResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlineacionDocXResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AlineacionDocXResponse")
    public JAXBElement<AlineacionDocXResponse> createAlineacionDocXResponse(AlineacionDocXResponse value) {
        return new JAXBElement<AlineacionDocXResponse>(_AlineacionDocXResponse_QNAME, AlineacionDocXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlineacionPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlineacionPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AlineacionPDF")
    public JAXBElement<AlineacionPDF> createAlineacionPDF(AlineacionPDF value) {
        return new JAXBElement<AlineacionPDF>(_AlineacionPDF_QNAME, AlineacionPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlineacionPDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlineacionPDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AlineacionPDFResponse")
    public JAXBElement<AlineacionPDFResponse> createAlineacionPDFResponse(AlineacionPDFResponse value) {
        return new JAXBElement<AlineacionPDFResponse>(_AlineacionPDFResponse_QNAME, AlineacionPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aviabilidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Aviabilidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Aviabilidad")
    public JAXBElement<Aviabilidad> createAviabilidad(Aviabilidad value) {
        return new JAXBElement<Aviabilidad>(_Aviabilidad_QNAME, Aviabilidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AviabilidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AviabilidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "AviabilidadResponse")
    public JAXBElement<AviabilidadResponse> createAviabilidadResponse(AviabilidadResponse value) {
        return new JAXBElement<AviabilidadResponse>(_AviabilidadResponse_QNAME, AviabilidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeFondoDocX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeFondoDocX }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeFondoDocX")
    public JAXBElement<ColorDeFondoDocX> createColorDeFondoDocX(ColorDeFondoDocX value) {
        return new JAXBElement<ColorDeFondoDocX>(_ColorDeFondoDocX_QNAME, ColorDeFondoDocX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeFondoDocXResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeFondoDocXResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeFondoDocXResponse")
    public JAXBElement<ColorDeFondoDocXResponse> createColorDeFondoDocXResponse(ColorDeFondoDocXResponse value) {
        return new JAXBElement<ColorDeFondoDocXResponse>(_ColorDeFondoDocXResponse_QNAME, ColorDeFondoDocXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeFondoPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeFondoPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeFondoPDF")
    public JAXBElement<ColorDeFondoPDF> createColorDeFondoPDF(ColorDeFondoPDF value) {
        return new JAXBElement<ColorDeFondoPDF>(_ColorDeFondoPDF_QNAME, ColorDeFondoPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeFondoPDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeFondoPDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeFondoPDFResponse")
    public JAXBElement<ColorDeFondoPDFResponse> createColorDeFondoPDFResponse(ColorDeFondoPDFResponse value) {
        return new JAXBElement<ColorDeFondoPDFResponse>(_ColorDeFondoPDFResponse_QNAME, ColorDeFondoPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuenteDocX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuenteDocX }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeLaFuenteDocX")
    public JAXBElement<ColorDeLaFuenteDocX> createColorDeLaFuenteDocX(ColorDeLaFuenteDocX value) {
        return new JAXBElement<ColorDeLaFuenteDocX>(_ColorDeLaFuenteDocX_QNAME, ColorDeLaFuenteDocX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuenteDocXResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuenteDocXResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeLaFuenteDocXResponse")
    public JAXBElement<ColorDeLaFuenteDocXResponse> createColorDeLaFuenteDocXResponse(ColorDeLaFuenteDocXResponse value) {
        return new JAXBElement<ColorDeLaFuenteDocXResponse>(_ColorDeLaFuenteDocXResponse_QNAME, ColorDeLaFuenteDocXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuentePDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuentePDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeLaFuentePDF")
    public JAXBElement<ColorDeLaFuentePDF> createColorDeLaFuentePDF(ColorDeLaFuentePDF value) {
        return new JAXBElement<ColorDeLaFuentePDF>(_ColorDeLaFuentePDF_QNAME, ColorDeLaFuentePDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuentePDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorDeLaFuentePDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ColorDeLaFuentePDFResponse")
    public JAXBElement<ColorDeLaFuentePDFResponse> createColorDeLaFuentePDFResponse(ColorDeLaFuentePDFResponse value) {
        return new JAXBElement<ColorDeLaFuentePDFResponse>(_ColorDeLaFuentePDFResponse_QNAME, ColorDeLaFuentePDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Completitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Completitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Completitud")
    public JAXBElement<Completitud> createCompletitud(Completitud value) {
        return new JAXBElement<Completitud>(_Completitud_QNAME, Completitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompletitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "CompletitudResponse")
    public JAXBElement<CompletitudResponse> createCompletitudResponse(CompletitudResponse value) {
        return new JAXBElement<CompletitudResponse>(_CompletitudResponse_QNAME, CompletitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto1")
    public JAXBElement<Defecto1> createDefecto1(Defecto1 value) {
        return new JAXBElement<Defecto1>(_Defecto1_QNAME, Defecto1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto1Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto1Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto1Response")
    public JAXBElement<Defecto1Response> createDefecto1Response(Defecto1Response value) {
        return new JAXBElement<Defecto1Response>(_Defecto1Response_QNAME, Defecto1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto2")
    public JAXBElement<Defecto2> createDefecto2(Defecto2 value) {
        return new JAXBElement<Defecto2>(_Defecto2_QNAME, Defecto2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto2Response")
    public JAXBElement<Defecto2Response> createDefecto2Response(Defecto2Response value) {
        return new JAXBElement<Defecto2Response>(_Defecto2Response_QNAME, Defecto2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto3 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto3")
    public JAXBElement<Defecto3> createDefecto3(Defecto3 value) {
        return new JAXBElement<Defecto3>(_Defecto3_QNAME, Defecto3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto3Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto3Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto3Response")
    public JAXBElement<Defecto3Response> createDefecto3Response(Defecto3Response value) {
        return new JAXBElement<Defecto3Response>(_Defecto3Response_QNAME, Defecto3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto4 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto4 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto4")
    public JAXBElement<Defecto4> createDefecto4(Defecto4 value) {
        return new JAXBElement<Defecto4>(_Defecto4_QNAME, Defecto4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto4Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto4Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto4Response")
    public JAXBElement<Defecto4Response> createDefecto4Response(Defecto4Response value) {
        return new JAXBElement<Defecto4Response>(_Defecto4Response_QNAME, Defecto4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto5 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto5 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto5")
    public JAXBElement<Defecto5> createDefecto5(Defecto5 value) {
        return new JAXBElement<Defecto5>(_Defecto5_QNAME, Defecto5 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defecto5Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Defecto5Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Defecto5Response")
    public JAXBElement<Defecto5Response> createDefecto5Response(Defecto5Response value) {
        return new JAXBElement<Defecto5Response>(_Defecto5Response_QNAME, Defecto5Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LWSProcess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LWSProcess }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "LWSProcess")
    public JAXBElement<LWSProcess> createLWSProcess(LWSProcess value) {
        return new JAXBElement<LWSProcess>(_LWSProcess_QNAME, LWSProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LWSProcessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LWSProcessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "LWSProcessResponse")
    public JAXBElement<LWSProcessResponse> createLWSProcessResponse(LWSProcessResponse value) {
        return new JAXBElement<LWSProcessResponse>(_LWSProcessResponse_QNAME, LWSProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuenteDocX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuenteDocX }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Tama\u00f1oDeLaFuenteDocX")
    public JAXBElement<TamañoDeLaFuenteDocX> createTamañoDeLaFuenteDocX(TamañoDeLaFuenteDocX value) {
        return new JAXBElement<TamañoDeLaFuenteDocX>(_TamañoDeLaFuenteDocX_QNAME, TamañoDeLaFuenteDocX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuenteDocXResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuenteDocXResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Tama\u00f1oDeLaFuenteDocXResponse")
    public JAXBElement<TamañoDeLaFuenteDocXResponse> createTamañoDeLaFuenteDocXResponse(TamañoDeLaFuenteDocXResponse value) {
        return new JAXBElement<TamañoDeLaFuenteDocXResponse>(_TamañoDeLaFuenteDocXResponse_QNAME, TamañoDeLaFuenteDocXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuentePDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuentePDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Tama\u00f1oDeLaFuentePDF")
    public JAXBElement<TamañoDeLaFuentePDF> createTamañoDeLaFuentePDF(TamañoDeLaFuentePDF value) {
        return new JAXBElement<TamañoDeLaFuentePDF>(_TamañoDeLaFuentePDF_QNAME, TamañoDeLaFuentePDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuentePDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TamañoDeLaFuentePDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Tama\u00f1oDeLaFuentePDFResponse")
    public JAXBElement<TamañoDeLaFuentePDFResponse> createTamañoDeLaFuentePDFResponse(TamañoDeLaFuentePDFResponse value) {
        return new JAXBElement<TamañoDeLaFuentePDFResponse>(_TamañoDeLaFuentePDFResponse_QNAME, TamañoDeLaFuentePDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeLetraDocX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeLetraDocX }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "TipoDeLetraDocX")
    public JAXBElement<TipoDeLetraDocX> createTipoDeLetraDocX(TipoDeLetraDocX value) {
        return new JAXBElement<TipoDeLetraDocX>(_TipoDeLetraDocX_QNAME, TipoDeLetraDocX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeLetraDocXResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeLetraDocXResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "TipoDeLetraDocXResponse")
    public JAXBElement<TipoDeLetraDocXResponse> createTipoDeLetraDocXResponse(TipoDeLetraDocXResponse value) {
        return new JAXBElement<TipoDeLetraDocXResponse>(_TipoDeLetraDocXResponse_QNAME, TipoDeLetraDocXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeLetraPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeLetraPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "TipoDeLetraPDF")
    public JAXBElement<TipoDeLetraPDF> createTipoDeLetraPDF(TipoDeLetraPDF value) {
        return new JAXBElement<TipoDeLetraPDF>(_TipoDeLetraPDF_QNAME, TipoDeLetraPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeLetraPDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeLetraPDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "TipoDeLetraPDFResponse")
    public JAXBElement<TipoDeLetraPDFResponse> createTipoDeLetraPDFResponse(TipoDeLetraPDFResponse value) {
        return new JAXBElement<TipoDeLetraPDFResponse>(_TipoDeLetraPDFResponse_QNAME, TipoDeLetraPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Redeability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Redeability }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "redeability")
    public JAXBElement<Redeability> createRedeability(Redeability value) {
        return new JAXBElement<Redeability>(_Redeability_QNAME, Redeability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedeabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RedeabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "redeabilityResponse")
    public JAXBElement<RedeabilityResponse> createRedeabilityResponse(RedeabilityResponse value) {
        return new JAXBElement<RedeabilityResponse>(_RedeabilityResponse_QNAME, RedeabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usability }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "usability")
    public JAXBElement<Usability> createUsability(Usability value) {
        return new JAXBElement<Usability>(_Usability_QNAME, Usability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "usabilityResponse")
    public JAXBElement<UsabilityResponse> createUsabilityResponse(UsabilityResponse value) {
        return new JAXBElement<UsabilityResponse>(_UsabilityResponse_QNAME, UsabilityResponse.class, null, value);
    }

}
