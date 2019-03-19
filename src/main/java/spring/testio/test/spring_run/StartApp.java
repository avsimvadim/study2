package spring.testio.test.spring_run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.model.Student;
import spring.testio.service.StudentService;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        StudentService studentService = context.getBean(StudentService.class);

        try {
            Student student = studentService.getStudentInfo(2);
            System.out.println(student);
        } catch (NoStudentFoundEsception e) {
            e.printStackTrace();
        }
    }
}
