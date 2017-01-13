package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cnepay.springcloud.filter.AccessFilter;

@SpringCloudApplication // ÕûºÏ @SpringBootApplication, @EnableDiscoveryClient,
						// @EnableCircuitBreaker
@EnableZuulProxy // ¿ªÆôZuul
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
