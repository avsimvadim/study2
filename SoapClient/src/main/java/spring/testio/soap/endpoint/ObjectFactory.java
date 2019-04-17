
package spring.testio.soap.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the spring.testio.soap.endpoint package. 
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

    private final static QName _NoStudentFoundEsception_QNAME = new QName("http://endpoint.soap.testio.spring/", "NoStudentFoundEsception");
    private final static QName _RegisterException_QNAME = new QName("http://endpoint.soap.testio.spring/", "RegisterException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: spring.testio.soap.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoStudentFoundEsception }
     * 
     */
    public NoStudentFoundEsception createNoStudentFoundEsception() {
        return new NoStudentFoundEsception();
    }

    /**
     * Create an instance of {@link RegisterException }
     * 
     */
    public RegisterException createRegisterException() {
        return new RegisterException();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoStudentFoundEsception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.testio.spring/", name = "NoStudentFoundEsception")
    public JAXBElement<NoStudentFoundEsception> createNoStudentFoundEsception(NoStudentFoundEsception value) {
        return new JAXBElement<NoStudentFoundEsception>(_NoStudentFoundEsception_QNAME, NoStudentFoundEsception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.testio.spring/", name = "RegisterException")
    public JAXBElement<RegisterException> createRegisterException(RegisterException value) {
        return new JAXBElement<RegisterException>(_RegisterException_QNAME, RegisterException.class, null, value);
    }

}
