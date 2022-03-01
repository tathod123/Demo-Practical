package com.cake.Dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cake.model.Cake;

@Repository
@Transactional
public class CakeDaoImpl implements CakeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addCake(Cake cakeobj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCake(Cake cakeobj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCake(int cakeid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cake> ShowCakeList() {
		Query <Cake> c=sessionFactory.getCurrentSession().createQuery("from Cake");
		List<Cake> cakelist=c.list();
		return cakelist;
	}

	@Override
	public Cake SearchCakeById(int cakeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> searchCakeByName(String cakename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> searchCakeByCategory(String cakecategory) {
		// TODO Auto-generated method stub
		return null;
	}

}
