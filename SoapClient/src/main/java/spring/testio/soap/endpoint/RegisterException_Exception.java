
package spring.testio.soap.endpoint;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RegisterException", targetNamespace = "http://endpoint.soap.testio.spring/")
public class RegisterException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RegisterException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RegisterException_Exception(String message, RegisterException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RegisterException_Exception(String message, RegisterException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: spring.testio.soap.endpoint.RegisterException
     */
    public RegisterException getFaultInfo() {
        return faultInfo;
    }

}