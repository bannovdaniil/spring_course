package aop.aspects;

import aop.MyConfig;
import aop.Student;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2AfterReturning {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> studentList = university.getStudents();
        System.out.println("studentList = " + studentList);

        context.close();
    }
}
