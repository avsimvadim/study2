package spring.testio.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;
import spring.testio.service.StudentType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(RegisterServlet.class);

    private ApplicationContext applicationContext;
    private StudentService studentService;

    @Override
    public void init() throws ServletException {
        applicationContext =
                (ApplicationContext)getServletContext().getAttribute("spring-context");
        studentService = applicationContext.getBean(StudentService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //just redirect to register.jsp
        req.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //waiting data from form
        String name = req.getParameter("name");
        if (name == null){
            resp.sendRedirect("http/error.jsp");
        } else {
            Student student = new Student(name, StudentType.JUNIOR, new Date(), "");
            try {
                Student created  = studentService.register(student);
                req.setAttribute("student", created);
                req.getRequestDispatcher("/WEB-INF/pages/student-info.jsp").forward(req,resp);
            } catch (RegisterException e) {
                LOG.error(e);
            }
        }
    }

}
