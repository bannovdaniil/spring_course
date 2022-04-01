package aop;

import aop.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    List<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Ivanov Ivan", 5, 3.2));
        students.add(new Student("Smirnov Ivan", 4, 4.3));
        students.add(new Student("Sidorov Ivan", 3, 4.4));
    }

    public List<Student> getStudents() {
        System.out.println("getStudents: ");
        System.out.println("students = " + students);
        return students;
    }
}
