package com.dubbo.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.HelloService;

public class consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();

		HelloService helloService = (HelloService) context.getBean("feedbackIndexService");
		String hello = helloService.sayHello("tom");
		System.out.println(hello);
		
		 helloService = (HelloService) context.getBean("memberIndexService");
		 hello = helloService.sayHello("tom");
		System.out.println(hello);
		System.in.read();
	}

}