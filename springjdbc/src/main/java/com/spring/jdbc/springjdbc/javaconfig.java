package com.spring.jdbc.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.springjdbc.dao"})
public class javaconfig {
	
	@Bean(name={"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Tulsi@131");
		
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean(name={"studentDao"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getJdbcTemplate());
//		return studentDao;
//		
//	}

}
