//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.02 at 11:06:30 PM IST 
//


package com.techlords.infra.config;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="step-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="step-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="step-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="first-step" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="next-step-id" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
    "stepId",
    "stepName",
    "stepDescription",
    "firstStep",
    "nextSteps"
})
@XmlRootElement(name = "step")
public class Step {

    @XmlElement(name = "step-id")
    protected int stepId;
    @XmlElement(name = "step-name", required = true)
    protected String stepName;
    @XmlElement(name = "step-description", required = true)
    protected String stepDescription;
    @XmlElement(name = "first-step")
    protected Boolean firstStep;
    @XmlElement(name = "next-step-id", type = Integer.class)
    protected List<Integer> nextSteps;

    /**
     * Gets the value of the stepId property.
     * 
     */
    public int getStepId() {
        return stepId;
    }

    /**
     * Sets the value of the stepId property.
     * 
     */
    public void setStepId(int value) {
        this.stepId = value;
    }

    /**
     * Gets the value of the stepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * Sets the value of the stepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepName(String value) {
        this.stepName = value;
    }

    /**
     * Gets the value of the stepDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepDescription() {
        return stepDescription;
    }

    /**
     * Sets the value of the stepDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepDescription(String value) {
        this.stepDescription = value;
    }

    /**
     * Gets the value of the firstStep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstStep() {
        return firstStep;
    }

    /**
     * Sets the value of the firstStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstStep(Boolean value) {
        this.firstStep = value;
    }

    /**
     * Gets the value of the nextStepId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextStepId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextStepId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getNextSteps() {
        if (nextSteps == null) {
            nextSteps = new ArrayList<Integer>();
        }
        return this.nextSteps;
    }

}
