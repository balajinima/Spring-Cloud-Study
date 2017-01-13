package com.cnepay.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
//通过Spring MVC的注解来配置compute-service服务下的具体实现。

@FeignClient("compute-service")
public interface ComputeClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}

//通过Feign以接口和注解配置的方式，轻松实现对compute-service服务的绑定，
//这样我们就可以在本地应用中像本地服务一样的调用它，并且做到了客户端均衡负载。