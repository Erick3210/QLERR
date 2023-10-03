
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LWSProcess complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LWSProcess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WSDLurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LWSProcess", propOrder = {
    "wsdLurl"
})
public class LWSProcess {

    @XmlElement(name = "WSDLurl")
    protected String wsdLurl;

    /**
     * Obtiene el valor de la propiedad wsdLurl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLurl() {
        return wsdLurl;
    }

    /**
     * Define el valor de la propiedad wsdLurl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLurl(String value) {
        this.wsdLurl = value;
    }

}
