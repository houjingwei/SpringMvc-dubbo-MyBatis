package com.dsp.user.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {
	
	
	@Pointcut("execution(* *.save*(..))")
    public void myMethod(){};

    /*@Before("execution(public void com.bjsxt.dao.impl.UserDAOImpl.save(com.bjsxt.model.User))")*/
    @Before("myMethod()")
    public void before() {
        System.out.println("method staet");
    } 
    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    } 
    
    @AfterReturning("myMethod()")
    public void AfterReturning() {
        System.out.println("method AfterReturning");
    } 
    @AfterThrowing("myMethod()")
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }
	
	

}
