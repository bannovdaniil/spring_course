package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class UniversityLibrary {
    public void getBook(Book book) {
        System.out.println("UniversityLibrary: Получить книгу: " + book.getName());
    }

    public void addBook(String person_name, Book book) {
        System.out.println("UniversityLibrary: Добавить книгу:");
        System.out.println("-".repeat(20));
        System.out.println("person_name = " + person_name);

        System.out.println("book.getName() = " + book.getName());
        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book.getYearOfPublishing() = " + book.getYearOfPublishing());
    }

    public void addMagazine() {
        System.out.println("UniversityLibrary: добавить журнал");
        System.out.println("-".repeat(20));
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("UniversityLibrary: сдать книгу");
        return "Java For Dummies";
    }

    public void getMagazine() {
        System.out.println("UniversityLibrary: взять журнал");
        System.out.println("-".repeat(20));
    }

    public int returnMagazine() {
        System.out.println("UniversityLibrary: сдать журнал");
        System.out.println("-".repeat(20));
        return 1;
    }

}
