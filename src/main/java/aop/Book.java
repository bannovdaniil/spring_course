package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Java для начинающих")
    private String name;
    @Value("Шилдт")
    private String author;
    @Value("1995")
    private int yearOfPublishing;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
