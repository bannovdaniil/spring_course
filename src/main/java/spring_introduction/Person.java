package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    // @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surName;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
//    @Qualifier(value = "catBean")
//    public void setPet(Pet pet) {
//        System.out.println("Class person: set pet");
//        this.pet = pet;
//    }
}
