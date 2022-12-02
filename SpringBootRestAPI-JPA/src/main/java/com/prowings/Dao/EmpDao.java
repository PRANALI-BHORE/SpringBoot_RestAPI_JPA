package com.prowings.Dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.prowings.Entity.Employee;


@Repository
public interface EmpDao extends CrudRepository<Employee,Integer>{
	public Employee findbyid(int id);
	
}
