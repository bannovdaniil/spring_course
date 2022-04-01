package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class CheckExceptionAspect {
    @Before("aop.aspects.MyPointCut.allGetMethod()")
    public void beforeCheckException(){
        System.out.println("Order(30) => beforeCheckException");
    }
}
