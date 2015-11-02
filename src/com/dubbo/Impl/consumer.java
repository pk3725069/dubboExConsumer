package com.dubbo.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.CallbackListener;
import com.dubbo.CallbackService;


public class consumer {
	static int time=0;
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });


        context.start();
        CallbackService callbackService = (CallbackService) context.getBean("callbackService");
        callbackService.addListener( new CallbackListener() {
            public void changed(String msg) {
            	time++;
                System.out.println("callback:"+time + msg);
            }
        }, "foo.bar");
       

        
        System.in.read();
	}

}