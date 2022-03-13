package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog testDog = context.getBean("myPet", Dog.class);
        testDog.setName("Strelka");

        System.out.println(testDog == myDog);

        System.out.println("testDog = " + testDog.getName());
        System.out.println("myDog = " + myDog.getName());

        context.close();
    }
}
