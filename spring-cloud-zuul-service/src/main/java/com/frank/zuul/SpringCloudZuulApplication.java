package com.frank.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xiong.canwei
 * @date 2022年07月22日 13:35
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class,args);
    }
}
