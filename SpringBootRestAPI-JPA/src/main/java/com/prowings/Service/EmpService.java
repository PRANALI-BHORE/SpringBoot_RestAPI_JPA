package com.prowings.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.prowings.Controller.EmpController;
import com.prowings.Dao.EmpDao;
import com.prowings.Entity.Employee;

@Service
public class EmpService {
	
	@Autowired
	EmpDao empDao;
	
	public List<Employee> getAllEmp() {
		List<Employee> elist =(List<Employee>)this.empDao.findAll();
		return elist;
	}
	
	public Optional<Employee> getEmpById(int id) {
		Optional<Employee> em=empDao.findById(id);
		return em;
	}
	
	public Employee addEmp(Employee emp) {
		Employee result =empDao.save(emp);
		return result;
	}
	
	public void deleteEmp(int id) {
		empDao.deleteById(id);
	}
	
	public void updateEmp(Employee emp, int id) {
		emp.setId(id);
		empDao.save(emp);
		
	}
}
