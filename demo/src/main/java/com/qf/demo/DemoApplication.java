package com.qf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
<<<<<<< HEAD:demo/src/main/java/com/qf/demo/DemoApplication.java
@MapperScan("com.qf.demo.*.mapper*")
@EnableDiscoveryClient
=======
@MapperScan("com.baomidou.cloud.service.*.mapper*")
>>>>>>> origin/master:demo/src/main/java/com/qf/demo1/DemoApplication.java
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
