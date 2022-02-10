package com.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Main {

	public static void main(String[] args) {
		
		Student_ss s=new Student_ss("Guarva","VYWS","Mechanical");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session Session=sf.openSession();
		Transaction tx=Session.beginTransaction();
		Session.save(s);
		tx.commit();
		//Student ob=Session.get(Student.class, 102);
		

	}

}
