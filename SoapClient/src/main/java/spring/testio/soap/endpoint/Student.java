
package spring.testio.soap.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoint.soap.testio.spring/}idAutoGeneratedEntity">
 *       &lt;sequence>
 *         &lt;element name="birth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentType" type="{http://endpoint.soap.testio.spring/}studentType" minOccurs="0"/>
 *         &lt;element name="tempAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "birth",
    "name",
    "studentType",
    "tempAccess"
})
public class Student
    extends IdAutoGeneratedEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birth;
    protected String name;
    @XmlSchemaType(name = "string")
    protected StudentType studentType;
    protected String tempAccess;

    /**
     * Gets the value of the birth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirth() {
        return birth;
    }

    /**
     * Sets the value of the birth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirth(XMLGregorianCalendar value) {
        this.birth = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the studentType property.
     * 
     * @return
     *     possible object is
     *     {@link StudentType }
     *     
     */
    public StudentType getStudentType() {
        return studentType;
    }

    /**
     * Sets the value of the studentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentType }
     *     
     */
    public void setStudentType(StudentType value) {
        this.studentType = value;
    }

    /**
     * Gets the value of the tempAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempAccess() {
        return tempAccess;
    }

    /**
     * Sets the value of the tempAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempAccess(String value) {
        this.tempAccess = value;
    }

}