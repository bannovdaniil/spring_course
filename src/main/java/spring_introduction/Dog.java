package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Create bean dog...");
    }

    @Override
    public void say() {
        System.out.println("Wow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
