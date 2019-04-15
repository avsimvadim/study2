package spring.testio.soap.endpoint;

import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface StudentEndpoint {

    @WebMethod
    Student login(String login) throws NoStudentFoundEsception;

    @WebMethod
    Student getStudentInfo(int id) throws NoStudentFoundEsception;

    @WebMethod
    Student register(Student newStudent) throws RegisterException;

}
