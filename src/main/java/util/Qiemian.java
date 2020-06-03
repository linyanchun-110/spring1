package util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Qiemian {
    public Qiemian(){

    }
    @Pointcut("execution(**concert.service.impl.Ifly(..))")
    public void fly(){

    }
    @Before("fly()")
    public void qifei(){
        System.out.println("准备起飞");
    }
}
