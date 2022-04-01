
package com.mycompany.project.plexus.cxf.contractfirst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="API-URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestOrder", propOrder = {
    "apiurl"
})
public class TestOrder {

    @XmlElement(name = "API-URL", required = true)
    protected String apiurl;

    /**
     * Gets the value of the apiurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIURL() {
        return apiurl;
    }

    /**
     * Sets the value of the apiurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIURL(String value) {
        this.apiurl = value;
    }

}
