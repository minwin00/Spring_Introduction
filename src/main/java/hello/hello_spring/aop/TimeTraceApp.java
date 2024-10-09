package hello.hello_spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceApp {

    @Around("execution( * hello.hello_spring..*(..))")
    public Object execute(ProceedingJoinPoint jointPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START: " + jointPoint.toString());
        try {
            return jointPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + jointPoint.toString() + " " + timeMs + "ms");
        }
    }
}
