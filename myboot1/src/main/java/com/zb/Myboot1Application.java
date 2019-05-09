package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/config/config.properties")
public class Myboot1Application {
    //测试
    public static void main(String[] args) {
        SpringApplication.run(Myboot1Application.class, args);
    }
}

