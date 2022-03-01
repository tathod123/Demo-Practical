package com.cake.service;

import java.util.List;

import com.cake.model.Cake;

public interface CakeService {
	
	boolean addCake(Cake cakeobj);
	boolean updateCake(Cake cakeobj);
	boolean deleteCake(int cakeid);
	List <Cake> ShowCakeList();
	Cake SearchCakeById(int cakeid);
	List<Cake>searchCakeByName(String cakename);
	List<Cake>searchCakeByCategory(String cakecategory);


}
