package com.spring.orm;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.spring.orm.dao"})
public class javaConfig {

	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate template =  new HibernateTemplate(sessionFactory());
		return template;
	}

	@Bean(name = { "factory" })
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBean session = new LocalSessionFactoryBean();

		session.setDataSource(getDataSource());
		session.setPackagesToScan("com.spring.orm.entities");
		session.setHibernateProperties(hibernateProperties());
		try {
			session.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session.getObject();
	}

	
	@Bean(name={"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Tulsi@131");
		
		return ds;
	}
	

	
	@Bean
    public Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.hbm2dll.auto", "update");
        return properties;
    }
	
	@Bean(name= {"transactionManager"})
	public HibernateTransactionManager getTransactionManager() {
		
		return new HibernateTransactionManager(sessionFactory());
	}

}
