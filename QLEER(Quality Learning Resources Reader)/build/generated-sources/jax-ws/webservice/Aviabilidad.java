
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Aviabilidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Aviabilidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aviabilidad", propOrder = {
    "n1"
})
public class Aviabilidad {

    protected String n1;

    /**
     * Obtiene el valor de la propiedad n1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN1() {
        return n1;
    }

    /**
     * Define el valor de la propiedad n1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN1(String value) {
        this.n1 = value;
    }

}
