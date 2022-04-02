package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3AroundAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        System.out.println("Start - In main");
        System.out.println("universityLibrary.returnBook() = " + universityLibrary.returnBook());
        System.out.println("End - In main");
    }
}
