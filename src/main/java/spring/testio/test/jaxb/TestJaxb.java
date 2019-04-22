package spring.testio.test.jaxb;

import spring.testio.dto.StudentDTO;
import spring.testio.dto.StudentList;
import spring.testio.service.StudentType;

import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

public class TestJaxb {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.setDtoList(Arrays.asList(new StudentDTO(312, "Dimitri", StudentType.JUNIOR),
                new StudentDTO(9200, "vanya", StudentType.MIDDLE)));

        Writer writer = new StringWriter();

        JAXB.marshal(studentList, writer);

        String res = writer.toString();

        System.out.println(res);

        StudentList unmarshaled = JAXB.unmarshal(new StringReader(res), StudentList.class);
    }
}
