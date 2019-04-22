package spring.testio.soap.endpoint;

import spring.testio.dto.StudentDTO;
import spring.testio.dto.StudentList;
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
    StudentDTO login(String login) throws NoStudentFoundEsception;

    @WebMethod
    StudentDTO getStudentInfo(int id) throws NoStudentFoundEsception;

    @WebMethod
    StudentDTO register(StudentDTO newStudent) throws RegisterException;

    @WebMethod
    StudentList getAll(int start, int length);
}
