package spring.testio.soap.endpoint;

import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "spring.testio.soap.endpoint.StudentEndpoint")
public class StudentEndpointImpl implements StudentEndpoint {

    private StudentService studentService;

    public StudentEndpointImpl() {
    }

    public StudentEndpointImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student login(String login) throws NoStudentFoundEsception {
        return studentService.login(login);
    }

    @Override
    public Student getStudentInfo(int id) throws NoStudentFoundEsception {
        return studentService.getStudentInfo(id);
    }

    @Override
    public Student register(Student newStudent) throws RegisterException {
        return studentService.register(newStudent);
    }

}
