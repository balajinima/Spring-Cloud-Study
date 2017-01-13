package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //��ע����ӷ��ַ�������
@EnableFeignClients //����feign����,feign�а���ribbon��hystrix
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
