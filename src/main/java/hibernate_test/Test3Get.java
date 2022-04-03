package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3Get {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

            List<Employee> employeeList = session.createQuery("from Employee ")
                    .getResultList();
            employeeList.forEach(System.out::println);

            employeeList = session.createQuery("from Employee " +
                            "where name='Egor' OR salary > 1000")
                    .getResultList();
            employeeList.forEach(System.out::println);

            session.getTransaction().commit();
            System.out.println("done");
        }

        sessionFactory.close();
    }
}
