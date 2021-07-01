package com.pro.wings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.pro.wings")
public class MyAppConfig {

    @Bean
    public Student getStudentBean() {
        return new Student("Ram");
    }

    @Bean
    @Primary
    public Student getStudentBean1() {
        return new Student("Sham");
    }
}
