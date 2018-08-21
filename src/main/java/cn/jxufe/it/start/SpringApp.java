package cn.jxufe.it.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
@MapperScan("cn.jxufe.it.mapper")
@ComponentScan({"com.fc","cn.jxufe.it.services","cn.jxufe.it.controller"})
public class SpringApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
