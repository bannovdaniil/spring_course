package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4Update {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            String name = employee.getName();
            employee.setName(employee.getSurname());
            employee.setSurname(name);

            session.createQuery("update Employee set salary = 1234" +
                            "where name='Egor'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("done");
        }

        sessionFactory.close();
    }
}
