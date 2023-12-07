package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started .....");
    	// spring jdbc template
    	
//    	ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
    	ApplicationContext con  =new AnnotationConfigApplicationContext(javaconfig.class);
    	StudentDao studentDao = con.getBean("studentDao", StudentDao.class);
    	
    	// insert logic
//    	Student student= new Student();
//    	student.setId(357);
//    	student.setName("Pratham");
////    	student.setCity("Delhi");
//    	
//    	int result = studentDao.insert(student);
//    	System.out.println("Student Added " + result);
    	
    	// update logic
//    	Student student = new Student();
//    	student.setId(357);
//    	student.setName("Pratham Kumar Rahi");
//    	student.setCity("Bihar");
//    	
//    	int result = studentDao.change(student);
//    	System.out.println("Data changed " + result);
    	
    	// delete logic
//    	Student student = new Student();
//    	student.setId(234);
//    	
//    	int result = studentDao.delete(student);
//    	System.out.println("Data deleted : " + result);
    	
    	
    	// Select single data 
//    	Student student = studentDao.getStudent(357);
//    	System.out.println(student);
    	
    	// Fetch all data
    	List<Student> students = studentDao.getAllStudents();
    	System.out.println(students);
    }
}
