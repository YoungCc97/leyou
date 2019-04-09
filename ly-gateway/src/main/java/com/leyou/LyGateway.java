package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Young
 * @date 2019/3/26 17:55
 * @description：网关启动器
 */
@EnableZuulProxy
@SpringCloudApplication
public class LyGateway {
    public static void main(String[] args){
        SpringApplication.run(LyGateway.class);
    }
}
