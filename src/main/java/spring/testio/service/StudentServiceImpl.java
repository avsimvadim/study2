package spring.testio.service;

import spring.testio.dao.StudentDao;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.model.Student;

public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    @Override
    public Student login(String login) throws NoStudentFoundEsception {

        Student student = studentDao.find(login);

        if (student == null){
            throw new NoStudentFoundEsception("no student with login" + login);
        }

        return student;
    }

    @Override
    public Student getStudentInfo(int id) throws NoStudentFoundEsception {
        Student student = studentDao.find(id);
        if (student == null){
            throw new NoStudentFoundEsception("no student with login" + id);
        }
        return student;
    }
}
