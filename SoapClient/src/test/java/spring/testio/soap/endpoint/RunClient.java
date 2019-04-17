package spring.testio.soap.endpoint;

public class RunClient {
    public static void main(String[] args) {
        StudentEndpoint studentEndpoint = new StudentEndpointImplService().getStudentEndpointImplPort();

        try {
            Student student = studentEndpoint.getStudentInfo(3);
            System.out.printf("id %s, name %s, type %s", student.getId(), student.getName(), student.getStudentType());
        } catch (NoStudentFoundEsception_Exception e) {
            e.printStackTrace();
        }
    }
}
