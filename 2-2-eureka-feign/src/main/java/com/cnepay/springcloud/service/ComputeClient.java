package com.cnepay.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//ʹ��@FeignClient("compute-service")ע�����󶨸ýӿڶ�Ӧcompute-service����
//ͨ��Spring MVC��ע��������compute-service�����µľ���ʵ�֡�

@FeignClient("compute-service")
public interface ComputeClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}

//ͨ��Feign�Խӿں�ע�����õķ�ʽ������ʵ�ֶ�compute-service����İ󶨣�
//�������ǾͿ����ڱ���Ӧ�����񱾵ط���һ���ĵ����������������˿ͻ��˾��⸺�ء�