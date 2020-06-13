package org.jxiao.vhrself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.jxiao.vhrself.mapper")
public class VhrselfApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrselfApplication.class, args);
    }

}
