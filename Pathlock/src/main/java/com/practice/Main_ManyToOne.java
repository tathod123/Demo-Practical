package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Main_ManyToOne {
 
	public static void main (String[]arg) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	
    Dept d1=new Dept(101,"Quality","Anup");
	Dept d2=new Dept(102,"IT","Shubham");

	
    Emp e1=new Emp(1,"shubham","tathod",d1);
    Emp e2=new Emp(2,"anup","gurav",d1);
    Emp e3=new Emp(3,"vaishali","jadhav",d2);
    Emp e4=new Emp(4,"kavita","thorat",d2);
    
    session.save(d1);
    session.save(d2);
    session.save(e1);
    session.save(e2);
    session.save(e3);
    session.save(e4);
    
    Emp cc1=session.get(Emp.class,2);
		System.out.println(cc1);
		System.out.println(cc1.getEname());
		System.out.println("**********************************************");
        System.out.println(cc1.getElastname());

		
		System.out.println("---------------------------------------------------");
		Query q=session.createQuery("select  elastname from Emp");
		List<String> sk=q.list();
		for(String s:sk) {
			System.out.println(s);
		}
		
		System.out.println("=================================================================");
		
		Query a=session.createQuery("select  ename from Emp order by ename desc");
		List<String> kk=a.list();
		for(String r:kk) {
			System.out.println(r);
		}
		
		System.out.println("==================================================================");
		Query p=session.createQuery("from Emp");
		List<Emp> sp=p.list();
		for(Emp ss:sp) {
			System.out.println(ss);
		}
		
		System.out.println("====================================================================");
		
		Query v=session.createQuery("update Emp set elastname=:a where empid=:b");
		v.setString("a","Thakare");
		v.setInteger("b",4);
		v.executeUpdate();
		
		System.out.println("====================================================================");
		
		Query l=session.createQuery("select count(ename) from Emp");
		List<Integer> as=l.list();
		System.out.println(as);
		
		System.out.println("==================================================================");
		
		Query ll=session.createQuery("from Emp e inner join e.dept");
		List<Object[]> bb=ll.list();
		for(Object arr[]:bb) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(as);

		
		tx.commit();
	
	}
}

	





