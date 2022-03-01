package com.cake.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cake.model.Cake;
import com.cake.service.CakeService;

@Controller
public class CakeController {
	
	@Autowired
	private CakeService cakeservice;
	
	
	@GetMapping("/")
	public  ModelAndView run() {
		List<Cake> lst=cakeservice.ShowCakeList();
		 ModelAndView mv=new ModelAndView ("display");
		 mv.addObject("cakelist",lst);
		return mv;
		
	}
	
	

}
