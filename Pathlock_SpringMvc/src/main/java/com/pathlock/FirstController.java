package com.pathlock;



import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import com.pathlock.model.Student;



@Controller
public class FirstController {
	
	/*@PostMapping("/Form_s")
	public String m(HttpServletRequest req,Model m) {
		System.out.println("i am running");
		String s1=req.getParameter("fname");
		String s2=req.getParameter("lname");
		String s3=req.getParameter("date");
		String s4=req.getParameter("email");
		String s5=req.getParameter("pass");
		long s6=Long.valueOf(req.getParameter("mobile"));
		String s7=req.getParameter("hobbies");
		String s8=req.getParameter("address");
		String s9=req.getParameter("education");
		
		m.addAttribute("u1", s1);
		m.addAttribute("u2", s2);
		m.addAttribute("u3", s3);
		m.addAttribute("u4", s4);
		m.addAttribute("u5", s5);
		m.addAttribute("u6", s6);
		m.addAttribute("u7", s7);
		m.addAttribute("u8", s8);
		m.addAttribute("u9", s9);


		return "record";//view	
	}*/
/*	@PostMapping("/Form_s")
	public ModelAndView m2(@RequestParam("fname") String a,@RequestParam("lname") String b,@RequestParam("date") String c,@RequestParam("email") String d,@RequestParam("pass") String e,@RequestParam("mobile") long f,@RequestParam("hobbies") String g,@RequestParam("address") String h,@RequestParam("education") String i)
	{
		System.out.println("i am 2 one");
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(a,b,c,d,e,f,g,h,i, i);
		al.add(s1);
		
		ModelAndView mv=new ModelAndView("record");
		//mv.setViewName("record");
		mv.addObject("studentRecord", al);
		return mv;
}*/
       @PostMapping("/Form_s")
      public ModelAndView m3(@RequestParam Map<String,String>map ){
         System.out.println("i am 3 one");
    	Student s1=new Student(map.get("fname"),map.get("lname"),map.get("date"),map.get("email"),map.get("pass"),Long.valueOf(map.get("mobile")),map.get("hobbies"),map.get("address"),map.get("education"), null);
		ArrayList<Student> al=new ArrayList<Student>();
    	ModelAndView mv=new ModelAndView("record");

		al.add(s1);
		mv.addObject("StudentRecord",al);
    	return mv;
}
       
	  /* @PostMapping("/Form_s")
       public ModelAndView m4(@ModelAttribute("xyz") Student s1) {
    	   System.out.println("i am 4 one");
       	ModelAndView mv=new ModelAndView("record");
       	mv.addObject("xyz",s1);
    	return mv;*/


    	   
       }
}


