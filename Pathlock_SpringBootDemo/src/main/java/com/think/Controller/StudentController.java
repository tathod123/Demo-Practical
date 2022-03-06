package com.think.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.think.Model.Student;
import com.think.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
	
	@PostMapping("/students")
	public ResponseEntity<Void> addStudent(@RequestBody Student s1 )
	{
		studentservice.insertStudent(s1);
	   return new ResponseEntity<Void>(HttpStatus.OK);
	   
	}
	
	/*@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int sid)
	{
	Optional<Student> o= studentservice.findtById(sid);
	if(o.isPresent())
		return new ResponseEntity<Student>(o.get(),HttpStatus.OK);
     else
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		
	}*/
	
	
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Void> deleteStud(@PathVariable("id") int sid)
	{
		System.out.println("innn");
		try
		{
		studentservice.deleteStudentById(sid);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	/*@GetMapping("/students/{id}")	
	public Student getStud(@PathVariable("id") int sid)
	{
		System.out.println("******"+sid);
		return studentservice.getStudentById(sid);
	}*/
	
	@GetMapping("/students/city/{city}")
	public List<Student> getByCity(@PathVariable("city") String city)
	{
		return studentservice.findByCity(city);
		
	}
	@GetMapping("/students/percent/{per}")
	public List<Student> getByPercent(@PathVariable("per") int per)
	{
		return studentservice.findByPercentGreaterThan(per);
		
	}
	@GetMapping("/students/sortpercent")
	public List<Student> sortBypercent()
	{
		return studentservice.sortByPercent();
		
	}
	
	
	
}
