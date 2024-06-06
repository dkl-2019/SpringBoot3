package com.kunling.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 *  读取配置的方式1：@Value 针对属性
 */
@Data   // 自动生成 getter setter等方法
@Component
@ConfigurationProperties(prefix = "zwf.user")
public class User {

//    @Value("${zwf.user.username}")
    private String username;
//    @Value("${zwf.user.password}")
    private String password;
//    @Value("${zwf.user.gfs}")
    private List<String> gfs;

}
