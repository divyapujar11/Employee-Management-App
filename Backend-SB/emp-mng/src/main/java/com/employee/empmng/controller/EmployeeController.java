package com.employee.empmng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empmng.model.Employee;
import com.employee.empmng.repo.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return empRepo.findById(id).get();
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public String  deleteEmployee(@PathVariable Long id){
		empRepo.deleteById(id);
		return "employee deleted";
	}
}
