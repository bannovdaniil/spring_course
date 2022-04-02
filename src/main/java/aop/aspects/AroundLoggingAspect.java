package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspect {
    @Around("execution(* aop.UniversityLibrary.returnBook())")
    public Object aroundReturnBookAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAspect - start");

        long timeBegin = System.currentTimeMillis();
        Object proceedingMethodResult = null;

        try {
            proceedingJoinPoint.proceed();
        } catch (Exception err) {
            System.out.println("aroundReturnBookAspect: Логируем исключение - " + err);
            throw err;
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("aroundReturnBookAspect - end");
        System.out.println("Execution time = " + (timeEnd - timeBegin) + " ms");

        return proceedingMethodResult;
    }
}
