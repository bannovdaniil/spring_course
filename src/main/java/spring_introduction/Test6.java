package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Анотации, для получения контехта
 */
public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        Pet dog = context.getBean("dog", Dog.class);
        dog.say();

        context.close();
    }

}
