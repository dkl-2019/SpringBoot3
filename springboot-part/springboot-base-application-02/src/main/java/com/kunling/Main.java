package com.kunling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 自己是一个配置类，加载其它启动器的配置类ioc，扫描当前启动类所在的包和子包的注解
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
