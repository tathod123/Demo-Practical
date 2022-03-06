package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.Model.Department;

public interface DepartmentDao extends JpaRepository<Department,Integer>
{

}
