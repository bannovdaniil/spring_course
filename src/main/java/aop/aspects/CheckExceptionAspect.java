package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class CheckExceptionAspect {
    @Before("aop.aspects.MyPointCut.allAddMethod()")
    public void beforeAddCheckException(){
        System.out.println("Order(30) => beforeCheckException");
    }
}
