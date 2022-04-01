package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LogAspect {
    @Before("aop.aspects.MyPointCut.allAddMethod()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignatureSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Order(10) => beforeGetBookAdvice: Логирование: Попытка добавить книгу.");
        System.out.println("methodSignatureSignature = " + methodSignatureSignature);
        System.out.println("methodSignatureSignature.getMethod() = " + methodSignatureSignature.getMethod());
        System.out.println("methodSignatureSignature.getReturnType() = " + methodSignatureSignature.getReturnType());
        System.out.println("methodSignatureSignature.getName() = " + methodSignatureSignature.getName());
        if("addBook".equals(methodSignatureSignature.getName())){
            for(var obj: joinPoint.getArgs()){
                if(obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("book.getName() = " + book.getName());
                    System.out.println("book.getAuthor() = " + book.getAuthor());
                    System.out.println("book.getYearOfPublishing() = " + book.getYearOfPublishing());
                }
                if (obj instanceof String){
                    System.out.println("Person_name = " + obj);
                }
            }
        }

    }
}
