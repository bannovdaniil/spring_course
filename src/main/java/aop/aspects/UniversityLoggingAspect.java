package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логирование перед.");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
        System.out.println("afterGetStudentsLoggingAdvice: логирование после.");
        Student student = students.get(0);
        student.setSurName("Mr." + student.getSurName());
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAdvice: " + exception);
    }
}
