//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.02 at 11:06:30 PM IST 
//


package com.techlords.infra.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="flow-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flow-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.techlords.com/crown-flow}flow-steps"/>
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
    "flowId",
    "flowClass",
    "flowSteps"
})
@XmlRootElement(name = "crown-flow")
public class CrownFlow {

    @XmlElement(name = "flow-id", required = true)
    protected String flowId;
    @XmlElement(name = "flow-class", required = true)
    protected String flowClass;
    @XmlElement(name = "flow-steps", required = true)
    protected FlowSteps flowSteps;

    /**
     * Gets the value of the flowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowId(String value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the flowClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowClass() {
        return flowClass;
    }

    /**
     * Sets the value of the flowClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowClass(String value) {
        this.flowClass = value;
    }

    /**
     * Gets the value of the flowSteps property.
     * 
     * @return
     *     possible object is
     *     {@link FlowSteps }
     *     
     */
    public FlowSteps getFlowSteps() {
        return flowSteps;
    }

    /**
     * Sets the value of the flowSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowSteps }
     *     
     */
    public void setFlowSteps(FlowSteps value) {
        this.flowSteps = value;
    }

}
