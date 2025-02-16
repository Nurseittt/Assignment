package com.example.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Запускаем Spring-контекст
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем и используем бины
        MyService myService = context.getBean(MyService.class);
        MyRepository myRepository = context.getBean(MyRepository.class);

        myService.performService();
        System.out.println(myRepository.getData());
    }
}
