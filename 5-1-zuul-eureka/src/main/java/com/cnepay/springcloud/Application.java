package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication //它整合了 @SpringBootApplication,@EnableDiscoveryClient,@EnableCircuitBreaker
@EnableZuulProxy //开启Zuul
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
