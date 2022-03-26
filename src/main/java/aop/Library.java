package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("libraryBean")
@EnableAspectJAutoProxy
public class Library {
    public void getBook() {
        System.out.println("Получить книгу");
    }
}
