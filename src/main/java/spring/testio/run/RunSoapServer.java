package spring.testio.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.testio.service.StudentService;
import spring.testio.soap.endpoint.StudentEndpointImpl;

import javax.xml.ws.Endpoint;

public class RunSoapServer {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("spring-context.xml");
        StudentService studentService = appCon.getBean(StudentService.class);
        Endpoint.publish("http://192.168.1.129:9999/soap/student", new StudentEndpointImpl(studentService));
    }
}
