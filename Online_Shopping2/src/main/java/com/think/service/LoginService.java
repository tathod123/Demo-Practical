package com.think.service;

import java.util.List;

import com.think.Model.Cart;

public interface LoginService {

	boolean addToCart(int cartid );
	List<Cart>myCart(String brand);
	boolean deletefromcart(int cartid);
}