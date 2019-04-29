package com.elk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping("test")
    public void test(){
        logger.info("新增测试信息日志");
        logger.error("新增测试错误日志");
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
