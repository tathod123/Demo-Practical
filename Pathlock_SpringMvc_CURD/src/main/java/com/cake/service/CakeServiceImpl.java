package com.cake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cake.Dao.CakeDao;
import com.cake.model.Cake;


@Service
public class CakeServiceImpl implements CakeService {
	
	@Autowired
	private CakeDao cdao;

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
	
		return cdao.ShowCakeList();
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
