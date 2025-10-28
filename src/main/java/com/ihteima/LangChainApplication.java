package com.ihteima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.ihteima.domain.mapper")
public class LangChainApplication {
    public static void main(String[] args) {
        SpringApplication.run(LangChainApplication.class, args);
    }
}
