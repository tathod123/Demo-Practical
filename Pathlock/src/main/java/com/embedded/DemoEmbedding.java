package com.embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoEmbedding {
	
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
		 cfg.configure();
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		 
		 Department d1=new Department();
		 d1.setDeptId(1001);
		 d1.setDeptName("Computer");

		Employee e1=new Employee();
		e1.setEid(101);
		e1.setName("shubham");
		e1.setCity("pune");
		e1.setDept(d1);
		 
		 //object save
		
		 s.save(e1);
		 
		 tx.commit();
	
	}
}

