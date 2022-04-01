package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* aop.UniversityLibrary.get*(..))")
    private void allGetMethodUniversityLibrary() {
    }

    @Pointcut("execution(* aop.UniversityLibrary.return*(..))")
    private void allReturnMethodUniversityLibrary() {
    }

    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
    private void returnMagazineUniversityLibrary() {
    }

    @Pointcut("allGetMethodUniversityLibrary() || allReturnMethodUniversityLibrary()")
    private void allGetAndReturnMethodUniversityLibrary() {
    }

    @Pointcut("allGetAndReturnMethodUniversityLibrary() && !returnMagazineUniversityLibrary()")
    private void allGetAndReturnMethodExcludeReturnMagazineUniversityLibrary() {
    }

    @Before("allGetMethodUniversityLibrary()")
    public void beforeAllGetMethodUniversityLibrary() {
        System.out.println("beforeAllGetMethodUniversityLibrary");
    }

    @Before("allReturnMethodUniversityLibrary()")
    public void beforeAllReturnMethodUniversityLibrary() {
        System.out.println("beforeAllReturnMethodUniversityLibrary");
    }

    @Before("allGetAndReturnMethodUniversityLibrary()")
    public void BeforeAllGetAndReturnMethodUniversityLibrary() {
        System.out.println("allGetAndReturnMethodUniversityLibrary");
    }

    @Before("allGetAndReturnMethodExcludeReturnMagazineUniversityLibrary()")
    public void beforeAllGetAndReturnMethodExcludeReturnMagazineUniversityLibrary() {
        System.out.println("allGetAndReturnMethodExcludeReturnMagazineUniversityLibrary<==");
    }

//    @Pointcut("execution(public void get*(*))")
//    private void allGetMethod(){}
//
//    @Before("allGetMethod()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу.");
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetBookSecurity() {
//        System.out.println("beforeGetBookSecurity: Проверка прав доступа.");
//    }

}
