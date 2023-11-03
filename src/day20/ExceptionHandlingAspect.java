package day20;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class ExceptionHandlingAspect {

    @Around("execution(* day20.CallStackDemo4.div(..))")
    public Object aroundDivMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        int y = (Integer) args[1];
        if (y == 0) {
            throw new InvalidYArgException("分母不可 = 0");
        }
        return joinPoint.proceed(); // 繼續執行原方法
    }
}
