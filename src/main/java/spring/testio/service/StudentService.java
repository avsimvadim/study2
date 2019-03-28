package spring.testio.service;

import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;

import java.util.List;

public interface StudentService {
    Student login(String login) throws NoStudentFoundEsception;
    Student getStudentInfo(int id) throws NoStudentFoundEsception;
    Student register(Student newStudent) throws RegisterException;
    List<Student> getAll(int start, int length);

}
