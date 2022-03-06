package com.think.Configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@ComponentScan("com.think")
@EnableTransactionManagement
@Configuration
@PropertySource("classpath:application.properties")
@EnableWebMvc
public class SpringConfiguration {

	@Autowired
	private Environment environment;
	
	@Bean
	public BCryptPasswordEncoder passEncoder()
	{
		
		return new BCryptPasswordEncoder();
	}

	@Bean
	public InternalResourceViewResolver viewresolver() {

		InternalResourceViewResolver i = new InternalResourceViewResolver();
		i.setPrefix("/WEB-INF/JSP/");
		i.setSuffix(".jsp");
		return i;

	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {

		LocalSessionFactoryBean sessionfactory = new LocalSessionFactoryBean();
		sessionfactory.setDataSource(datasource());
		sessionfactory.setHibernateProperties(getHibernateprop());
		sessionfactory.setPackagesToScan("com.think.Model");
		return sessionfactory;

	}

	public Properties getHibernateprop() {
		Properties p1 = new Properties();
		p1.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		p1.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		p1.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return p1;

	}

	public DriverManagerDataSource datasource() {

		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(environment.getRequiredProperty("jdbc.drivername"));
		datasource.setUrl(environment.getRequiredProperty("jdbc.url"));
		datasource.setUsername(environment.getRequiredProperty("jdbc.username"));
		datasource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return datasource;
	}

	@Bean
	public HibernateTransactionManager transactionmanager(SessionFactory ob) {
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(ob);
		return tx;

	}

}