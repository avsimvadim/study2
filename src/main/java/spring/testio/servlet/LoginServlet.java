package spring.testio.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import spring.testio.exception.NoStudentFoundEsception;
import spring.testio.exception.RegisterException;
import spring.testio.model.Student;
import spring.testio.service.StudentService;
import spring.testio.service.StudentType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        try {
            Student found = studentService.login(name);
            HttpSession session = req.getSession(true);
            session.setAttribute("inSystem", true);
            session.setAttribute("currentUserName", found.getName());
            resp.sendRedirect("index.jsp");
        } catch (NoStudentFoundEsception noStudentFoundEsception) {
            req.setAttribute("errorTitle", "loginError");
            req.setAttribute("errorMessage", "invalid name");
            req.getRequestDispatcher("/WEB-ING/pages/error.jsp").forward(req,resp);
        }

    }
}
