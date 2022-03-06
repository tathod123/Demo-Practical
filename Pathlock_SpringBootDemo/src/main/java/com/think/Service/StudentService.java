package com.think.Service;

import java.util.List;

import com.think.Model.Student;

public interface StudentService {
	
	void insertStudent(Student s);
	void deleteStudentById(int id);
	void updateStudent(Student s);
	
	List<Student> getAllStudents();
	
	Student getStudentById(int id);
	public List<Student> findByCity(String city);
	public List<Student> findByPercentGreaterThan(int percent);
	public List<Student> findByCityAndPercent(String city,int percent);

	public List<Student> sortByPercent();

	

}
