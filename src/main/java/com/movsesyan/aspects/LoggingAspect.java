package com.movsesyan.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try take a book ");
    }


    @After("execution(public void getBook())")
    public void afterGetBook(){
        System.out.println("afterGetBookAdvice: the book is take ");
    }



}
