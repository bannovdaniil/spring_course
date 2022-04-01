package aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class SchoolLibrary {
    public void getBook() {
        System.out.println("SchoolLibrary: Получить книгу");
    }

     public boolean returnBook() {
        System.out.println("SchoolLibrary: сдать книгу");
        return true;
    }

}
