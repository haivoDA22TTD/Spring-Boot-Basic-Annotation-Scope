package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // khởi động Spring Boot
          ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        // Gọi Bean thứ 1
            DarkMagician darkMagician1 = context.getBean(DarkMagician.class);
        // Gọi Bean thứ 2
            DarkMagician darkMagician2 = context.getBean(DarkMagician.class);
        // Hiển thị lên cửa sổ dòng lệnh Bean thứ 1
            System.out.println("Bean 1:" +darkMagician1);
        // Hiển thị lên cửa sổ dòng lệnh Bean thứ 2
            System.out.println("Bean 2:" +darkMagician2);
        // Hiển thị phương thức
            darkMagician1.Ultimate();
    }
}