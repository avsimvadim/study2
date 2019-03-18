package ua.artcode.testio.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import ua.artcode.testio.service.StudentType;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Student extends IdAutoGeneratedEntity{

    @Column(name = "student_name",nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    private StudentType studentType;

    @Temporal(TemporalType.DATE)
    private Date birth;

    @Transient // no mapping
    private String tempAccess;

    public Student() {
    }

    public Student(String name, StudentType studentType, Date birth, String tempAccess) {
        this.name = name;
        this.studentType = studentType;
        this.birth = birth;
        this.tempAccess = tempAccess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTempAccess() {
        return tempAccess;
    }

    public void setTempAccess(String tempAccess) {
        this.tempAccess = tempAccess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", studentType=" + studentType +
                ", birth=" + birth +
                ", tempAccess='" + tempAccess + '\'' +
                '}';
    }

}