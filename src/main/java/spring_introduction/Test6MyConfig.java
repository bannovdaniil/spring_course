package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6MyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println("person.getSurName() = " + person.getSurName());
        System.out.println("person.getAge() = " + person.getAge());
        context.close();
    }
}
