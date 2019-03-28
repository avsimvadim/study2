package spring.testio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import spring.testio.dao.StudentDao;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
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

    @Override
    public Student register(Student newStudent) throws RegisterException {
        //validation
        return studentDao.create(newStudent);
    }

    @Override
    public List<Student> getAll(int start, int length) {
        return studentDao.getAll(start, length);
    }
}
