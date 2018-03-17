package org.hengsir.icma;

import org.hengsir.icma.utils.pageHelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @author hengsir
 * @date 2018/3/1 下午3:22
 */
@SpringBootApplication
@MapperScan("org.hengsir.icma.dao.mapper")
//@ComponentScan(basePackages = {"org.hengsir.icma","org.springframework.boot.autoconfigure.validation"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("-----------------嘤嘤嘤嘤嘤~~~~启动成功！！！！！------------------" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }

}
