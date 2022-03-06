package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext c=new ClassPathXmlApplicationContext("spring_core.xml");
		Student ob=(Student) c.getBean("s1");
		System.out.println(ob);
		Student ob10=(Student) c.getBean("s1");
		System.out.println(ob10);
		Student ob11=(Student) c.getBean("s1");
		//by deafult scope is singleton-eagerly initialized only one object created when u call multiple beans
		System.out.println(ob10);
		System.out.println(ob.hashCode());
		System.out.println(ob10.hashCode());
		System.out.println(ob11.hashCode());

		Student ob1=(Student) c.getBean("s2");
		System.out.println(ob1);
		
		Student ob2=(Student) c.getBean("s3");
		System.out.println(ob2);
		
		//course oc1=(course) c.getBean("c1");
		//System.out.println(oc1);
		c.close();




	}

}
