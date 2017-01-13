package com.cnepay.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestController {

	@Value("${foo}")
	private String foo;

	@RequestMapping("/foo")
	public String from() {
		return this.foo;
	}
}
