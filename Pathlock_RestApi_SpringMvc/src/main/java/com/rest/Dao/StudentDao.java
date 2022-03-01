package com.rest.Dao;

import java.util.List;

import com.rest.model.Student;

public interface StudentDao {
	
	boolean insertStudent(Student s);
	boolean deleteStudent(Student s);
	boolean updateStudent(Student s);
	
	List<Student> getAllStudents();
	
	Student getStudentById(int id);


}
