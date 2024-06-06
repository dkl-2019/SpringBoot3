package com.kunling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * 1. 配置类 @SpringBootConfiguration
 * 2. 自动加载配置 @EnableAutoConfiguration 自动加载其它配置类
 * 3. @ComponentScan 默认是当前类所在的包，以及子包的注解
 */
@SpringBootApplication  // 启动类
public class Main {

    public static void main(String[] args) {
        // 创建ioca容器，加载配置；   启动内置的web服务器
        SpringApplication.run(Main.class, args); //自动创建ioc容器，启动tomcat服务软件
    }

    @Bean
    public Object object() {
        return new Object();
    }
}










