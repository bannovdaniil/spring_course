package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCut {
    @Pointcut("execution(public void abcadd*(..))")
    public void allAddMethod(){}
}
