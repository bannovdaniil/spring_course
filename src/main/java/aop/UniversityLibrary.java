package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class UniversityLibrary {
    public void getBook() {
        System.out.println("Получить книгу");
    }

    public int returnBook() {
        System.out.println("SchoolLibrary: сдать книгу");
        return 1;
    }

}
