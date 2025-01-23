package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

    // Đánh dấu class này là một bean bằng cách sử dụng @Component
@Component
    // Sử dụng annotation @Scope để mỗi lần yêu cầu bean sẽ tạo ra một instance mới
@Scope("prototype")
public class Sharingan implements Dojutsu{
    // Sử dụng annotation @Override để cho biết class này ghi đè thuộc tính của class khác
@Override
    // Phương thức này in ra dòng chữ Internal MangenkyoSharingan trên cửa sổ dòng lệnh(Terminal)
    public void MangekyoSharingan(){
        System.out.println("Internal MangekyoSharingan");
    }
}
