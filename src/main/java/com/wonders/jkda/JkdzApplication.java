package com.wonders.jkda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wonders.jkdz.dao")
public class JkdzApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkdzApplication.class, args);
    }

}
