package com.prowings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.Dao.EmpDao;
import com.prowings.Entity.Employee;
import com.prowings.Service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		List<Employee> elist=empService.getAllEmp();
		return elist;
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		Employee em= empService.getEmpById(id);
		return em;
	}
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		String s=null;
		System.out.println(s.charAt(0));
		Employee em =empService.addEmp(emp);
		return em;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		empService.deleteEmp(id);
		return "Deleted successfully!!!";
	}
	
	@PutMapping("/updateEmployeeById/{id}")
	public String updateEmployeeById(@RequestBody Employee emp,@PathVariable("id") int id) {
		empService.updateEmp(emp, id);
		return "Updated successfully!!!";
	}
	
}
