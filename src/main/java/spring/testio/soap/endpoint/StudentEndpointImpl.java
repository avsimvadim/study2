package spring.testio.soap.endpoint;

import spring.testio.dto.StudentDTO;
import spring.testio.dto.StudentList;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;

import javax.jws.WebService;
import java.util.ArrayList;
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
    public StudentDTO login(String login) throws NoStudentFoundEsception {
        Student student = studentService.login(login);
        return new StudentDTO(student.getId(), student.getName(), student.getStudentType());
    }

    @Override
    public StudentDTO getStudentInfo(int id) throws NoStudentFoundEsception {
        Student student = studentService.getStudentInfo(id);
        return new StudentDTO(student.getId(), student.getName(), student.getStudentType());
    }

    @Override
    public StudentDTO register(StudentDTO newStudent) throws RegisterException {
        Student student = studentService.register(new Student(newStudent.getName(), newStudent.getStudentType(), null, null));
        return new StudentDTO(student.getId(), student.getName(), student.getStudentType());
    }

    @Override
    public StudentList getAll(int start, int length) {
        StudentList studentList = new StudentList();
        List<Student> students = studentService.getAll(start, length);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student: students){
            studentDTOS.add(new StudentDTO(student.getId(), student.getName(), student.getStudentType()));
        }
        studentList.setDtoList(studentDTOS);

        return studentList;
    }

}
