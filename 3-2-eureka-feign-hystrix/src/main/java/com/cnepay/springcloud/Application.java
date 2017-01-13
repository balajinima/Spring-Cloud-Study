package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //该注解添加发现服务能力
@EnableFeignClients //开启feign功能,feign中包含ribbon、hystrix
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
