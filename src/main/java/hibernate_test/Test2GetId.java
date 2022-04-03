package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2GetId {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            Employee employee = new Employee("Egor", "Petrov", "IT", 1200);
            session.beginTransaction();
            session.save(employee);

            int employeeID = employee.getId();
            Employee employeeFromDB = session.get(Employee.class, employeeID);

            System.out.println(employeeFromDB);

            session.getTransaction().commit();
            System.out.println("done");
        }

        sessionFactory.close();
    }
}
