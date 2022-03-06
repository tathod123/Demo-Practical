package com.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {

	

	public static void main(String[] args) {
		
	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring.collections.xml");
	   Engineering En=(Engineering) ac.getBean("En");
	   
	   System.out.println(En.getEcode());
	   System.out.println(En.getEcollage());
	   System.out.println(En.getFaculty());
	   System.out.println(En.getSubject());
	   System.out.println(En.getEcoursename());
	   System.out.println(En.getLibrary().getLcode());
	   System.out.println(En.getLibrary().getSection());
	//  Library l=(Library) ac.getBean("La");
	// System.out.println(l.getLcode());
	//  System.out.println(l.getSection());

	}

}
