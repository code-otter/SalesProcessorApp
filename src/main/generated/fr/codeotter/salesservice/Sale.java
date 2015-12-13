
package fr.codeotter.salesservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="article_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sale", propOrder = {
    "id",
    "articleId",
    "customerName"
})
public class Sale {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(name = "article_id", required = true)
    protected String articleId;
    @XmlElement(name = "customer_name", required = true)
    protected String customerName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the articleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * Sets the value of the articleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleId(String value) {
        this.articleId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

}
