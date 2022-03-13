package spring_introduction;

public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Create bean dog...");
    }

    @Override
    public void say() {
        System.out.println("Wow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
