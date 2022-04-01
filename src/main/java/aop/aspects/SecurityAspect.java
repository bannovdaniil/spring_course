package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("aop.aspects.MyPointCut.allAddMethod()")
    public void beforeAddBookSecurity() {
        System.out.println("Order(20) => beforeGetBookSecurity: Security. Проверка прав доступа.");
    }
}
