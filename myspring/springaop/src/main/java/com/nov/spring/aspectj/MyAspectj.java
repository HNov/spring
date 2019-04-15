package com.nov.spring.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectj {


    @Pointcut("execution(* com.nov.spring.service.*.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before ********");
    }

}
