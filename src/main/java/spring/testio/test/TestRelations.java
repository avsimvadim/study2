package spring.testio.test;

import spring.testio.model.Course;
import spring.testio.model.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestRelations {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myunit");
        EntityManager manager = entityManagerFactory.createEntityManager();

        Course course1 = new Course("1", "desc");
        Course course2 = new Course("2", "desc");
        Course course3 = new Course("3", "desc");
        Course course4 = new Course("4", "desc");

        Teacher teacher1 = new Teacher("Ivan",5);
        Teacher teacher2 = new Teacher("Serhii",5);
        Teacher teacher3 = new Teacher("Valera",5);

        course1.setOwner(teacher1);
        course2.setOwner(teacher1);
        teacher1.getCourse().add(course1);
        teacher1.getCourse().add(course2);

        course3.setOwner(teacher2);
        teacher2.getCourse().add(course3);

        course4.setOwner(teacher3);
        teacher3.getCourse().add(course4);

        manager.getTransaction().begin();

        manager.persist(course1);
        manager.persist(course2);
        manager.persist(course3);
        manager.persist(course4);


        manager.persist(teacher1);
        manager.persist(teacher2);
        manager.persist(teacher3);
        manager.getTransaction().commit();


    }
}
