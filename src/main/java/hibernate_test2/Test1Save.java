package hibernate_test2;

import hibernate_test2.entity.Details;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1Save {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {

            try (Session session = sessionFactory.getCurrentSession()) {
//                Employee employee = new Employee("Nikolaev", "Nikolay", "IT", 1000);
//                Details detail = new Details("Moskow", "+7(818)2899", "nikola@mail.ru");

                Employee employee = new Employee("Bannov", "Daniil", "IT", 1200);
                Details detail = new Details("Tambov", "+7(999)2899", "baddan@mail.ru");

                employee.setEmpDetails(detail);

                session.beginTransaction();
                session.save(employee);
                session.getTransaction().commit();
                System.out.println("done");
            }

            //sessionFactory.close();
        }
    }
}
