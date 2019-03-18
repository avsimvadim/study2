package spring.testio.dao;

import spring.testio.model.Student;

import java.util.List;

public interface StudentDao {

    Student create(Student student);

    Student remove(int id);

    Student find(String login);

    Student find(int id);

    List<Student> getAll(int start, int end);

}
