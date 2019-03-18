package spring.testio.service;

import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.model.Student;

public interface StudentService {
    Student login(String login) throws NoStudentFoundEsception;
    Student getStudentInfo(int id) throws NoStudentFoundEsception;

}
