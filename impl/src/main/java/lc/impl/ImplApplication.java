package lc.impl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("lc.impl.student")
@MapperScan(value = "lc.dao.student")
public class ImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImplApplication.class, args);
    }

}
