package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LogAspect {
    @Before("aop.aspects.MyPointCut.allGetMethod()")
    public void beforeGetBookAdvice() {
        System.out.println("Order(10) => beforeGetBookAdvice: Логирование: Попытка получить книгу.");
    }
}
