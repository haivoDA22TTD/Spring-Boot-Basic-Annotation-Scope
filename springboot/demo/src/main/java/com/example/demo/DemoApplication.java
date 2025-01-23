package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // Khởi động Spring Boot application và lấy context của Spring
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        //Gọi bean thứ 1
        Sharingan sharingan1 = context.getBean(Sharingan.class);
        //Beans thứ 2
        Sharingan sharingan2 = context.getBean(Sharingan.class);
        // Hiển thị Bean này lên cửa sổ dòng lệnh (Terminal)
        System.out.println("------BEANS 1 ------" + Sharingan.class);
        // Hiển thị Bean thứ 2 khi dùng annotation @Scope
        System.out.println("------BEANS 2 ------" +Sharingan.class);
        // Hiển thị phương thức của Bean
        sharingan1.MangekyoSharingan();

        sharingan2.MangekyoSharingan();
    }

}