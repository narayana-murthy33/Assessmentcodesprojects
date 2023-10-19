package com.entity;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@ComponentScan(basePackages="com.entity")
public class Configuration {
	LocalSessionFactoryBean localSessionFactoryBean;
	@Bean(name="sessionFactory")
	 private LocalSessionFactoryBean getSessionFactory() {
		 LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		 sessionFactory.setDataSource(getDataSource());
		 sessionFactory.setPackagesToScan("com.entity");
		 sessionFactory.setHibernateProperties(getHibernateProperties());
		 return sessionFactory;
	 }
	 @Bean(name="datasource")
	 private DataSource getDataSource() {
		 DriverManagerDataSource dmds=new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUsername("root");
		 dmds.setPassword("nani12345");
		 dmds.setUrl("jdbc:mysql://localhost:3306/bvccollege");
		 return dmds;
	 }
	 private Properties getHibernateProperties() {
		 Properties prop=new Properties();
		 prop.put("hibernate.show_sql","true");
		 prop.put("hibernate.format_sql", "true");
		 prop.put("hibernate.dialect", "org.hibernate.dialect.MYSQL55Dialect");
		 return prop;
	 }

}
