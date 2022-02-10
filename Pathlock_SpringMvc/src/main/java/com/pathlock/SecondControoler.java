package com.pathlock;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecondControoler {

	@PostMapping("/one")
	public String m(HttpServletRequest request) {
		System.out.println("in one");
		request.setAttribute("name", "shubham");
		return "forword:/record";
	}
	
	@PostMapping("/record")
	public String m1() {
		
		return "record_2";
	}
}
