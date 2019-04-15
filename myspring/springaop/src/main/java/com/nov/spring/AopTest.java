package com.nov.spring;

import com.nov.spring.AppConfig;
import com.nov.spring.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);

        indexService.query();

        System.out.println(indexService.getClass().getName());
    }
}
