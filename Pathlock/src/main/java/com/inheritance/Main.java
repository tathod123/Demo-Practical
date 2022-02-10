package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session Session=sf.openSession();
		Transaction tx=Session.beginTransaction();
		
		Teacher t =new Teacher(1,"kavita");
		PermanentTeacher p=new PermanentTeacher(2,"shubham",20000);
		VistingTeacher v=new VistingTeacher(3,"Guari",2,1500);
		
		Session.save(t);
		Session.save(p);
		Session.save(v);

		tx.commit();

	}

}
