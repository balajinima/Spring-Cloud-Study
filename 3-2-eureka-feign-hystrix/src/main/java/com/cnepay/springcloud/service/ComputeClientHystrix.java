package com.cnepay.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


//�����ص���ComputeClientHystrix��ʵ��@FeignClient�Ľӿڣ�
//��ʱʵ�ֵķ������Ƕ�Ӧ@FeignClient�ӿ���ӳ���fallback������
@Component
public class ComputeClientHystrix implements ComputeClient {
	
	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return -9999;
	}
}