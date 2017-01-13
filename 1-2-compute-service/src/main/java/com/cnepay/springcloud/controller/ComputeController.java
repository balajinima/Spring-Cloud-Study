package com.cnepay.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DiscoveryClient client;// 通过DiscoveryClient对象，在日志中打印出服务实例的相关内容。

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {

		ServiceInstance instance = client.getLocalServiceInstance();
		Integer r = a + b;
		logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);

		return r;
	}

	@RequestMapping(value = "/minus", method = RequestMethod.GET)
	public Integer minus(@RequestParam Integer a, @RequestParam Integer b) {

		Integer r = a - b;
		logger.info("/minus result:" + r);
		return r;
	}

}