package com.think.service;

import java.util.List;

import com.think.model.Student;

public interface StudentService {
	
	boolean insertStudent(Student s);
	boolean deleteStudent(Student s);
	boolean updateStudent(Student s);
	
	List<Student> getAllStudents();
	
	Student getStudentById(int id);
	


}
