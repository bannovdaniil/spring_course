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

    public int returnBook() {
        System.out.println("UniversityLibrary: сдать книгу");
        return 1;
    }

    public void getMagazine(){
        System.out.println("UniversityLibrary: взять журнал");
    }

    public int returnMagazine() {
        System.out.println("UniversityLibrary: сдать журнал");
        return 1;
    }

}
