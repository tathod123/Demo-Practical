package com.mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Many_To_Many {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session Session=sf.openSession();
		Transaction tx=Session.beginTransaction();
		
		Student_S s1=new Student_S(101,"BE-A","Shubham","Mech",null);
		Student_S s2=new Student_S(102,"SE-B","Shubham","Comp", null);
		Student_S s3=new Student_S(103,"TE-C","Shubham","MBA", null);
		Student_S s4=new Student_S(104,"FE-A","Shubham","BCA",null);
	

		ArrayList<Student_S> s=new ArrayList();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		Teacher t1=new Teacher(1,"shubham","Ntworking", s);
		Teacher t2=new Teacher(2,"gaurav","DataBase", s);
		Teacher t3=new Teacher(3,"Pratik","Java", s);
		Teacher t4=new Teacher(4,"Chetan","Python", s);
		
		  ArrayList<Teacher> t=new ArrayList<Teacher>();
		    t.add(t1);
		    t.add(t2);
		    t.add(t3);
		    t.add(t4);
		
		 //s1.setTech(t);
		// s2.setTech(t);
		// s3.setTech(t);
		 //s4.setTech(t);
		 
		Session.save(s1);
		Session.save(s2);
		Session.save(s3);
		Session.save(s4);

		
		Session.save(t1);
		Session.save(t2);
		Session.save(t3);
		Session.save(t4);	
		
	    
	    tx.commit();

	
}

}
