package com.rest.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.Student;
import com.rest.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studservice;
	
	@ResponseBody
	@GetMapping(value="/students",produces="application/json")
    public List<Student> getAllStudents(){
	return studservice.getAllStudents();
		
	}
	/*@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public Student getStudentById(@PathVariable("rollno") int id) {
		System.out.println(id+" ");
		return getStudentById(id);
		
	}*/
	@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("rollno") int id) {
		System.out.println(id+" ");
		Student obj=studservice.getStudentById(id);
		if(obj==null)
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Student>(obj,HttpStatus.OK);
	}
	@ResponseBody
	@PostMapping(value="/students")
	public boolean addStudents(@RequestBody Student s) {
	System.out.println("=================="+s);
	studservice.insertStudent(s);
		return true;
	}
	
	/*@ResponseBody
	@DeleteMapping(value="/students/{id}")
	public boolean deleteStudent(@PathVariable("id") int sid) {
		
		Student s1=studservice.getStudentById(sid);
		studservice.deleteStudent(s1);
		return true;
	
	}*/
	@ResponseBody
	@DeleteMapping(value="/students/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("id") int sid) {
		
		Student s1=studservice.getStudentById(sid);
		studservice.deleteStudent(s1);
		return new ResponseEntity<>(HttpStatus.OK);
	}
		
	@ResponseBody
	@PutMapping(value="/students/{sid}")
	public boolean updateStudent(@PathVariable("sid") int sid, @RequestBody Student s) {
		studservice.updateStudent(s);
		return true;
	}
	
	/*@ResponseBody
	@GetMapping("/")
	public ArrayList<Student> getStudent() {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(1,"Shubham",90,"mumbai");
		al.add(s1);	
		al.add(new Student(2,"Ankit",85,"Yavtmal"));
		al.add(new Student(3,"Pooja",76,"Washim"));
		al.add(new Student(4,"Shubham",88,"Akola"));
		al.add(new Student(5,"Akash",85,"Nashik"));
		return al;
		
	}
	@ResponseBody
	@GetMapping(value="/getall",produces="application/json")
	public HashMap<String,Student> m2(){
	HashMap<String,Student> Hm=new HashMap<>();
	Hm.put("Ankit",new Student(2,"Ankit",85,"Yavtmal"));
	Hm.put("Pooja",new Student(3,"Pooja",76,"Washim"));

	
	return Hm;*/
	


}