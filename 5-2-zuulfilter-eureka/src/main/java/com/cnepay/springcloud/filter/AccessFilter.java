package com.cnepay.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * ����һ��Zuul��������ʵ����������·��֮ǰ����������Ƿ���accessToken���������оͽ���·�ɣ���û�о;ܾ����ʣ�����401
 * Unauthorized����
 */
public class AccessFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		
		Object accessToken = request.getParameter("accessToken");
		if (accessToken == null) {
			log.warn("access token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			return null;
		}
		
		log.info("access token ok");
		return null;
	}
}



//�Զ����������ʵ�֣���Ҫ�̳�ZuulFilter����Ҫ��дʵ�������ĸ�������

//filterType������һ���ַ�����������������ͣ���zuul�ж��������ֲ�ͬ�������ڵĹ��������ͣ��������£�
//	pre������������·��֮ǰ����
//	routing����·������ʱ�򱻵���
//	post����routing��error������֮�󱻵���
//	error����������ʱ��������ʱ������
//filterOrder��ͨ��intֵ�������������ִ��˳��
//shouldFilter������һ��boolean�������жϸù������Ƿ�Ҫִ�У�����ͨ���˺�����ʵ�ֹ������Ŀ��ء��������У�����ֱ�ӷ���true�����Ըù�����������Ч��
//run���������ľ����߼�����Ҫע�⣬��������ͨ��ctx.setSendZuulResponse(false)��zuul���˸����󣬲��������·�ɣ�Ȼ��ͨ��ctx.setResponseStatusCode(401)�������䷵�صĴ����룬��Ȼ����Ҳ���Խ�һ���Ż����ǵķ��أ����磬ͨ��ctx.setResponseBody(body)�Է���body���ݽ��б༭�ȡ�


