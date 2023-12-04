package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext con = 
				new AnnotationConfigApplicationContext(javaconfig.class);

		Student student = con.getBean("getStudent", Student.class);
		System.out.println(student);
		student.study();

	}

}
