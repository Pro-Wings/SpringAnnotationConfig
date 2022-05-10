package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        Student std = (Student) context.getBean("std");

        System.out.println(std);
        
        //Test commit test commit 2
    }
}
