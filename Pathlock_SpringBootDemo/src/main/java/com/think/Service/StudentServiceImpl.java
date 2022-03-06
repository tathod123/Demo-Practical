package com.think.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.StudentDao;
import com.think.Model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sdao;
	
	@Override
	public void insertStudent(Student s) {
		// TODO Auto-generated method stub
		sdao.save(s);
		
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		sdao.deleteById(id);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		sdao.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sdao.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return sdao.getById(id);
	}

	@Override
	public List<Student> findByCity(String city) {
		
		return sdao.findByCity(city);
	}

	@Override
	public List<Student> findByPercentGreaterThan(int percent) {
		
		return sdao.findByPercentGreaterThan(percent);
	}


	public List <Student> findByCityAndPercent(String city, int percent) {
		
		return sdao.findByCityAndPercent( city,  percent);
	}

	@Override
	public List<Student> sortByPercent() {
		// TODO Auto-generated method stub
		return sdao.sortByPercent();
	}

	
	

}
