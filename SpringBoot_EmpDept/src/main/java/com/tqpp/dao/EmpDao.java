package com.tqpp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tqpp.Model.Employee;

public interface EmpDao extends JpaRepository<Employee,Integer>
{
       @Query(value="select * from employee e inner join department d on e.deptid=d.deptid and department_name=:d",nativeQuery=true)
       public List<Employee> getEmpByDeptname(@Param("d") String dname); 
}
