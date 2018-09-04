package com.bf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot方式启动类
 *
 * @author hp
 * @Date 2017/5/21 12:06
 */
@SpringBootApplication
public class BfApplication {

    private final static Logger logger = LoggerFactory.getLogger(BfApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BfApplication.class, args);
        logger.info("Project start success!");
    }
}
