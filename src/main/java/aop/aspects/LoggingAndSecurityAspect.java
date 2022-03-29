package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(public void get*(*))")
    private void allGetMethod(){}

    @Before("allGetMethod()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу.");
    }

    @Before("allGetMethod()")
    public void beforeGetBookSecurity() {
        System.out.println("beforeGetBookSecurity: Проверка прав доступа.");
    }

}
