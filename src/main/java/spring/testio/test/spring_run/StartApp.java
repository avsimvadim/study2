package spring.testio.test.spring_run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;
import spring.testio.service.StudentType;

import java.util.Date;
import java.util.List;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        StudentService studentService = context.getBean(StudentService.class);

        try {
            Student student = studentService.getStudentInfo(2);
            studentService.register(new Student("Bogdan", StudentType.SENIOR, new Date(), "234"));

            List<Student> studentList = studentService.getAll(0,100);
            studentList.stream().forEach(System.out::println);
            System.out.println(student);
        } catch (NoStudentFoundEsception e) {
            e.printStackTrace();
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }
}
