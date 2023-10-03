
package servicios_estadisticos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalcularCorrelacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalcularCorrelacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conjunto1" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="conjunto2" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcularCorrelacion", propOrder = {
    "conjunto1",
    "conjunto2"
})
public class CalcularCorrelacion {

    @XmlElement(nillable = true)
    protected List<Double> conjunto1;
    @XmlElement(nillable = true)
    protected List<Double> conjunto2;

    /**
     * Gets the value of the conjunto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjunto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConjunto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getConjunto1() {
        if (conjunto1 == null) {
            conjunto1 = new ArrayList<Double>();
        }
        return this.conjunto1;
    }

    /**
     * Gets the value of the conjunto2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjunto2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConjunto2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getConjunto2() {
        if (conjunto2 == null) {
            conjunto2 = new ArrayList<Double>();
        }
        return this.conjunto2;
    }

}
