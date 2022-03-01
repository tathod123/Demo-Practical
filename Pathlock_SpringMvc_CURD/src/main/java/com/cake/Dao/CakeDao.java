package com.cake.Dao;

import java.util.*;

import com.cake.model.Cake;




public interface CakeDao {
	
	boolean addCake(Cake cakeobj);
	boolean updateCake(Cake cakeobj);
	boolean deleteCake(int cakeid);
	List <Cake> ShowCakeList();
	Cake SearchCakeById(int cakeid);
	List<Cake>searchCakeByName(String cakename);
	List<Cake>searchCakeByCategory(String cakecategory);



}
