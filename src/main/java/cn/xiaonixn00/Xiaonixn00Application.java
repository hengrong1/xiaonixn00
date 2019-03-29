package cn.xiaonixn00;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("cn.xiaonixn00.dao")
public class Xiaonixn00Application {

    public static void main(String[] args) {
        SpringApplication.run(Xiaonixn00Application.class, args);
    }

}
