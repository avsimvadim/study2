package spring.testio.soap.endpoint;

public class RunClient2 {
    public static void main(String[] args) {
        StudentEndpoint studentEndpoint =
                new StudentEndpointImplService().getStudentEndpointImplPort();
        StudentList studentList = studentEndpoint.getAll(0,100);

        studentList.getStudents().stream()
                .forEach((s) -> System.out.printf("%d, %s, %s\n", s.getId(), s.getName(), s.getStudentType()));
    }
}
