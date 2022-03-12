package spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
