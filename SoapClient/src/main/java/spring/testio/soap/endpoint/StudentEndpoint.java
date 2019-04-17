
package spring.testio.soap.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentEndpoint", targetNamespace = "http://endpoint.soap.testio.spring/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentEndpoint {


    /**
     * 
     * @param arg0
     * @return
     *     returns spring.testio.soap.endpoint.Student
     * @throws RegisterException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://endpoint.soap.testio.spring/StudentEndpoint/registerRequest", output = "http://endpoint.soap.testio.spring/StudentEndpoint/registerResponse", fault = {
        @FaultAction(className = RegisterException_Exception.class, value = "http://endpoint.soap.testio.spring/StudentEndpoint/register/Fault/RegisterException")
    })
    public Student register(
        @WebParam(name = "arg0", partName = "arg0")
        Student arg0)
        throws RegisterException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns spring.testio.soap.endpoint.Student
     * @throws NoStudentFoundEsception_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://endpoint.soap.testio.spring/StudentEndpoint/getStudentInfoRequest", output = "http://endpoint.soap.testio.spring/StudentEndpoint/getStudentInfoResponse", fault = {
        @FaultAction(className = NoStudentFoundEsception_Exception.class, value = "http://endpoint.soap.testio.spring/StudentEndpoint/getStudentInfo/Fault/NoStudentFoundEsception")
    })
    public Student getStudentInfo(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0)
        throws NoStudentFoundEsception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns spring.testio.soap.endpoint.Student
     * @throws NoStudentFoundEsception_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://endpoint.soap.testio.spring/StudentEndpoint/loginRequest", output = "http://endpoint.soap.testio.spring/StudentEndpoint/loginResponse", fault = {
        @FaultAction(className = NoStudentFoundEsception_Exception.class, value = "http://endpoint.soap.testio.spring/StudentEndpoint/login/Fault/NoStudentFoundEsception")
    })
    public Student login(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws NoStudentFoundEsception_Exception
    ;

}