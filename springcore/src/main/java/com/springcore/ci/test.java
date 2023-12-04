package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person1 = (Person) context.getBean("person1");
		
		Addition add1 = (Addition) context.getBean("add1");
		
//		System.out.println(person1);
		add1.doSum();

	}

}
