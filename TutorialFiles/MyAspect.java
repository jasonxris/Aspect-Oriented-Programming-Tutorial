import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    //These are pointcut definitions, we will go over these later

    /**
     * This is a pointcut that will only trigger when myMethod method executes
     */
    @Pointcut("execution(* adviceExample.MyClass.myMethod(..))")
    public void myMethodExecution(){}


    /**
     * This is a pointcut that will only trigger when the myMethodAround method executes
     */
    @Pointcut("execution(* adviceExample.MyClass.myMethodAround(..))")
    public void myMethodAroundExecution(){}


    /**
     * A Before advice that outputs a string and the method reference
     * @param joinPoint holds a reference of the method call
     */
    @Before("myMethodExecution()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("BeforeAdvice is running before " + joinPoint.toString());
    }
    

}
