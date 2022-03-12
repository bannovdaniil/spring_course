package spring_introduction;

public class Person {
    private Pet pet;
    private String sutName;
    private int age;

    public Person() {
        System.out.println("Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSutName() {
        return sutName;
    }

    public void setSutName(String sutName) {
        this.sutName = sutName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }
}
