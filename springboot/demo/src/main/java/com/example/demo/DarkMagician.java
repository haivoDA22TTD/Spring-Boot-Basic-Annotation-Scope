package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Sử dụng annotation @Component để đánh dấu class này là một bean cho Spring Boot quản lý
@Scope("prototype") // Sử dụng annotation @Scope với thuộc tính Prototype để tạo ra nhiều Bean từ một class
public class DarkMagician {
    // khai báo phương thức có tên là Ultimate
        public void Ultimate(){
    // Hiển thị dòng chữ Ultimate Magic lên cửa sổ dòng lệnh(Terminal)
            System.out.println("Ultimate Magic");
        }
}
