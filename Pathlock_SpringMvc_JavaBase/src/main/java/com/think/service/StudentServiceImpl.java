package com.think.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.think.Dao.StudentDao;
import com.think.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentDao sdao;
	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		return sdao.insertStudent(s);
	}
	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return sdao.getAllStudents();
	}
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sdao.getStudentById(id);
	}
	@Override
	public boolean deleteStudent(Student s) {
		// TODO Auto-generated method stub
		return sdao.deleteStudent(s);
	}
}
