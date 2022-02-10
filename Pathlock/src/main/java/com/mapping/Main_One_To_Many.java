package com.mapping;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main_One_To_Many {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
	 Collage c=new Collage(1212,"DYPian","Pune");

	
		Depatment d1=new Depatment(121,"Mechanical");
		Depatment d2=new Depatment(131,"Electrical");
		Depatment d3=new Depatment(141,"Civil");
		Depatment d4=new Depatment(151,"Computer");
		Depatment d5=new Depatment(161,"E&TC");
		
	    ArrayList<Depatment> al=new ArrayList<Depatment>();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		al.add(d5);
		
		c.setDeptlist(al);
		session.save(c);
		session.save(d1);
	    session.save(d2);
	    session.save(d3);
	    session.save(d4);
	    session.save(d5);
	    
      
       
    /*Collage cc1=session.get(Collage.class,1212);
		System.out.println(cc1);
		System.out.println(cc1.getCname());
		System.out.println("**********************************************");
        System.out.println(cc1.getDeptlist());
		
		
		//HQL
		/*Query q=session.createQuery("from Collage where depatment=civil");
		List<Depatment> KK=q.list();
		for(Depatment ss:KK) 
			System.out.println(ss);*/
		
         tx.commit();
         
		


	}

}
