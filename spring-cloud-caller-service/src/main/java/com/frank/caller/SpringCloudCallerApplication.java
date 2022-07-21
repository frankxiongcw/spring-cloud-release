package com.frank.caller;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients  // 开启Feign客户端
@SpringCloudApplication
public class SpringCloudCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCallerApplication.class, args);
    }

}
