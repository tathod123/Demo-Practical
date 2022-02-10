package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_One_To_One {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session Session=sf.openSession();
		Transaction tx=Session.beginTransaction();
		
		IdentityCard ID=new IdentityCard(12345,54321,555);
		Person p=new Person(101,"shubham","Tathod",705780, ID);
		ID.setPerson(p);

		Session.save(ID);
		Session.save(p);
		tx.commit();
		
		


	}

}
