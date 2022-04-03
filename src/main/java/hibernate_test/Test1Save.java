package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1Save {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            Employee employee = new Employee("Bannov", "Daniil", "IT", 2000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }

        sessionFactory.close();
    }
}
