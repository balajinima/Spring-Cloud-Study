package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication //�������� @SpringBootApplication,@EnableDiscoveryClient,@EnableCircuitBreaker
@EnableZuulProxy //����Zuul
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
