package com.tqpp.Controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tqpp.Model.Employee;
import com.tqpp.service.EmpService;

@RestController
public class EmpController 
{
 
	@Autowired
	private EmpService eservice;
	
	//@RequestMapping(value="/emp",method=RequestMethod.POST)
	@PostMapping("/emp")
	public void addEmp(@RequestBody Employee ob)
	{
		eservice.insertEmployee(ob);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAll()
	{
		return eservice.getAllEmployees();
		
	}
	
	@GetMapping("/employees/dept/{dname}")
	public List<Employee> getByDeptName(@PathVariable String dname)
	{
		return eservice.getEmpByDeptname(dname);
		
	}
}
