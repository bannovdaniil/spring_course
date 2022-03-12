package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }
}
