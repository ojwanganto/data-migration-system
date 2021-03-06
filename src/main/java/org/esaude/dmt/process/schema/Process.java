//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 10:21:15 AM CAT 
//


package org.esaude.dmt.process.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="last_stop_point" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="last_stop_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="last_stop_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastStopPoint",
    "lastStopDate",
    "lastStopStatus"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "last_stop_point", required = true)
    protected BigInteger lastStopPoint;
    @XmlElement(name = "last_stop_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStopDate;
    @XmlElement(name = "last_stop_status", required = true)
    protected String lastStopStatus;

    /**
     * Gets the value of the lastStopPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastStopPoint() {
        return lastStopPoint;
    }

    /**
     * Sets the value of the lastStopPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastStopPoint(BigInteger value) {
        this.lastStopPoint = value;
    }

    /**
     * Gets the value of the lastStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStopDate() {
        return lastStopDate;
    }

    /**
     * Sets the value of the lastStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStopDate(XMLGregorianCalendar value) {
        this.lastStopDate = value;
    }

    /**
     * Gets the value of the lastStopStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStopStatus() {
        return lastStopStatus;
    }

    /**
     * Sets the value of the lastStopStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStopStatus(String value) {
        this.lastStopStatus = value;
    }

}
