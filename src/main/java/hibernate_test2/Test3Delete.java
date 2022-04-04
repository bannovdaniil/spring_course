package hibernate_test2;

import hibernate_test2.entity.Details;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3Delete {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {

            try (Session session = sessionFactory.getCurrentSession()) {

                session.beginTransaction();

                Employee employee = session.get(Employee.class, 1);
                session.delete(employee);

                session.getTransaction().commit();
                System.out.println("done");
            }

            //sessionFactory.close();
        }
    }
}
