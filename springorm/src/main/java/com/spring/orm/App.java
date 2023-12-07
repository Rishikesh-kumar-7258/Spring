package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student(3958, "Rishikesh Kumar", "Bihar");
        int r = studentDao.insert(student);
        System.out.println("Done : " + r);
    }
}
