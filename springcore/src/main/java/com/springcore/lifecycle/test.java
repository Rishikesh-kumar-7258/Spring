package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		Samosa samosa1 = (Samosa) context.getBean("samosa1");
		
		System.out.println(samosa1);
		
		System.out.println("+++++++++++++");
		Pepsi pepsi1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(pepsi1);

		context.registerShutdownHook();
		
		
		Example eg1 = (Example)context.getBean("eg1");
		System.out.println(eg1);
		
	}

}
