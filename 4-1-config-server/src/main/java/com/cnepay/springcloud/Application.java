package com.cnepay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //���� Config Server
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//�鿴����
//127.0.0.1:4001/foo/default/
//127.0.0.1:4001/foo/development/
