package spring.testio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.testio.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Student create(Student student) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            manager.persist(student);
            transaction.commit();
        } catch(Throwable e){
            transaction.rollback();
        } finally {
            manager.close();
        }
        return student;
    }

    @Override
    public Student remove(int id) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            Student forRemove = manager.find(Student.class, id);
            manager.remove(forRemove);
            transaction.commit();
            return forRemove;
        } catch(Throwable e){
            transaction.rollback();
        } finally {
            manager.close();
        }
        return null;
    }

    @Override
    public Student find(String login) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        return manager
                .createQuery("SELECT s FROM Student s WHERE s.name =: name", Student.class)
                .setParameter("name", login)
                .getSingleResult();
    }

    @Override
    public Student find(int id) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        return manager.find(Student.class, id);
    }

    @Override
    public List<Student> getAll(int start, int end) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        return manager
                .createQuery("SELECT s FROM Student s", Student.class)
                .setFirstResult(start)
                .setMaxResults(end)
                .getResultList();
    }
}
