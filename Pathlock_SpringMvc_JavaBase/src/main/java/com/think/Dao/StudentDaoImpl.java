package com.think.Dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.think.model.Student;


@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		return true;
	}

	@Override
	public boolean deleteStudent(Student s) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(s);

		return true;
	}
	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		Query<Student> q=sessionFactory.getCurrentSession().createQuery("from Student");
		List<Student> studlist=q.list();
		System.out.println("-----------------------------------------"+studlist);
		return studlist;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Student.class, id);

	}
	
	
}