package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/autowireconfig.xml");

		Employee emp1 = (Employee) context.getBean("employee1", Employee.class);

		System.out.println(emp1);
	}
}
