package com.mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Many_To_One {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session Session=sf.openSession();
		Transaction tx=Session.beginTransaction();
		
		Country c=new Country(91,"Ind91","INDIA");

		
		State s1=new State(40,"MH","Maharshtra",c );
		State s2=new State(50,"GJ50","Gujrat",c );
		State s3=new State(60,"RJ60","Rajsthan",c );
		State s4=new State(70,"PN70","Panjab",c );
		State s5=new State(80,"MP80","Madhya_Pradesh",c );

		Session.save(c);
		Session.save(s1);
		Session.save(s2);
		Session.save(s3);
		Session.save(s4);
		Session.save(s5);
		
		tx.commit();

		

		



	}

}
